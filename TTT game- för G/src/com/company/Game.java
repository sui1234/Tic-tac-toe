package com.company;

import java.util.Scanner;

public class Game {

    Board board;
    Player player1;
    Player player2;
    String answer;

    public String getAnswer() {
        return answer;
    }

    public void play() {

        board = new Board();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mata in namn av spelare X: ");
        String name1 = sc.next();
        System.out.println("Mata in namn av spelare O: ");
        String name2 = sc.next();


        player1 = new Player(name1, "X");
        player2 = new Player(name2, "O");



        board.drawboard();
        boolean winner = false;
        while (board.isBoardFull() == false && winner == false) {
            // if board is not full then user1 inputs number, check if he is winner.
            if (board.isBoardFull() == false && winner == false) {
                while (true) {                                            //check if place is occupied.
                    System.out.print("Spelare " + player1.getName());
                    int i = player1.playerTurn();                         //player inputs number
                    if (board.isPlaceOccupied(i - 1) == false) {           // if the place is not occupied
                       board.getBoard()[i-1] = "X";           //set marker and name i the array

                        board.drawboard();
                        board.checkWinner();
                        if (board.checkWinner() == true) {
                            System.out.println(player1.getName() + " är vinnare! Grattis!\n");
                            winner = true;
                            System.out.println("Vill ni spela en gång till: (ja eller nej)\n");
                            answer = sc.nextLine();   // users answer to check if they want to play again
                            break;
                        }
                        break;
                    } else {
                        System.out.println("platsen " + (i) + " är ockuperad.\n");
                    }
                }
            }

            //if board is not full and user2 inputs number, check if he is winner.

            if (board.isBoardFull() == false && winner == false) {
                while (true) {
                    System.out.print("Spelare " + player2.getName());
                    int i = player2.playerTurn();
                    if (board.isPlaceOccupied(i - 1) == false) {
                        board.getBoard()[i-1] = "O";

                        board.drawboard();
                        board.checkWinner();
                        if (board.checkWinner() == true) {
                            System.out.println(player2.getName() + " är vinnare! Grattis\n");
                            winner = true;
                            System.out.println("Vill ni spela en gång till: (ja eller nej)\n");
                            answer = sc.nextLine();
                            break;
                        }
                        break;
                    } else {
                        System.out.println("platsen " + (i) + " är ockuperad.\n");
                    }
                }

            }
            // if board is full
            else {
                // and there is not a winner
                if (board.checkWinner() == false) {
                    System.out.println("Det är oavgjort !\n");
                    System.out.println("Vill ni spela en gång till: (ja eller nej)\n ");
                    winner = true;
                    answer = sc.nextLine();


                    break;
                }
            }
        }

    }
}


