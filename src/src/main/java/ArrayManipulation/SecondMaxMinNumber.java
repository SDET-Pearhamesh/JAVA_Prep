package ArrayManipulation;

import java.util.Arrays;

public class SecondMaxMinNumber {

    public static void main(String[] args) {

        int[] ravan = {5, 4, 4, 0, 1 , 1 , 2, 3 , 4 , 5 };

        Arrays.sort(ravan);

        System.out.println("Second highest : " + ravan[ravan.length - 3]);
        System.out.println("Second lowest : " + ravan[1]);
    }
}
