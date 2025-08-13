package ArrayManipulation;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {

        int[] numbers = {1 ,2 ,3 ,4, 1, 1, 1, 1, 2, 4, 0, 1, 1, 1};
        int majoritySize = numbers.length/2 ;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int number : numbers){
            hashMap.put(number , hashMap.getOrDefault(number , 0) + 1 );
        }

        for(Map.Entry<Integer , Integer> entry : hashMap.entrySet()){

            if(entry.getValue() > majoritySize){
                System.out.println(entry.getKey());
            }
        }
    }
}
