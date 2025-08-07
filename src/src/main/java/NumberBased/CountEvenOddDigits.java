package NumberBased;

import java.lang.reflect.Array;

public class CountEvenOddDigits {

    public static void main(String[] args) {

        CountEvenOddDigits countEvenOddDigits = new CountEvenOddDigits();
        countEvenOddDigits.method(123456789);
    }

    public void method(int number){

       int oddCount = 0;
       int evenCount = 0;

       while (number != 0){

           int digit = number  % 10;

           if(digit % 2 == 0){
               evenCount++;
           }
           else {
               oddCount++;
           }

           number = number / 10;
       }

       System.out.println("Count of odd digits : " + oddCount);
        System.out.println("Count of even digits : " +evenCount);
    }
}
