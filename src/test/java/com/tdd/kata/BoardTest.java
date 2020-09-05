package com.tdd.kata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {

    private static final int POSITION_ZERO = 0;
    private Board board;

    @Before
    public void setUp() {
        board = new Board();
    }

    @Test
    public void getPlayerAtShouldReturnXAfterFirstTurn() {
        board.playAt(POSITION_ZERO, POSITION_ZERO);

        assertThat(board.getPlayerAt(POSITION_ZERO, POSITION_ZERO), is('X'));
    }

    @Test
    public void getCurrentPlayerShouldReturnOAfterFirstTurn() {
        board.playAt(POSITION_ZERO, POSITION_ZERO);

        assertThat(board.getCurrentPlayer(), is('O'));
    }
}
