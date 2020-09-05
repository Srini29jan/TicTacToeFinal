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
        if (isAnyRowFilledByPlayer(Player.PLAYER_X.getValue())
                || isFirstColumnFilledByPlayer(Player.PLAYER_X.getValue())) {
            winner = Player.PLAYER_X.getValue();
        }

        if (isAnyRowFilledByPlayer(Player.PLAYER_O.getValue())
                || isFirstColumnFilledByPlayer(Player.PLAYER_O.getValue())) {
            winner = Player.PLAYER_O.getValue();
        }

        if (isSecondColumnFilledByPlayer(Player.PLAYER_X.getValue())) {
            winner = Player.PLAYER_X.getValue();
        }

        if (isSecondColumnFilledByPlayer(Player.PLAYER_O.getValue())) {
            winner = Player.PLAYER_O.getValue();
        }

        return winner;
    }

    private boolean isSecondColumnFilledByPlayer(char player) {
        return getPlayerAt(POSITION_ZERO, POSITION_ONE) == player
                && getPlayerAt(POSITION_ONE, POSITION_ONE) == player
                && getPlayerAt(POSITION_TWO, POSITION_ONE) == player;
    }

    private boolean isFirstColumnFilledByPlayer(char player) {
        return getPlayerAt(POSITION_ZERO, POSITION_ZERO) == player
                && getPlayerAt(POSITION_ONE, POSITION_ZERO) == player
                && getPlayerAt(POSITION_TWO, POSITION_ZERO) == player;
    }

    private boolean isAnyRowFilledByPlayer(char player) {
        return isRowFilledByPlayer(POSITION_ZERO, player)
                || isRowFilledByPlayer(POSITION_ONE, player)
                || isRowFilledByPlayer(POSITION_TWO, player);
    }

    private boolean isRowFilledByPlayer(int rowPosition, char player) {
        return getPlayerAt(rowPosition, POSITION_ZERO) == player
                && getPlayerAt(rowPosition, POSITION_ONE) == player
                && getPlayerAt(rowPosition, POSITION_TWO) == player;
    }

}