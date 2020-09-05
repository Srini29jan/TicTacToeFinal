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
        if (isGameWonByPlayerX()) {
            winner = Player.PLAYER_X.getValue();
        }

        if (isGameWonByPlayerO()) {
            winner = Player.PLAYER_O.getValue();
        }

        return winner;
    }

    private boolean isGameWonByPlayerO() {
        return isAnyRowFilledByPlayer(Player.PLAYER_O.getValue())
                || isAnyColumnFilledByPlayer(Player.PLAYER_O.getValue())
                || isAnyDiagonalFilledByPlayer(Player.PLAYER_O.getValue());
    }

    private boolean isGameWonByPlayerX() {
        return isAnyRowFilledByPlayer(Player.PLAYER_X.getValue())
                || isAnyColumnFilledByPlayer(Player.PLAYER_X.getValue())
                || isAnyDiagonalFilledByPlayer(Player.PLAYER_X.getValue());
    }

    private boolean isAnyDiagonalFilledByPlayer(char player) {
        return isTopLeftToBottomRightDiagonalFilledByPlayer(player)
                || isTopRightToBottomLeftDiagonalFilledByPlayer(player);
    }

    private boolean isTopRightToBottomLeftDiagonalFilledByPlayer(char player) {
        return getPlayerAt(POSITION_ZERO, POSITION_TWO) == player
                && getPlayerAt(POSITION_ONE, POSITION_ONE) == player
                && getPlayerAt(POSITION_TWO, POSITION_ZERO) == player;
    }

    private boolean isTopLeftToBottomRightDiagonalFilledByPlayer(char player) {
        return getPlayerAt(POSITION_ZERO, POSITION_ZERO) == player
                && getPlayerAt(POSITION_ONE, POSITION_ONE) == player
                && getPlayerAt(POSITION_TWO, POSITION_TWO) == player;
    }

    private boolean isAnyColumnFilledByPlayer(char player) {
        return isColumnFilledByPlayer(POSITION_ZERO, player)
                || isColumnFilledByPlayer(POSITION_ONE, player)
                || isColumnFilledByPlayer(POSITION_TWO, player);
    }

    private boolean isColumnFilledByPlayer(int columnPosition, char player) {
        return getPlayerAt(POSITION_ZERO, columnPosition) == player
                && getPlayerAt(POSITION_ONE, columnPosition) == player
                && getPlayerAt(POSITION_TWO, columnPosition) == player;
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