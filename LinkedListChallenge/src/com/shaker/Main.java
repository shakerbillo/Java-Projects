package com.shaker;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("All Eyez On Me", "2Pac");
        album.addSong("All Eyez On Me", 5.23);
        album.addSong("Ambitionz Az A Ridah", 4.38);
        album.addSong("I Ain't Mad At Cha", 3.34);
        album.addSong("Can't C Me", 5.55);
        album.addSong("Only God Can Judge Me", 6.45);
        album.addSong("Life Goes On", 4.28);
        album.addSong("No More Pain", 4.58);
        album.addSong("All About You", 6.28);
        album.addSong("How Do U Want It", 5.34);
        album.addSong("California Love", 5.46);
        album.addSong("All Eyez On Me", 5.08);
        album.addSong("Skandalouz", 4.08);
        albums.add(album);

        album = new Album("Legend: The Best of Bob Marley & The Wailers", "Bob Marley & The Wailers" );
        album.addSong("Is This Love", 3.53);
        album.addSong("Could You Be Loved", 4.33);
        album.addSong("Stir It Up", 4.08);
        album.addSong("Three Little Birds", 3.53);
        album.addSong("Get up, Stand Up", 2.53);
        album.addSong("One Love, People Get Ready", 3.53);
        album.addSong("Satisfy My Soul", 4.36);
        album.addSong("No Woman, No Cry", 5.45);
        album.addSong("Redemption Song", 3.55);
        album.addSong("I Shot the Sheriff", 4.45);
        album.addSong("Buffalo Soldier", 4.15);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("No More Pain", playlist);
        albums.get(0).addToPlaylist("California Love", playlist);
        albums.get(0).addToPlaylist("All Eyez On Me", playlist);
        albums.get(0).addToPlaylist("Keep Ya Head Up", playlist); // does not exist
        albums.get(0).addToPlaylist(6, playlist);
        albums.get(0).addToPlaylist(5, playlist);
        albums.get(0).addToPlaylist(2, playlist);
        albums.get(0).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(5, playlist);
        albums.get(1).addToPlaylist(6, playlist);
        albums.get(1).addToPlaylist(7, playlist);
        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(14, playlist); // There's no track 14

        play(playlist);



    }
        private static void play(LinkedList<Song> playList){
            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            boolean forward = true;
            ListIterator<Song> listIterator = playList.listIterator();
            if(playList.size() == 0){
                System.out.println("No songs in playlist");
                return;
            }else{
                System.out.println("Now playing " + listIterator.next().toString());
                printMenu();
            }
            while (!quit){
                int action = scanner.nextInt();
                scanner.nextLine();

                switch(action){
                    case 0:
                        System.out.println("Playlist complete.");
                        quit = true;
                        break;
                    case 1:
                        if(!forward){
                            if(listIterator.hasNext()){
                                listIterator.next();
                            }
                            forward = true;
                        }
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                        }else {
                            System.out.println("We have reached end of the playlist");
                            forward = false;
                        }
                        break;
                    case 2:
                        if(forward){
                            if(listIterator.hasPrevious()){
                                listIterator.hasPrevious();
                            }
                            forward = false;
                        }
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }else {
                            System.out.println("We are at the start of the playlist");
                            forward = true;
                        }
                        break;
                    case 3:
                        if(forward){
                            if(listIterator.hasPrevious()){
                                System.out.println("Now replaying " + listIterator.previous().toString());
                                forward = false;
                            }else {
                                System.out.println("We are  at the start of the list");
                            }
                        }else{
                                if(listIterator.hasNext()){
                                    System.out.println("Now replaying " + listIterator.next().toString());
                                    forward = true;
                                }else{
                                    System.out.println("We have reached the end of the list");
                                }

                        }
                        break;
                    case 4:
                        printList(playList);
                        break;
                    case 5:
                        printMenu();
                        break;

                    case 6:
                        if(playList.size() > 0){
                            listIterator.remove();
                            if(listIterator.hasNext()){
                                System.out.println("Now playing " + listIterator.next());
                            }else if (listIterator.hasPrevious()){
                                System.out.println("Now playing " + listIterator.previous() );
                            }
                        }
                            break;


                }
            }
        }
                private static void printMenu(){
                    System.out.println("Available action\npress");
                    System.out.println("0 - to quit\n" +
                                    "1 - to play next song\n" +
                                    "2 - to play previous song\n" +
                                    "3 - to replay the current song\n" +
                                    "4 - list songs in the playlist\n" +
                                    "5 - print available actions." +
                                    "6 - delete current song from playlist");
                }
                private static void printList(LinkedList<Song> playlist){
                    Iterator<Song> iterator = playlist.iterator();
                    System.out.println("====================================");
                    while(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    System.out.println("====================================");
                }
}
