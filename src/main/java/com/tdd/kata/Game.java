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
        if (isAnyRowFilledByPlayer(Player.PLAYER_X.getValue())) {
            winner = Player.PLAYER_X.getValue();
        }

        if (isAnyRowFilledByPlayer(Player.PLAYER_O.getValue())) {
            winner = Player.PLAYER_O.getValue();
        }

        if (isFirstColumnFilledByPlayerX()) {
            winner = Player.PLAYER_X.getValue();
        }

        if (isFirstColumnFilledByPlayerO(Player.PLAYER_O.getValue())) {
            winner = Player.PLAYER_O.getValue();
        }

        return winner;
    }

    private boolean isFirstColumnFilledByPlayerO(char playerO) {
        return getPlayerAt(POSITION_ZERO, POSITION_ZERO) == playerO
                && getPlayerAt(POSITION_ONE, POSITION_ZERO) == playerO
                && getPlayerAt(POSITION_TWO, POSITION_ZERO) == playerO;
    }

    private boolean isFirstColumnFilledByPlayerX() {
        return getPlayerAt(POSITION_ZERO, POSITION_ZERO) == Player.PLAYER_X.getValue()
                && getPlayerAt(POSITION_ONE, POSITION_ZERO) == Player.PLAYER_X.getValue()
                && getPlayerAt(POSITION_TWO, POSITION_ZERO) == Player.PLAYER_X.getValue();
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