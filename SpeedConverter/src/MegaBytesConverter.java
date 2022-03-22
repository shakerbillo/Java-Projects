public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kilobytes){
        if (kilobytes < 0){
            System.out.println("Invalid Value");


        }else{
            int megaBytes = kilobytes / 1024;
            int remainder = kilobytes % 1024;
            System.out.println(kilobytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }

    }
}
