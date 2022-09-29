package org.example;

import java.util.ArrayList;
import java.util.Random;

public class WordsUtils {
    private static ArrayList<String> words = new ArrayList<>();

    private static final Random RANDOM = new Random();

    static {
        words.add("random");
        words.add("water");
        words.add("computers");
        //words.add("room");
    }

    public static String generateWord(){
        String targetWord =  words.get(RANDOM.nextInt(words.toArray().length));
        return targetWord;
    }








}











