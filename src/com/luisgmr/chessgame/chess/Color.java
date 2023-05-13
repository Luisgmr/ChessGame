package com.luisgmr.chessgame.chess;

public enum Color {

    BLACK,
    WHITE;

    @Override
    public String toString() {
        if (this == WHITE) {
            return "BRANCAS";
        } else {
            return "PRETAS";
        }
    }
}
