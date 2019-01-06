package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Varsågod att välja 1--spela med dator 2-- spela med människor");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();

        if(choose == 1){

           GameDatorAndHuman game = new GameDatorAndHuman();
           game.play();
        }
        else if(choose == 2){

            Game game = new Game();
            game.play();

        }else{
            System.out.println("Mata in igen");
        }



    }
}
