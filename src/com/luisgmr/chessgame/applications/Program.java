package com.luisgmr.chessgame.applications;

import com.luisgmr.chessgame.chess.ChessException;
import com.luisgmr.chessgame.chess.ChessMatch;
import com.luisgmr.chessgame.chess.ChessPiece;
import com.luisgmr.chessgame.chess.ChessPosition;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();

        while (true) {
            try {
                UserInterface.clearScreen();
                UserInterface.printMatch(chessMatch, captured);
                System.out.println();
                System.out.print("Posição de origem: ");
                ChessPosition source = UserInterface.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UserInterface.clearScreen();
                UserInterface.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Posição de destino: ");
                ChessPosition target = UserInterface.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

                if (capturedPiece != null) {
                    captured.add(capturedPiece);
                }
            } catch (ChessException e) {
                System.out.println("\n" + e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n" + e.getMessage());
                sc.nextLine();
            }
        }
    }

}
