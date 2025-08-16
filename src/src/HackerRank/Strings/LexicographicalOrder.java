package HackerRank.Strings;

//For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
String welcometojava has the following lexicographically-ordered substrings of length k = 3:
Print first and last string - make sure they are in the alphabetic order

Sample Input -
welcometojava
3

Sample Output :
ava
wel
 */
public class LexicographicalOrder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();

        List<String> substrings = new ArrayList<>();

        // Generate all substrings of length k
        for (int i = 0; i <= s.length() - k; i++) {
            substrings.add(s.substring(i, i + k));
        }

        // Sort the list lexicographically
        Collections.sort(substrings);

        System.out.print( substrings.get(0) + "\n" + substrings.get(substrings.size() - 1));


    }
    }

