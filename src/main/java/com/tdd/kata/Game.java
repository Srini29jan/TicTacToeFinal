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
        if (isFirstRowFilledByPlayerO(PLAYER_X)) {
            return PLAYER_X;
        }

        if (isFirstRowFilledByPlayerO(PLAYER_O)) {
            return PLAYER_O;
        }

        return '\0';
    }

    private boolean isFirstRowFilledByPlayerX() {
        return getPlayerAt(POSITION_ZERO, POSITION_ZERO) == PLAYER_X && getPlayerAt(POSITION_ZERO, POSITION_ONE) == PLAYER_X && getPlayerAt(POSITION_ZERO, POSITION_TWO) == PLAYER_X;
    }

    private boolean isFirstRowFilledByPlayerO(char playerO) {
        return getPlayerAt(POSITION_ZERO, POSITION_ZERO) == playerO
                && getPlayerAt(POSITION_ZERO, POSITION_ONE) == playerO
                && getPlayerAt(POSITION_ZERO, POSITION_TWO) == playerO;
    }
}