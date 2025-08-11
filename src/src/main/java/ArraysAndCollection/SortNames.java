package ArraysAndCollection;

import java.util.Arrays;
import java.util.TreeSet;

public class SortNames {

    public static void main(String[] args) {

        String[] names = {"Zara" , "John" , "Alice" , "Bob" , "Rob" , "Eve"};

        //Method 1
        TreeSet<String> orderedNames = new TreeSet<>(Arrays.asList(names));
        System.out.println(orderedNames);


        String[] kids = {"Zara" , "John" , "Alice" , "Bob" , "Rob" , "Eve"};
        //Method 2
        Arrays.sort(kids);
        System.out.println(Arrays.toString(kids));
    }

}
