package NumberBased;

import java.util.Scanner;

public class CountNumberOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();

        System.out.println("Given number : " + number);

        CountNumberOfDigits countNumberOfDigits = new CountNumberOfDigits();

        countNumberOfDigits.method1(number);
        countNumberOfDigits.method2(898.0099);

    }

    public void method1(int number) {

        int temp = number;
        int count = 0;

        while (temp != 0) {

            count++;
            temp = temp / 10;
        }
        System.out.println("Method1 results : " + count);
    }

    public void method2(double number) {

        int count = 0;
        String numbersString = String.valueOf(number);
        char[] digits = numbersString.toCharArray();

        for (char digit : digits) {

            if(digit != '.') {
                count++;
            }
        }
        System.out.println("Method2 results : " + (count));


    }

}