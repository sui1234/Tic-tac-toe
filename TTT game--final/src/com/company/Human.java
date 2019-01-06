package com.company;

import java.util.Scanner;

public class Human extends Player {

    public Human(String name, String marker) {

        super(name, marker);

    }

    @Override
    public Integer playerTurn() {
        int userInput = 0;
        System.out.println(", vilken ruta(1-9)?\n");

        while (true) {

            Scanner sc = new Scanner(System.in);
            userInput = sc.nextInt();

            if (0 < userInput && userInput < 10) {
                break;
            } else {
                System.out.println( "Ogiltigt nummer, och varsågod mata igen:  ");
            }

        }
        return userInput;
    }
}
