package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Tic Tac Toe börjar nu!\n");
        game.play();
        game.getAnswer();
        if(game.getAnswer().equals("ja")) {
            game.play();
            game.getAnswer();
        }
    }
}
