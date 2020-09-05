package com.tdd.kata;

public class Board {

    private static final char PLAYER_X = 'X';
    private static final int GRID_SIZE = 3;
    private final char[][] gameBoard;
    private char previousPlayer;

    public Board() {
        gameBoard = new char[GRID_SIZE][GRID_SIZE];
    }

    public char getPlayerAt(int row, int column) {
        return gameBoard[row][column];
    }

    public void playAt(int row, int column) {
        char currentPlayer = getCurrentPlayer();
        gameBoard[row][column] = currentPlayer;
        setPreviousPlayer(currentPlayer);
    }

    public void setPreviousPlayer(char currentPlayer) {
        previousPlayer = currentPlayer;
    }

    public char getCurrentPlayer() {
        return previousPlayer == PLAYER_X ? 'O' : PLAYER_X;
    }
}