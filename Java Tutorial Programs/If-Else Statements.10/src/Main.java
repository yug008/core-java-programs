import java.util.Scanner;
public class Main {
   public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Hello user, enter any number");
       int a = sc.nextInt();

       if(a>18) {
           System.out.println("You are ready to drive.");
       }
       else{
           System.out.println("You cant drive.");
       }



       //USING 'IF-ELSE-IF-ELSE LADDER':
       Scanner sc1 = new Scanner(System.in);
       System.out.println("Enter your age:");
       int x = sc1.nextInt();
       if(x<25) {
           System.out.println("You are inexperienced");
       }
       else if(x<50) {
           System.out.println("You are semi experienced");
       }
       else if(x<75) {
           System.out.println("You are experienced");
       }
       else if(x>=75) {                                       //greater than or equal to age 75 years
           System.out.println("You are highly experienced");
       }
       else if(x>=18) {
           System.out.println("You have become an adult");
       }
       else{
           System.out.println("Not available");
       }


    }
}