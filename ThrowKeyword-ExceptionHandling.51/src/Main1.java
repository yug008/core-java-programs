import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();

        try{
            int y;
            y = 20/x;

            if(x == 0)
                throw new ArithmeticException("Will be thrown if x is zero.");
        }

        catch(ArithmeticException e1){
            System.out.println("hi");
        }

        catch(Exception e2){
            System.out.println("hey");
        }

    }
}



/* here, even if we dont us the 'if' conditional in line 12, if the value of x=0 then nevertheless the try
block will throw an exception even if the 'if' conditional isnt used.
 */