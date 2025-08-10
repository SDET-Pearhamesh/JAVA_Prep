package main.java.BasicAlgoAndControlFlow;

import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        for(int i = 2 ; i < number - 1 ; i++){

            if(number % i == 0){
                System.out.println(number + " is not prime number");
                break;
            }
            else {
                System.out.println(number + " is prime number");
                break;
            }
        }

    }
}
