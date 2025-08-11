package ArraysAndCollection;

import java.util.ArrayList;
import java.util.Arrays;


public class MissingNumber {

    public static void main(String[] args) {

        int[] numnbers = {9, 1, 2, 4, 6, 7, 8};

        MissingNumber missingNumber = new MissingNumber();
        missingNumber.method(numnbers);

    }

    public void method(int[] numbers) {

        Arrays.sort(numbers);

        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        ArrayList<Integer> missing = new ArrayList<>();

        for (int i = first; i <= last; i++) {

            // Use binary search for better performance
            if (Arrays.binarySearch(numbers, i) < 0) {
                missing.add(i);
            }
        }

        System.out.println("Missing numbers: " + missing);
    }
    }

