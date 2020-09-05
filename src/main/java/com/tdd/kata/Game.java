package com.tdd.kata;

public class Game {

    private static final int POSITION_ZERO = 0;
    private static final char PLAYER_X = 'X';
    private final Board board;

    public Game() {
        board = new Board();
    }

    public char getPlayerAt(int row, int column) {
        return board.getPlayerAt(row, column);
    }

    public void playAt(int row, int column) {
        board.playAt(row, column);
    }

    public char getWinner() {
        if (getPlayerAt(POSITION_ZERO, POSITION_ZERO) == PLAYER_X && getPlayerAt(POSITION_ZERO, 1) == PLAYER_X && getPlayerAt(POSITION_ZERO, 2) == PLAYER_X) {
            return PLAYER_X;
        }

        if (getPlayerAt(POSITION_ZERO, POSITION_ZERO) == 'O'
                && getPlayerAt(POSITION_ZERO, 1) == 'O'
                && getPlayerAt(POSITION_ZERO, 2) == 'O') {
            return 'O';
        }

        return '\0';
    }
}