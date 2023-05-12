package com.luisgmr.chessgame.applications;

import com.luisgmr.chessgame.chess.ChessPiece;
import com.luisgmr.chessgame.chess.Color;

public class UserInterface {

    // https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void printBoard(ChessPiece[][] pieces) {
        System.out.println(ANSI_BLACK_BACKGROUND + "                     " + ANSI_RESET);
        for (int i = 0; i < pieces.length; i++) {
            System.out.print(ANSI_BLACK_BACKGROUND + (8 - i) + " " + ANSI_RESET + " ");
            for (int j = 0; j < pieces.length; j++) {
                printPiece(pieces[i][j]);
                if (j == 7) {
                    System.out.print(ANSI_BLACK_BACKGROUND + "  " + ANSI_RESET);
                }
            }
            System.out.println();
        }
        System.out.println(ANSI_BLACK_BACKGROUND + "   a b c d e f g h   " + ANSI_RESET);
    }

    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("-");
        } else {
            if (piece.getColor() == Color.WHITE) {
                System.out.print(ANSI_RESET + piece + ANSI_RESET);
            } else {
                System.out.print(ANSI_GREEN + piece + ANSI_RESET);
            }
        }
        System.out.print(" ");
    }

}