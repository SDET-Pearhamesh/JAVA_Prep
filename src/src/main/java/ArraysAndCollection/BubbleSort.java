package ArraysAndCollection;

import static java.util.Collections.swap;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = {6, 5,4, 3, 2,1, 0};

        /* Runs n-1 times (5 times for 6 elements)
           Each iteration represents one "pass" through the array
           After each pass, the largest unsorted element "bubbles up" to its correct position */

       /* Compares adjacent elements
          numbers.length-1-i ensures we don't check already sorted elements
          As i increases, fewer comparisons are needed since the end of the array becomes sorted */

        for(int i=0; i<numbers.length-1; i++) {

            for(int j=0; j<numbers.length-1-i; j++) {

                if(numbers[j] > numbers[j+1]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;

                }
            }
        }

        System.out.println("Sorted Array:");

        for(int num : numbers) {
        System.out.println(num + " ");
        }
    }
}