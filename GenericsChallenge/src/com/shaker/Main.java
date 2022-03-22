package com.shaker;


import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    // ArrayList<Tram teams;
        // Collections.sort(teams);

        League<Team<FootballPlayer>> footballLeague = new League<>("GFL");

        Team<FootballPlayer> temaunited = new Team<>("Tema United");
        Team<FootballPlayer> accrawarriors = new Team<>("Accra Warriors");
        Team<FootballPlayer> tamaleallstars= new Team<>("Tamale AllStars");
        Team<FootballPlayer> kumasininjas = new Team<>("Kumasi Ninjas");

        Team<BasketballPlayer> lalakers = new Team<>("Los Angeles Lakers");

        tamaleallstars.matchResult(kumasininjas, 4, 0);
        tamaleallstars.matchResult(temaunited, 6, 8);

        temaunited.matchResult(kumasininjas, 8, 1);
        temaunited.matchResult(tamaleallstars, 5, 5);

        footballLeague.add(temaunited);
        footballLeague.add(tamaleallstars);
        footballLeague.add(accrawarriors);
        footballLeague.add(kumasininjas);

        footballLeague.showLeagueTable();

        BasketballPlayer james = new BasketballPlayer("Lebron James");
        SoccerPlayer ronaldo = new SoccerPlayer("Cristiano Ronaldo");

//        Team rawTeam = new Team("Raw Team");
//        rawTeam.addPlayer(ronaldo); // unchecked warning
//        rawTeam.addPlayer(james);     // unchecked warning
//
//        footballLeague.add(rawTeam);     // unchecked warning
//
//        League<Team> rawLeague = new League<>("Raw");
//        rawLeague.add(temaunited);     // no warning
//        rawLeague.add(lalakers);    // no warning
//        rawLeague.add(rawTeam);         // no warning
//
//        League reallyRaw = new League("Really raw");
//        reallyRaw.add(temaunited);     // unchecked warning
//        reallyRaw.add(lalakers);    // unchecked warning
//        reallyRaw.add(rawTeam);         // unchecked warning

    }
}
