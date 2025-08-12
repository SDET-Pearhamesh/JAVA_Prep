package ArraysAndCollection;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonrepeatingElement {

    public static void main(String[] args) {

        int[] numbers = {1 , 2, 3, 4 , 5, 1, 2, 3, 5, 6};

        LinkedHashMap<Integer , Integer> linkedHashMap = new LinkedHashMap<>();

        for(int number : numbers){

            linkedHashMap.put(number , linkedHashMap.getOrDefault(number , 0) + 1 );

        }

        for(Map.Entry<Integer , Integer> entry : linkedHashMap.entrySet()){

            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
