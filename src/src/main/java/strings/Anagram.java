package main.java.strings;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

       System.out.println(areAnagrams1("ana3gram" , "anagram"));
    }

    public static boolean areAnagrams1(String str1, String str2) {


        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert to char arrays and sort
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Compare sorted arrays
        return Arrays.equals(chars1, chars2);
    }
}
