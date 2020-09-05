package com.tdd.kata;

public class Game {

    private static final int POSITION_ZERO = 0;
    private static final int POSITION_ONE = 1;
    private static final int POSITION_TWO = 2;
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';
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
        if (isFirstRowFilledByPlayer(PLAYER_X)) {
            return PLAYER_X;
        }

        if (isFirstRowFilledByPlayer(PLAYER_O)) {
            return PLAYER_O;
        }

        return '\0';
    }

    private boolean isFirstRowFilledByPlayer(char player) {
        return getPlayerAt(POSITION_ZERO, POSITION_ZERO) == player
                && getPlayerAt(POSITION_ZERO, POSITION_ONE) == player
                && getPlayerAt(POSITION_ZERO, POSITION_TWO) == player;
    }
}