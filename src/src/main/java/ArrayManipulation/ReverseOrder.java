package ArrayManipulation;

import java.util.Arrays;

public class ReverseOrder {

    public static void main(String[] args) {

        int []numbers = {11, 13, 1, 0, 15, 28, 99, -76, 54};

        for(int i = numbers.length - 1 ; i >= 0 ;i--){

            System.out.println(numbers[i]);
        }
    }
}
