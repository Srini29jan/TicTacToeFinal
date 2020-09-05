package com.tdd.kata;

import com.tdd.kata.io.InputScanner;

import org.junit.Test;
import org.junit.Assert;

import org.mockito.Mockito;

public class GameRunnerTest {
    @Test
    public void instructionsShouldBePrintedOnGameStart() {
        String instruction = new StringBuilder("Welcome to TicTacToe game!!\n")
                .append("This is a game on a board of size 3x3\n")
                .append("Position of each box is represented by a combination of two numbers as below\n")
                .append("0 0, 0 1, 0 2\n")
                .append("1 0, 1 1, 1 2\n")
                .append("2 0, 2 1, 2 2\n")
                .append("Choose one of these positions on a player's turn\n")
                .append("Game always starts with player 'X'\n")
                .append("Players cannot play on a position which is already played\n")
                .append("Mark your position:\n").toString();
        TestableGameRunner testableGameRunner = new TestableGameRunner();

        testableGameRunner.startGame();

        Assert.assertTrue(testableGameRunner.getMessage().contains(instruction));
    }

    @Test
    public void positionInputShouldBeCollectedAfterPrintingInstructions() {
        InputScanner scanner = Mockito.mock(InputScanner.class);

        new GameRunner(scanner).startGame();

        Mockito.verify(scanner, Mockito.times(1)).nextLine();
    }

    private class TestableGameRunner extends GameRunner {

        private StringBuilder message = new StringBuilder();

        @Override
        protected void print(String message) {
            this.message.append(message);
        }

        public String getMessage() {
            return message.toString();
        }
    }
}