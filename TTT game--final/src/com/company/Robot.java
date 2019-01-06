package com.company;

import java.util.Random;

public class Robot extends Player {

    public Robot(String name, String marker) {

        super(name, marker);

    }

    @Override
    public Integer playerTurn() {

        System.out.println();
        Random rand = new Random();
        int random = rand.nextInt(9) + 1;
        return random;

    }
}
