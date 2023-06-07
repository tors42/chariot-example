package com.example;

import chariot.Client;

public class Main {

    public static void main(String... args) throws Exception {

        var client = Client.basic();

        String message = client.teams().byTeamId("lichess-swiss")
            .map(team -> "Team %s has %d members!".formatted(team.name(), team.nbMembers()))
            .orElse("Didn't find team");

        System.out.println(message);


        chariot.util.Board board = chariot.util.Board.fromStandardPosition();

        String move1 = "d2d4";
        String san1 = board.toSAN(move1);
        board = board.play(move1);

        String move2 = "d7d5";
        String san2 = board.toSAN(move2);
        board = board.play(move2);

        String move3 = "b1c3";
        String san3 = board.toSAN(move3);
        board = board.play(move3);


        System.out.println("san1: " + san1);
        System.out.println("san2: " + san2);
        System.out.println("san3: " + san3);

    }
}
