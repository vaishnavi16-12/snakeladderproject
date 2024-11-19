package com.bridgelabz.snakeproject;

import java.util.Random;

public class SnakeLadderMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake Ladder project");


            int playerPosition = 0;
            Random dice = new Random();
            int[] snakes = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            int[] ladders = {0, 0, 0, 0, 0, 0, 0, 38, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 42, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 44, 0, 0, 0, 0, 0, 0, 0, 0, 0, 67, 0, 0, 0, 0, 0, 0, 0, 91, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

            while (playerPosition < 100) {
                int roll = dice.nextInt(6) + 1;
                System.out.println("You rolled a " + roll);
                playerPosition += roll;

                if (playerPosition > 100) {
                    playerPosition = 100;
                }

                if (snakes[playerPosition] != 0) {
                    System.out.println("Oops! You landed on a snake! Moving to position " + snakes[playerPosition]);
                    playerPosition = snakes[playerPosition];
                }

                if (ladders[playerPosition] != 0) {
                    System.out.println("Great! You landed on a ladder! Climbing to position " + ladders[playerPosition]);
                    playerPosition = ladders[playerPosition];
                }

                System.out.println("You are now at position: " + playerPosition);
            }

            System.out.println("Congratulations! You've reached the end!");
        }
    }
