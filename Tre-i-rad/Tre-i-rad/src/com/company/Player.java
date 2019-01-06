package com.company;

import java.util.Scanner;

public class Player extends Board {
    private String player ;
    private int userInput;
    private String turn = "X";




    public void playerTurn() {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Spelare " + turn + " , vilken ruta (1-9)?");
            userInput = sc.nextInt();
            int a = userInput - 1;
            board[a] = turn;
            Board b = new Board();
           /* if (b.checkWinner(a)){
                run = false;
                System.out.println("kk");
            }*/

            drawBoard();
            if (turn == "X") {
                turn = "O";
            } else {
                turn = "X";
            }
        }

    }



       /* String stringUserInput = new Integer(a).toString();

            Board b = new Board();
            for (int i = 0; i < board.length; i++) {
            if (board[i].equals(stringUserInput) && b.full()) {
                board[i] = "X";
                turn = board[i];
                b.drawBoard();
                if (turn.equals("X")) {
                    turn = "O";
                    System.out.println("Spelare " + turn +" , vilken ruta (1-9)? ");

                } /*else {
                    turn = "X";
                }
            }
        }
        return turn;
    }*/
}
