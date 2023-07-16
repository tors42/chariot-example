package com.example;

import java.util.List;

import chariot.Client;
import chariot.model.User;

public class Main {

  public static void main(String... args) throws Exception {

    var client = Client.basic();

    // List<User> list = client.bot().botsOnline(5).stream()
    // .toList();
    //
    // list.forEach(System.out::println);

    String message = client.teams().byTeamId("lichess-swiss")
        .map(team -> "Team %s has %d members!".formatted(team.name(), team.nbMembers()))
        .orElse("Didn't find team");

    System.out.println(message);
  }
}
