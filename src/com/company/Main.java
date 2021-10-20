package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("data/userGuess.txt");
        Scanner sc = new Scanner(System.in);
        int result = 1 + (int) (5 * Math.random());

        int tries = 10;

        int i, guess;


        System.out.println("Guess a random number between 1 and 5!");
        {

            for (i = 0; i < tries; i++) {
                System.out.println("Type in your guess: ");
                guess = sc.nextInt();

                if (result == guess) {
                    System.out.println("Congratulations you guessed the number");
                    break;
                } else if (result > guess) {
                    System.out.println("You guessed incorrect try again: ");

                } else if (result < guess) {
                    System.out.println("You guessed incorrect try again: ");
                }
                try{
                    PrintStream ps = new PrintStream(new FileOutputStream(file, true));
                    ps.append(Integer.toString(guess)).append("\n");
                } catch (FileNotFoundException e){
                    e.printStackTrace();
                }

            }

        }

    }
}

