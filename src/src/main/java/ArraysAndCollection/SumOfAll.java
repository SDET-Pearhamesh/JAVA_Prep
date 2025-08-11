package ArraysAndCollection;

import java.util.Arrays;

public class SumOfAll {

    public static void main(String[] args) {

        int[] ages = {11, 11, 9, 0, 0,  17, 23, 01, 67, 77, 77, 65};

        int sum = 0 ;

        for(int age : ages){
            sum = sum + age;
        }

        System.out.println(sum);
    }
}
