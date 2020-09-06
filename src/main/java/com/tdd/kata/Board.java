package com.tdd.kata;

public class Board {

    private static final int GRID_SIZE = 3;
    private final char[][] gameBoard;
    int numberOfCellsFilled;
    char previousPlayer;

    public Board() {
        gameBoard = new char[GRID_SIZE][GRID_SIZE];
        numberOfCellsFilled = 0;
    }

    public char getPlayerAt(int row, int column) {
        return gameBoard[row][column];
    }

    public void playAt(int row, int column) {
        char currentPlayer = getCurrentPlayer();
        gameBoard[row][column] = currentPlayer;
        numberOfCellsFilled++;
        setPreviousPlayer(currentPlayer);
    }

    public void setPreviousPlayer(char currentPlayer) {
        previousPlayer = currentPlayer;
    }

    public char getCurrentPlayer() {
        return previousPlayer == Player.PLAYER_X.getValue() ? 'O' : Player.PLAYER_X.getValue();
    }
}