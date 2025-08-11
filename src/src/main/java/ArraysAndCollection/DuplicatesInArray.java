package ArraysAndCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicatesInArray {

    public static void main(String[] args) {

        int[] ages = {11, 11, 9, 0, 0,  17, 23, 01, 67, 77, 77, 65};

        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        TreeSet<Integer> unique = new TreeSet<Integer>();

        for (int age : ages) {
            if(unique.add(age)){
                unique.add(age)   ;
            }
            else {
                duplicates.add(age);
            }
        }
        System.out.println("Duplicates - "+ duplicates);
        System.out.println("Unique - "+ unique);
    }
    }

