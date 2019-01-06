package com.company;

import java.util.Scanner;
import java.util.Random;

public abstract class Player {
    protected String name;
    protected String marker;
    protected int score = 0;


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

    public abstract Integer playerTurn();


    public int increaseScore(){
        score += 1;
        return score;
    }
}