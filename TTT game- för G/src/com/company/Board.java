package com.company;

import java.util.ArrayList;

public class Board {
    private String[] board;

    public Board() {

        board = new String[9];
        resetBoard();

    }

    public void resetBoard() {

      /*for(String i : board ) {
           i = "-";
       }*/
        for (int i = 0; i < board.length; i++)
            board[i] = "-";
    }


    public String[] getBoard() {
        return board;
    }

    /*public void setBoard(Integer i, String name) {
        if (name.equals(player1.getName())) {
            board[i] = "X";
        } else{
            board[i] = "O";
        }
    }
*/
    public void drawboard() {
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("----------");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---------- ");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();

    }

    public boolean checkWinner() {

        boolean checkWinner = false;

        if (board[0].equals(board[1]) && board[1].equals(board[2]) && !board[0].equals("-")) {
            checkWinner = true;
        } else if (board[3].equals(board[4]) && board[4].equals(board[5]) && !board[3].equals("-")) {
            checkWinner = true;
        } else if (board[6].equals(board[7]) && board[7].equals(board[8]) && !board[6].equals("-")) {
            checkWinner = true;
        } else if (board[0].equals(board[3]) && board[3].equals(board[6]) && !board[0].equals("-")) {
            checkWinner = true;
        } else if (board[1].equals(board[4]) && board[4].equals(board[7]) && !board[1].equals("-")) {
            checkWinner = true;
        } else if (board[2].equals(board[5]) && board[5].equals(board[8]) && !board[2].equals("-")) {
            checkWinner = true;
        } else if (board[0].equals(board[4]) && board[4].equals(board[8]) && !board[0].equals("-")) {
            checkWinner = true;
        } else if (board[2].equals(board[4]) && board[4].equals(board[6]) && !board[2].equals("-")) {
            checkWinner = true;
        }
        return checkWinner;

    }

    public boolean isPlaceOccupied(Integer i) {
        boolean isPlaceOccupied = true;

        if (board[i] == "-") {
            isPlaceOccupied = false;
        }

        return isPlaceOccupied;
    }


    public boolean isBoardFull() {
        boolean isBoardFull = true;
        for (int i = 0; i < board.length; i++) {

            if (board[i] == "-") {
                isBoardFull = false;
            }

        }
        return isBoardFull;
    }



/*public void populateEmptyBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i+1);
        }
    }*/


}
