import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Getiing Input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        float b = sc.nextFloat();

        System.out.println("Enter number 2 ");
        int d = sc.nextInt();
        float e = sc.nextFloat();

        int sum = a + d;
        float sum1 = b + e;

        System.out.print("The sum of these numbers is: ");
        System.out.println(sum);
        System.out.print("The sum of these numbers is: ");
        System.out.println(sum1);
    }
}