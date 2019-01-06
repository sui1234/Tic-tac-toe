package com.company;

import java.util.Scanner;

public class Human extends Player {

    public Human(String name, String marker) {

        super(name, marker);

    }

    @Override
    public Integer playerTurn() {

        System.out.println(", vilken ruta(1-9)?\n");

        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        return userInput;
    }
}
