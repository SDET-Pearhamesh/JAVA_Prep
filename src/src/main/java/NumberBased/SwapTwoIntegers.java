package NumberBased;

public class SwapTwoIntegers {

    public static void main(String[] args) {

        SwapTwoIntegers swapTwoIntegers = new SwapTwoIntegers();
        swapTwoIntegers.method1(-100 , -99);
        swapTwoIntegers.method2(100 , 99);

    }

    public void method1(int a , int b){

        System.out.println("Value of a : "+ a + " & " + "Value of b : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a : "+ a + " & " + "Value of b : " + b);
    }

    public void method2(int a , int b){

        System.out.println("Value of a : "+ a + " & " + "Value of b : " + b);

        int c = a;
        a = b ;
        b = c ;

        System.out.println("Value of a : "+ a + " & " + "Value of b : " + b);
    }


}
