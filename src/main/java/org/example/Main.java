package org.example;

import java.util.Scanner;

import static org.example.WordsUtils.generateHangman;
import static org.example.WordsUtils.generateWord;

public class Main {
    public  static String generateHangman(){
        return generateWord().replaceAll("[a-z/g]","_ ");

    }

    public String checkGuess(char guess){

        for(int i = 0; i < generateWord().length(); i++) {
            if (generateWord().contains(guess)){
                return "correct";
            } else {
                return "incorrect letter";
            }
        }
        return "false";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to hangman. Guess the word ...");
        //System.out.println(generateWord());
        System.out.println(generateHangman());
        System.out.println("Guess a letter");
        String guess = scanner.nextLine();
        System.out.println(checkGuess(guess));



    }
}

