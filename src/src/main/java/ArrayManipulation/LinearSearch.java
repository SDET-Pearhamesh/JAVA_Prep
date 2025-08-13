package ArrayManipulation;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        // Linear search means searching one by one

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the search element : ");
        int[] dhavan = {2 , 3 , 4, 5, 6, 7 };
        int target = scan.nextInt() ;
        boolean flag = false;

        for(int eachNum : dhavan){
            if(eachNum == target){
                System.out.println(eachNum);
                flag  = true;
            }
        }
        if(!flag){
            System.out.println("Number not found");
        }
    }
}
