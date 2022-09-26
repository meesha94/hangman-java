package org.example;

import java.util.ArrayList;
import java.util.Random;

public class WordsUtils {
    private static ArrayList<String> words = new ArrayList<>();

    private  ArrayList<String> lettersPlayed = new ArrayList<>();






    private static final Random RANDOM = new Random();

    static {
        words.add("random");
        words.add("water");
        words.add("computers");
    }

    public static String generateWord(){
        return words.get(RANDOM.nextInt(words.toArray().length));
    }








}











