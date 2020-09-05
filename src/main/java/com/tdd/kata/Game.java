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

    public void setPreviousPlayer(char currentPlayer) {
        board.setPreviousPlayer(currentPlayer);
    }

    public char getCurrentPlayer() {
        return board.getCurrentPlayer();
    }
}