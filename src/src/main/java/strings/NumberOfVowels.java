package main.java.strings;

public class NumberOfVowels {

    public static void main(String[] args) {

        String input = "AEIOUskjdhvkjdfhsvaeiou";
        String word = input.toLowerCase();
        int count = 0;

        for (char ch : word.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println(count);
    }
}
