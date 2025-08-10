package main.java.strings;

public class StringCompression {

    public static void main(String[] args) {

        String input = "aaabbbcccsjjkk";

        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char currentChar = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {

            if (input.charAt(i) == currentChar) {
                count++;

            } else {
                // Append current character and count
                compressed.append(currentChar);
                if (count > 1) {
                    compressed.append(count);
                }

                // Reset for next character
                currentChar = input.charAt(i);
                count = 1;
            }
        }

        // Append the last character and count
        compressed.append(currentChar);

        if (count > 1) {
            compressed.append(count);
        }

        // Return original string if compression doesn't reduce size
        System.out.println(compressed.length() < input.length() ? compressed.toString() : input);
    }
}
