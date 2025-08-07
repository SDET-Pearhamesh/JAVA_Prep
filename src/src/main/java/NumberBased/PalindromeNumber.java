package NumberBased;

public class PalindromeNumber {

    public static void main(String[] args) {

        PalindromeNumber reverseInteger = new PalindromeNumber();
        reverseInteger.method1(1121);
        reverseInteger.method1(121);

    }

    public void method1(int number){

        int temp = number;
        int reverse = 0;

        while ( temp != 0){

            int reminder = temp % 10 ;   // % this is modulus
            reverse = reverse * 10 +  reminder;  // need to remember
            temp = temp / 10;

        }
        if(reverse == number) {
            System.out.println("Given number is palindrome");
        }
        else {
            System.out.println("Given number is not palindrome");
        }
    }

    public void method2(int number){

        String original = String.valueOf(number);

        StringBuilder reversed = new StringBuilder(original);
        reversed.reverse();

        String reverse = String.valueOf(reversed);

        if(reverse.equals(original)){
            System.out.println("Given number is palindrome");
    }
        else {
            System.out.println("Given number is not palindrome");
        }
    }
}
