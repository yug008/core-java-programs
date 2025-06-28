public class Main {
    public static void main(String[] args) {
        int a = 3;
        float b = 4.5f;

        //here 'a' is represented by %d. 'b' is represented by first %f.

        System.out.printf("The two numbers 'a' and 'b' are %d and %f", a,b);


        float sum = a + b;
        System.out.printf("The sum of %d and %f is %f", a,b,sum);

        //Here the 'sum of a and b' is represented by %f.Its because we can already predict that
        //int+float=float.Thus the sum of 'a' and 'b' will be a float. Hence we used %f.
        












    }
}