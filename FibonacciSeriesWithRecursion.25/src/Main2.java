//2ND METHOD (FAST OUTPUT RATE EVEN FOR LARGER NUMBERS)


public class Main2 {
    private static long [] arr;
    public static void main(String[] args) {
        int number = 100;
        arr = new long[number +1];
        System.out.println(fibonacci(number));
    }

    static long fibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        if(arr[number] != 0){                                       // '!=' means 'Not Equal To'
            return arr[number];                                     // after saving the values, this if conditional is used to use the values after saving them.
        }
        long nthFibonacciNumber = fibonacci(number -1) + fibonacci(number -2);
        arr[number] = nthFibonacciNumber;
        return nthFibonacciNumber;              //here as method is called inside the same method/method calls itself, this indicates Recursion.
    }
}



