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
        char winner = '\0';
        if (isFirstRowFilledByPlayer(Player.PLAYER_X.getValue())
                || isSecondRowFilledByPlayer(Player.PLAYER_X.getValue())
                || isThirdRowFilledByPlayer(Player.PLAYER_X.getValue(), POSITION_TWO)) {
            winner = Player.PLAYER_X.getValue();
        }

        if (isFirstRowFilledByPlayer(Player.PLAYER_O.getValue())
                || isSecondRowFilledByPlayer(Player.PLAYER_O.getValue())
                || isThirdRowFilledByPlayer(Player.PLAYER_O.getValue(), POSITION_TWO)) {
            winner = Player.PLAYER_O.getValue();
        }

        return winner;
    }

    private boolean isThirdRowFilledByPlayer(char player, int positionTwo) {
        return getPlayerAt(positionTwo, POSITION_ZERO) == player
                && getPlayerAt(positionTwo, POSITION_ONE) == player
                && getPlayerAt(positionTwo, POSITION_TWO) == player;
    }

    private boolean isSecondRowFilledByPlayer(char player) {
        return getPlayerAt(POSITION_ONE, POSITION_ZERO) == player
                && getPlayerAt(POSITION_ONE, POSITION_ONE) == player
                && getPlayerAt(POSITION_ONE, POSITION_TWO) == player;
    }

    private boolean isFirstRowFilledByPlayer(char player) {
        return getPlayerAt(POSITION_ZERO, POSITION_ZERO) == player
                && getPlayerAt(POSITION_ZERO, POSITION_ONE) == player
                && getPlayerAt(POSITION_ZERO, POSITION_TWO) == player;
    }
}