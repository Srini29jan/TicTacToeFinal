package com.tdd.kata;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
    @Test
    public void getPlayerAtShouldReturnXAfterFirstTurn() {
        Board board = new Board();
        board.playAt(0, 0);

        assertThat(board.getPlayerAt(0, 0), is('X'));
    }

    @Test
    public void getCurrentPlayerShouldReturnOAfterFirstTurn() {
        Board board = new Board();
        board.playAt(0, 0);

        assertThat(board.getCurrentPlayer(), is('O'));
    }
}
