package com.luisgmr.chessgame.applications;

import com.luisgmr.chessgame.chess.ChessException;
import com.luisgmr.chessgame.chess.ChessMatch;
import com.luisgmr.chessgame.chess.ChessPiece;
import com.luisgmr.chessgame.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                UserInterface.clearScreen();
                UserInterface.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Posição de origem: ");
                ChessPosition source = UserInterface.readChessPosition(sc);
                System.out.println();
                System.out.print("Posição de destino: ");
                ChessPosition target = UserInterface.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
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
