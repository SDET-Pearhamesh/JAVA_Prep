package ArrayManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZerosToRight {

    public static void main(String[] args) {

        int[] ravan = {1 , 2, 4, 50, 0, 6, 0, 7};

        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0 ;

        for(int number : ravan){

            if(number != 0){
                list.add(number);
            }
            else {
                count++;
            }
        }

        for(int i = 1 ; i <= count ; i++){
            list.add(0);
        }
        System.out.println(list);

    }
}
