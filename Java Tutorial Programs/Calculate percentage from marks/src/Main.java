import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Welcome " + name );
        System.out.print("Please provide us your marks.");
        System.out.println(" Your test included a total of 300 marks.");
        System.out.println("Enter your physics marks:");
        int marks1 = sc.nextInt();
        System.out.println("Enter your chemistry marks:");
        int marks2 = sc.nextInt();
        System.out.println("Enter your maths marks:");
        int marks3 = sc.nextInt();
        int sum = marks1 + marks2 + marks3;
        float percentage = sum/300f*100;
        System.out.println("Your percentage is: " + percentage);

    }
}