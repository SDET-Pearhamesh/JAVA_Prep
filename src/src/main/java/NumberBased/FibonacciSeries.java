package NumberBased;

public class FibonacciSeries {

    public static void main(String[] args) {

        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.method(1 ,5 , 10);
    }

    public void method(int first , int second, int n){

        for(int i = 1 ; i <= n ; i++){

            System.out.println(first);  // To be remembered
            int next = first + second ;
            first = second;
            second = next;
        }
    }
}
