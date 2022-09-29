package org.example;

import java.util.ArrayList;
import java.util.Scanner;

import static org.example.WordsUtils.generateWord;

public class Main {
    private static ArrayList<String> lettersPlayed = new ArrayList<>();

    private static int lives = 4;
    public  static String generateHangman(String targetWord){
         String hangmanWord = targetWord.replaceAll("[a-z/g]","_");
        return hangmanWord;
    }

    public static Boolean checkGuess(String guess, String targetWord){
        boolean isCorrectGuess = false;
        String lowerCaseGuess = guess.toLowerCase();


        String[] targetWordArray = targetWord.split("");

        for (int i = 0; i < targetWordArray.length; i++) {
            if(!lettersPlayed.contains(lowerCaseGuess)) {
                if (targetWordArray[i].equals(lowerCaseGuess)) {
                    isCorrectGuess = true;
                }

            }
        }
        return isCorrectGuess;
    }

    public static int getIndex(String guess, String targetWord){

        for(int i =0; i < targetWord.length(); i++) {

        }
        return targetWord.indexOf(guess);

    };

    public static String dashToLetter(int index, String hangmanWord, String guess){



            String newWord = hangmanWord.substring(0, index) + guess + hangmanWord.substring(index + 1);

            return newWord;


    }

    public static void main(String[] args) {
        boolean gameisPlaying = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to hangman. Guess the word ...");
        String targetWord = generateWord();
        String hangmanWord = generateHangman(targetWord);
        System.out.println(hangmanWord);

        while(gameisPlaying && lives > 0) {
            System.out.println("Guess a letter");
            String guess = scanner.nextLine();
            boolean isCorrectGuess = checkGuess(guess, targetWord);
            System.out.println(isCorrectGuess);
            int index = getIndex(guess, targetWord);
            if (isCorrectGuess) {
               hangmanWord = dashToLetter(index, hangmanWord, guess);
                System.out.println(hangmanWord);
                System.out.println(lettersPlayed.add(guess));
            } else {
                System.out.println("Sorry wrong guess");
                lives--;
                System.out.println(lives + " lives");



            }


        }
        System.out.println("You lost! Game over!");
        System.out.println("The word was " +  targetWord);





    }
}

