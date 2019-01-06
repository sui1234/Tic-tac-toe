package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;

public class Board {
    protected String[] board = new String[9];
    //private String c = null;


    public void drawBoard() {

        System.out.println("|" + board[0] + "|" + board[1] + "|" + board[2] + "|");
        System.out.println("|" + board[3] + "|" + board[4] + "|" + board[5] + "|");
        System.out.println("|" + board[6] + "|" + board[7] + "|" + board[8] + "|");
    }

  /*  public Boolean checkWinner(int a) {
         if (board[a] == board[0] && board[0] == board[1] && board[1] == board[2])




            //  String[] a = new String[]{board[0], board[1], board[2]};

       //    for (int i = 0; i < a.length; i++) {

           //     if (board [0] == board[1] &&  board[0] == board[2] && board[0] == board[b] )
                return true;

        return false;

    }


/*
        String[] a = new String[]{board[0], board[1], board[2]};
        String[] b = new String[]{board[3], board[4], board[5]};
        String[] c = new String[]{board[6], board[7], board[8]};
        String[] d = new String[]{board[0], board[3], board[6]};
        String[] e = new String[]{board[1], board[4], board[7]};
        String[] f = new String[]{board[2], board[5], board[8]};
        String[] g = new String[]{board[0], board[4], board[8]};
        String[] h = new String[]{board[2], board[4], board[6]};

        String x = "XXX";
        String o = "OOO";

        String[][] winner = new String[][]{a, b, c, d, e, f, g, h};
        for (int i = 0; i < winner.length; i++) {
            if (winner[i].equals(x) || winner[i].equals(o))
                return true;

        }
        return false;

    }

    public boolean full() {
        boolean full = true;
        for (int i = 0; i < 9; i++) {
                if (board[i] == " ") {
                    full = false;
                }
            }

        return full;
    }*/


    }