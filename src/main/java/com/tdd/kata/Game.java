package com.tdd.kata;

public class Game {

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
        if (getPlayerAt(0, 0) == 'X' && getPlayerAt(0, 1) == 'X' && getPlayerAt(0, 2) == 'X') {
            return 'X';
        }

        return 'O';
    }
}