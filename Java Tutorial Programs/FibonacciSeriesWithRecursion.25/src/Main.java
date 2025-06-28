//1ST METHOD (SLOW OUTPUT RATE FOR LARGER NUMBERS)
//FIND THE nth NUMBER IN THE FIBONACCI SERIES..

public class Main {
    public static void main(String[] args) {
        //Lets find the number at 9th place.
        int number = 9;
        System.out.println(fibonacci(number));
    }

    static long fibonacci(int number){
        if (number<=1){
            return number;
        }
        return(fibonacci(number-1) + fibonacci(number-2));               //here as method is called inside the same method/method calls itself, this indicates Recursion. ALso this statement gives us the hint about FIBONACCI SERIES.
    }

}