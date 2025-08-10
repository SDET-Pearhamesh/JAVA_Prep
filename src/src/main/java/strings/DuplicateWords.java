package main.java.strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {

    public static void main(String[] args) {

        String input = "The quick brown fox jumps over the lazy dog The lazy dog is not so lazy";
        String sentence = input.toLowerCase();

        String[] words = sentence.split(" ");  // remember this

        HashMap<String , Integer> count = new HashMap<>();

        for(String word : words){
            count.put(word , count.getOrDefault( word , 0 ) +  1);
        }

        for(Map.Entry<String , Integer> entry : count.entrySet()){   // remember this

            if(entry.getValue() > 1){
                System.out.println(entry);
            }
        }
    }
}
