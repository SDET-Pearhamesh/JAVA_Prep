package BasicAlgoAndControlFlow;

public class SumOfDigitsInNumber {


    public static void main(String[] args) {

        SumOfDigitsInNumber sumOfDigitsInNumber = new SumOfDigitsInNumber();
        sumOfDigitsInNumber.method(123);

    }

    public void method(int number){

        int sum = 0 ;

        while( number != 0){

            int digit = number % 10 ;
            sum = sum + digit ;
            number = number / 10 ;

        }
        System.out.println("Sum of digits is " + sum);

    }
}
