package NumberBased;

public class OctalConversion {

    public static void main(String[] args) {

       OctalConversion octalConversion = new OctalConversion();
       octalConversion.method(59);
    }

    public void method(int number){

        StringBuilder octalBuilder = new StringBuilder();

        int result = 0 ;

        while(number > 0){

           int reminder = number % 8 ;
           octalBuilder.insert(0 , reminder); // Prepend the remainder to the string builder
           number = number / 8 ;
        }

        System.out.println(octalBuilder.toString());
    }
}
