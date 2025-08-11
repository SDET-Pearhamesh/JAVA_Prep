package ArraysAndCollection;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortArrayAndRemoveDuplicates {

    public static void main(String[] args) {

        int[] ages = {12, 11, 9, 0, 17, 23, 01, 67, 77, 77, 65};

        Set<Integer> sorted = new TreeSet<Integer>();

        for (int age : ages){
            sorted.add(age);
        }

        System.out.println(sorted);
    }
}
