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
        if (isAnyRowFilledByPlayerX(Player.PLAYER_X.getValue())) {
            winner = Player.PLAYER_X.getValue();
        }

        if (isAnyRowFilledByPlayerX(Player.PLAYER_O.getValue())) {
            winner = Player.PLAYER_O.getValue();
        }

        return winner;
    }

    private boolean isAnyRowFilledByPlayerX(char playerX) {
        return isAnyRowFilledByPlayer(POSITION_ZERO, playerX)
                || isAnyRowFilledByPlayer(POSITION_ONE, playerX)
                || isAnyRowFilledByPlayer(POSITION_TWO, playerX);
    }

    private boolean isAnyRowFilledByPlayerO() {
        return isAnyRowFilledByPlayer(POSITION_ZERO, Player.PLAYER_O.getValue())
                || isAnyRowFilledByPlayer(POSITION_ONE, Player.PLAYER_O.getValue())
                || isAnyRowFilledByPlayer(POSITION_TWO, Player.PLAYER_O.getValue());
    }

    private boolean isAnyRowFilledByPlayer(int rowPosition, char player) {
        return getPlayerAt(rowPosition, POSITION_ZERO) == player
                && getPlayerAt(rowPosition, POSITION_ONE) == player
                && getPlayerAt(rowPosition, POSITION_TWO) == player;
    }

}