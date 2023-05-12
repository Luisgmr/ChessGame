package com.luisgmr.chessgame.applications;

import com.luisgmr.chessgame.chess.ChessMatch;

public class Program {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UserInterface.printBoard(chessMatch.getPieces());
    }

}
