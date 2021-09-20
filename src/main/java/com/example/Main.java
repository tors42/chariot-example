package com.example;

import chariot.Client;

public class Main {

    public static void main(String... args) throws Exception {

        var client = Client.basic();

        var result = client.teams().byTeamId("lichess-swiss");

        result.ifPresent(team -> System.out.printf("Team %s has %d members!%n", team.name(), team.nbMembers()));
    }

}
