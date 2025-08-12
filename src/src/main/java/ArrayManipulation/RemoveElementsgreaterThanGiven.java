package ArrayManipulation;

import java.util.ArrayList;

public class RemoveElementsgreaterThanGiven {

    public static void main(String[] args) {

        int[] ravan = {1 , 2, 4, 50, 0, 6, 0, 7};
        int limit = 5;

        ArrayList<Integer> list = new ArrayList<>();

        for(int number : ravan){
            if(number <= limit){
                list.add(number);
            }
        }

        System.out.println(list);
    }
}
