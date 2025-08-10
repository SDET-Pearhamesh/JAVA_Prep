package main.java.BasicAlgoAndControlFlow;

import java.util.Arrays;
import java.util.Collections;

public class LargestNumberInArray {

    public static void main(String[] args) {

        int [] numbers = {10, 12, 8, 0, 17};
        LargestNumberInArray largestNumberInArray = new LargestNumberInArray();
        largestNumberInArray.method1(numbers);
        largestNumberInArray.method2(numbers);
        largestNumberInArray.method3();

    }

    public void method1(int [] numbers){

        for(int i = 0; i < numbers.length ; i++){
            for(int j = 0; j < numbers.length - 1 ; j++){

                if(numbers[j] < numbers [j + 1]){

                    int temp = numbers[j];  // temp = 10
                    numbers[j] = numbers[j + 1];  // number[j] = 12
                    numbers[j + 1] = temp; // number[j + 1] = 10
                }
            }
        }

       System.out.println(numbers[0]);
    }



    public void method2(int [] numbers){

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 1]);
    }

    public void method3(){

        Integer[] numbers = {10, 12, 8, 0, 17};
        Arrays.sort(numbers , Collections.reverseOrder());

        System.out.println(numbers[0]);
    }
}
