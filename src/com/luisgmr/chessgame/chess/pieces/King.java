package com.luisgmr.chessgame.chess.pieces;

import com.luisgmr.chessgame.boardgame.Board;
import com.luisgmr.chessgame.chess.ChessPiece;
import com.luisgmr.chessgame.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
