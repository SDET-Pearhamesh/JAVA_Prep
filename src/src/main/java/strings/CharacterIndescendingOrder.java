package main.java.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class CharacterIndescendingOrder {


    public static void main(String[] args) {

        String input = "abcdeabcdeA";
        String word = input.toLowerCase();

        // Tree map because it maintains a sorted order of its keys.
        TreeMap<Character , Integer> frequency = new TreeMap<>();

        for(char character : word.toCharArray()){
            frequency.put( character  , frequency.getOrDefault(character , 0) + 1);
        }
         System.out.println(frequency );
    }


}