package NumberBased;

import java.util.Arrays;

public class ReverseInteger {

    public static void main(String[] args) {

        ReverseInteger reverseInteger = new ReverseInteger();
        reverseInteger.method1(123456789);
        reverseInteger.method2(123456789);

    }

    public void method1(int number){

        int temp = number;
        int reverse = 0;

        while ( temp != 0){

            int reminder = temp % 10 ;   // % this is modulus
            reverse = reverse * 10 +  reminder;  // need to remember
             temp = temp / 10;

        }

        System.out.println(reverse);
    }

    public void method2(int number){

        String original = String.valueOf(number);

        StringBuilder reversed = new StringBuilder(original);
        reversed.reverse();

        String reverse = String.valueOf(reversed);

        System.out.println(Integer.valueOf(reverse));
    }
}
