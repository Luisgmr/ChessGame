package com.luisgmr.chessgame.chess;

import com.luisgmr.chessgame.boardgame.Board;
import com.luisgmr.chessgame.boardgame.Position;
import com.luisgmr.chessgame.chess.pieces.King;
import com.luisgmr.chessgame.chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        this.board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
    }

}
