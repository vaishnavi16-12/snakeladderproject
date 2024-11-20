package com.bridgelabz.snakeproject;

import java.util.Random;

public class SnakeLadderMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake Ladder project");

        int player1Position = 0, player2Position = 0;
        Random dice =
         new Random();
        boolean isPlayer1Turn = true;

        int[] snakes = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] ladders = {0, 0, 0, 0, 0, 0, 0, 38, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 42, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 44, 0, 0, 0, 0, 0, 0, 0, 0, 0, 67, 0, 0, 0, 0, 0, 0, 0, 91, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        while (player1Position < 100 && player2Position < 100) {
            int roll = dice.nextInt(6) + 1;
            System.out.println((isPlayer1Turn ? "Player 1" : "Player 2") + " rolled a " + roll);

            if (isPlayer1Turn) {
                player1Position += roll;
                if (player1Position > 100) player1Position = 100;

                if (snakes[player1Position] != 0) {
                    System.out.println("Player 1 landed on a snake! Moving to position " + snakes[player1Position]);
                    player1Position = snakes[player1Position];
                } else if (ladders[player1Position] != 0) {
                    System.out.println("Player 1 landed on a ladder! Climbing to position " + ladders[player1Position]);
                    player1Position = ladders[player1Position];
                    continue;
                }

                System.out.println("Player 1 is now at position: " + player1Position);
            } else {
                player2Position += roll;
                if (player2Position > 100) player2Position = 100;

                if (snakes[player2Position] != 0) {
                    System.out.println("Player 2 landed on a snake! Moving to position " + snakes[player2Position]);
                    player2Position = snakes[player2Position];
                } else if (ladders[player2Position] != 0) {
                    System.out.println("Player 2 landed on a ladder! Climbing to position " + ladders[player2Position]);
                    player2Position = ladders[player2Position];
                    continue;
                }

                System.out.println("Player 2 is now at position: " + player2Position);
            }

            isPlayer1Turn = !isPlayer1Turn;
        }

        if (player1Position == 100) {
            System.out.println("Congratulations! Player 1 won the game!");
        } else {
            System.out.println("Congratulations! Player 2 won the game!");
        }
    }
}