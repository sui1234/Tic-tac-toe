package com.company;

import java.util.Scanner;

public class GameG {

    Board board;
    Player player1;
    Player player2;
    String answer;

    public String getAnswer() {
        return answer;
    }

    public void play() {

        board = new Board();
        player1 = new Player("x", "X");
        player2 = new Player("o", "O");

        Scanner sc = new Scanner(System.in);
        board.drawboard();

        while (board.isBoardFull() == false) {
            // if board is not full and user1 inputs number, then check if he is winner.
            System.out.print("Spelare " + player1.getName());
            int i = player1.playerTurn();                      //player input number

            //board.setBoard((i - 1), player1.name);            //set marker and name i array

            board.drawboard();
            board.checkWinner();
            if (board.checkWinner() == true) {
                System.out.println(player1.getName() + " är vinnare! Grattis!\n");
                System.out.println("Vill ni spela en gång till: (ja eller nej)\n");

                answer = sc.nextLine();                       // users answer to check if they want to play again
                break;
            }


            //if board is not full and user2 inputs number, check if he is winner.
            if (board.isBoardFull() == false) {

                System.out.print("Spelare " + player2.getName());
                int j = player2.playerTurn();

                //board.setBoard((j - 1), player2.name);


                board.drawboard();
                board.checkWinner();
                if (board.checkWinner() == true) {
                    System.out.println(player2.getName() + " är vinnare! Grattis\n");
                    System.out.println("Vill ni spela en gång till: (ja eller nej)\n");

                    answer = sc.nextLine();
                    break;
                }
            }

            // if board is full
            else {
                // and there is not a winner
                if (board.checkWinner() == false) {
                    System.out.println("Det är oavgjort !\n");
                    System.out.println("Vill ni spela en gång till: (ja eller nej)\n ");

                    answer = sc.nextLine();

                    break;
                }
            }
        }
    }
}


