package com.shaker;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Pipe;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            Pipe pipe = Pipe.open();

            Runnable writer = new Runnable() {
                @Override
                public void run() {
                    try {
                        Pipe.SinkChannel sinkChannel = pipe.sink();
                        ByteBuffer buffer = ByteBuffer.allocate(56);

                        for(int i=0; i<10; i++) {
                            String currentTime = "The time is: " + System.currentTimeMillis();

                            buffer.put(currentTime.getBytes());
                            buffer.flip();

                            while(buffer.hasRemaining()) {
                                sinkChannel.write(buffer);
                            }
                            buffer.flip();
                            Thread.sleep(100);

                        }

                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            };


            Runnable reader = new Runnable() {
                @Override
                public void run() {

                    try {
                        Pipe.SourceChannel sourceChannel = pipe.source();
                        ByteBuffer buffer = ByteBuffer.allocate(56);

                        for(int i=0; i<10; i++) {
                            int bytesRead = sourceChannel.read(buffer);
                            byte[] timeString = new byte[bytesRead];
                            buffer.flip();
                            buffer.get(timeString);
                            System.out.println("Reader Thread: " + new String(timeString));
                            buffer.flip();
                            Thread.sleep(100);
                        }

                    } catch(Exception e) {
                        e.printStackTrace();
                    }

                }
            };

            new Thread(writer).start();
            new Thread(reader).start();

        } catch(IOException e) {
            e.printStackTrace();
        }



//	try(FileOutputStream binFile = new FileOutputStream(("data.dat"));
//        FileChannel binChannel = binFile.getChannel()){
//
//        ByteBuffer buffer = ByteBuffer.allocate(100);
//
//
////            read(ByteBuffer) - reads bytes beginning at the channel's current position, and after the read,
////                               updates the position accordingly.
////                               Note that now we're talking about the channel's position, not the byte buffer's position.
////                               Of course, the bytes will be placed into the buffer starting at its current position.
////            write(ByteBuffer) - the same as read, except it writes. There's one exception.
////                              If a datasource is opened in APPEND mode, then the first write will take place starting
////                              at the end of the datasource, rather than at position 0. After the write, the position
////                              will be updated accordingly.
////            position() - returns the channel's position.
////            position(long) - sets the channel's position to the passed value.
////            truncate(long) - truncates the size of the attached datasource to the passed value.
////            size() - returns the size of the attached datasource
//
//        try (FileOutputStream binFile = new FileOutputStream("data.dat");
//             FileChannel binChannel = binFile.getChannel()) {
//
//            ByteBuffer buffer = ByteBuffer.allocate(100);
//
//
//            byte[] outputBytes = "Hello World!".getBytes();
//            buffer.put(outputBytes);
//            long int1Pos = outputBytes.length;
//            buffer.putInt(245);
//            long int2Pos = int1Pos + Integer.BYTES;
//            buffer.putInt(-98765);
//            byte[] outputBytes2 = "Nice to meet you".getBytes();
//            buffer.put(outputBytes2);
//            long int3Pos = int2Pos + Integer.BYTES + outputBytes2.length;
//            buffer.putInt(1000);
//            buffer.flip();
//
//            binChannel.write(buffer);
//
//
//            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
//            FileChannel channel = ra.getChannel();
//
//            ByteBuffer readBuffer = ByteBuffer.allocate(Integer.BYTES);
//            channel.position(int3Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//
//            System.out.println("int3 = " + readBuffer.getInt());
//            readBuffer.flip();
//            channel.position(int2Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//
//            System.out.println("int2 = " + readBuffer.getInt());
//            readBuffer.flip();
//            channel.position(int1Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//
//            System.out.println("int1 = " + readBuffer.getInt());
//
//            RandomAccessFile copyFile = new RandomAccessFile("datacopy.dat", "rw");
//            FileChannel copyChannel = copyFile.getChannel();
//            channel.position(0);
////            long numTransferred = copyChannel.transferFrom(channel, 0, channel.size());
//            long numTransferred = channel.transferTo(0, channel.size(), copyChannel);
//            System.out.println("Num transferred = " + numTransferred);
//
//            channel.close();
//            ra.close();
//            copyChannel.close();
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//    }

    }
}
