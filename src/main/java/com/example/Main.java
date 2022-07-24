package com.example;

import chariot.Client;

public class Main {

    public static void main(String... args) throws Exception {

        var client = Client.basic();

        String message = client.teams().byTeamId("lichess-swiss")
            .map(team -> "Team %s has %d members!".formatted(team.name(), team.nbMembers()))
            .orElse("Didn't find team");

        System.out.println(message);
    }
}
