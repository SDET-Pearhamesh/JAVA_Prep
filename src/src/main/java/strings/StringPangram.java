package main.java.strings;

import java.util.HashSet;
import java.util.Set;

public class StringPangram {

    public static void main(String[] args) {

        //A pangram is a sentence or phrase that uses every letter of the alphabet at least once.

        String sentence = "The 1234 quick br6own fox jumps over the lazy dog.......";


        Set<Character> set = new HashSet<>();

        for(char ch : sentence.toLowerCase().toCharArray()){
            if(ch >= 'a' && ch <= 'z') { // make sure its betweeen a to z
                set.add(ch);
            }
        }

        System.out.println(set.size());

        if(set.size() == 26){
            System.out.println("Given string is Pangram");
        }

    }
}


// if (ch >= '0' && ch <= '9') {
// System.out.println(ch + " is a digit.");