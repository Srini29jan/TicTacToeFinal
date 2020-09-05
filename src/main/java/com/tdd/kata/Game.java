package com.tdd.kata;

public class Game {

    private static final int POSITION_ZERO = 0;
    private static final int POSITION_ONE = 1;
    private static final int POSITION_TWO = 2;
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
        if (isFirstRowFilledByPlayer(Player.PLAYER_X.getValue())) {
            return Player.PLAYER_X.getValue();
        }

        if (isFirstRowFilledByPlayer(Player.PLAYER_O.getValue())) {
            return Player.PLAYER_O.getValue();
        }

        if (isSecondRowFilledByPlayerX()) {
            return Player.PLAYER_X.getValue();
        }

        if (getPlayerAt(POSITION_ONE, POSITION_ZERO) == Player.PLAYER_O.getValue()
                && getPlayerAt(POSITION_ONE, POSITION_ONE) == Player.PLAYER_O.getValue()
                && getPlayerAt(POSITION_ONE, POSITION_TWO) == Player.PLAYER_O.getValue()) {
            return Player.PLAYER_O.getValue();
        }

        return '\0';
    }

    private boolean isSecondRowFilledByPlayerX() {
        return getPlayerAt(POSITION_ONE, POSITION_ZERO) == Player.PLAYER_X.getValue()
                && getPlayerAt(POSITION_ONE, POSITION_ONE) == Player.PLAYER_X.getValue()
                && getPlayerAt(POSITION_ONE, POSITION_TWO) == Player.PLAYER_X.getValue();
    }

    private boolean isFirstRowFilledByPlayer(char player) {
        return getPlayerAt(POSITION_ZERO, POSITION_ZERO) == player
                && getPlayerAt(POSITION_ZERO, POSITION_ONE) == player
                && getPlayerAt(POSITION_ZERO, POSITION_TWO) == player;
    }
}