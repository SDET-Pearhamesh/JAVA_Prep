package HackerRank.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintToken {

    /* Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
       We define a token to be one or more consecutive English alphabetic letters.
       Then, print the number of tokens, followed by each token on a new line. */

    // Input - He is a very very good boy, isn't he?
    /*  Output -
     10
     He
     is
     a
     very
     very
     good
     boy
     isn
     t
     he */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int length = 0;

        ArrayList<String> list = new ArrayList<>();

        String[] result = text.split("[^A-Za-z]+") ;

        for(String word : result){
            if(!word.isEmpty() && word.matches("[A-Za-z]+")) {
                list.add(word);
                length++;
            }
        }

        System.out.println(length);

        for(String obj : list){
            System.out.println(obj);
        }
    }
    }
