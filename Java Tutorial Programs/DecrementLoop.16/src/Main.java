import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//USING WHILE LOOP...
        System.out.println("Enter any number for decrement loop:");
        int number = sc.nextInt();
        int var = number;
        while(var>0){
            System.out.println(var);
            var--;
        }


//USING FOR LOOP...
        System.out.println("Enter any number for decrement loop:");
        int num1 = sc.nextInt();
        for(int variable = num1; variable>0; variable--){
            System.out.println(variable);
        }


//USING GENERATION OF RANDOM NUMBER... with While Loop and For Loop

Random rand = new Random();
        int num2 = rand.nextInt(101);
        System.out.println("The random number is: " + num2);
        int x = num2;
        while(x>0){
            System.out.println(x);
            x--;
        }

int num3 = rand.nextInt(101);
        for(int y = num3; y>0; y--){
            System.out.println(y);
        }













    }
}