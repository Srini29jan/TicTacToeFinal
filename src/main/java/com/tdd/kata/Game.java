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
        if (isThirdRowFilledByPlayer(Player.PLAYER_X.getValue(), POSITION_ZERO)
                || isThirdRowFilledByPlayer(Player.PLAYER_X.getValue(), POSITION_ONE)
                || isThirdRowFilledByPlayer(Player.PLAYER_X.getValue(), POSITION_TWO)) {
            winner = Player.PLAYER_X.getValue();
        }

        if (isThirdRowFilledByPlayer(Player.PLAYER_O.getValue(), POSITION_ZERO)
                || isThirdRowFilledByPlayer(Player.PLAYER_O.getValue(), POSITION_ONE)
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

}