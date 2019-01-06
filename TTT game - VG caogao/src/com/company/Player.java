package com.company;

import java.util.Scanner;
import java.util.Random;

public class Player {
    String name;
    String marker;
    int score = 0;


    public Player(String name, String marker) {
        this.name = name;
        this.marker = marker;
    }

    public String getName() {
        return name;
    }

    public String getMarker() {
        return marker;
    }


    public Integer playerTurn() {

        System.out.println(", vilken ruta(1-9)?\n");

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        return Integer.parseInt(userInput);
    }

    public Integer randomNumber(){


        Random rand = new Random();
        int n = rand.nextInt(9) + 1;
        return n;
    }

    public int increaseScore(){
        score += 1;
        return score;
    }
}