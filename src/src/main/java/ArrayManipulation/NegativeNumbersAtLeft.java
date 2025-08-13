package ArrayManipulation;

import java.util.ArrayList;

public class NegativeNumbersAtLeft {

    public static void main(String[] args) {

        int[] numbers = {-1, 11, -2, -7, 0, 9, 99, -98};

        ArrayList<Integer> plist = new ArrayList<>();
        ArrayList<Integer> nlist = new ArrayList<>();
        int count = 0;

        for(int i = 0 ; i < numbers.length ; i++){

            if(numbers[i] < 0){
                nlist.add(numbers[i]);
            }
            else {
                plist.add(numbers[i]);
            }
        }
        nlist.addAll(plist);

        System.out.println(nlist);
    }
}
