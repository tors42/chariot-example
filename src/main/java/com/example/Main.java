package com.example;

import chariot.Client;

public class Main {

    public static void main(String... args) throws Exception {

        try (var client = Client.basic()) {

            var user = client.users().byId("lichess").get();

            System.out.println("User %s is %s".formatted(user.username(), user.online() ? "online" : "not online"));
        }

    }

}
