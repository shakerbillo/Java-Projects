package com.shaker;

public class Main {

    public static void main(String[] args) {
        FootballPlayer agyei = new FootballPlayer("Agyei Kissi");
        BasketballPlayer james = new BasketballPlayer("Lebron James");
        SoccerPlayer ronaldo = new SoccerPlayer("Cristiano Ronaldo");

        Team<FootballPlayer> temaunited = new Team<>("Tema United");
        temaunited.addPlayer(agyei);
        System.out.println(temaunited.numPlayers());

        Team<BasketballPlayer> lalakers = new Team<>("Los Angeles Lakers");
        lalakers.addPlayer(james);
        System.out.println(lalakers.numPlayers());

        Team<SoccerPlayer> manchesterunited = new Team<>("Manchester United");
        manchesterunited.addPlayer(ronaldo);
        System.out.println(manchesterunited.numPlayers());


        Team<FootballPlayer> accrawarriors = new Team<>("Accra Warriors");
        FootballPlayer eboappiah = new FootballPlayer("Ebo Appiah");
        accrawarriors.addPlayer(eboappiah);

        Team<FootballPlayer> tamaleallstars= new Team<>("Tamale AllStars");
        Team<FootballPlayer> kumasininjas = new Team<>("Kumasi Ninjas");

        tamaleallstars.matchResult(kumasininjas, 4, 0);
        tamaleallstars.matchResult(temaunited, 6, 8);

        temaunited.matchResult(kumasininjas, 8, 1);
        temaunited.matchResult(tamaleallstars, 5, 5);


        System.out.println("Rankings");
        System.out.println(temaunited.getName() + ": " + temaunited.ranking());
        System.out.println(accrawarriors.getName() + ": " + accrawarriors.ranking());
        System.out.println(tamaleallstars.getName() + ": " + tamaleallstars.ranking());
        System.out.println(kumasininjas.getName() + ": " + kumasininjas.ranking());

        System.out.println(temaunited.compareTo(accrawarriors));
        System.out.println(temaunited.compareTo(tamaleallstars));
        System.out.println(tamaleallstars.compareTo(temaunited));
        System.out.println(kumasininjas.compareTo(accrawarriors));


    }
}
