package com.example;

import chariot.Client;

public class Main {

    void main() {
        var client = Client.basic();

        String message = client.teams().byTeamId("lichess-swiss").maybe()
            .map(team -> "Team %s has %d members!".formatted(team.name(), team.nbMembers()))
            .orElse("Didn't find team");

        IO.println(message);
    }
}
