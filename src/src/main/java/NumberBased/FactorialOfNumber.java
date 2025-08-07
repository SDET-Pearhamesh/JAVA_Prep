package NumberBased;

public class FactorialOfNumber {

    public static void main(String[] args) {

        FactorialOfNumber factorialOfNumber = new FactorialOfNumber();
        factorialOfNumber.method(10);
    }

    public void method(int n){

        int factorial = 1;

        for(int i = n  ; i >  0; i--){
            factorial = factorial * n;
            n--;
        }

        System.out.println(factorial);
    }
}
