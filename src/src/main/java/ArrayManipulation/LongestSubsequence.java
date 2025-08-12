package ArrayManipulation;

import java.util.ArrayList;

public class LongestSubsequence {

    public static void main(String[] args) {

        int[] ravan = {1 , 2, 4, 5, 6, 7, 8};
        int[] dhavan = {8, 5, 3, 4, 0};

        // Expected output - 3 - elements are 8, 5, 4

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i <  ravan.length ; i++ ){

            for(int j = 0; j < dhavan.length; j++){

                if(ravan[i] == dhavan[j]){
                    list.add(ravan[i]);
                }
            }
        }

        System.out.println(list.size() + " Elements are : " + list);
    }
}
