package ArrayManipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class InsertionOfTwoArray {

    public static void main(String[] args) {

        int[] ravan = {1 , 4 , 5 };
        int[] dhavan = {2 , 3 , 4, 5, 6, 7 };

        uniqueArray(ravan , dhavan);
        commonElements(ravan , dhavan);

    }

    public static void uniqueArray(int[] ravan , int[] dhavan){

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        for(int i : ravan){
            lhs.add(i);
        }
        for(int i : dhavan){
            lhs.add(i);
        }

        System.out.println(lhs);

    }

    public static void commonElements(int[] ravan , int[] dhavan){

        for(int i : ravan){
            for(int j = 0; j < dhavan.length ; j++){
                if(i == dhavan[j]){
                    System.out.println(i);
                }
            }
        }

    }
}
