import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income tax.");
        double a = sc.nextFloat();

        if(a<2.5f){
            System.out.println("You dont have to pay any income tax");
        }
        else if(a>=2.5f && a<=5f){
            System.out.println("You have to pay 5% tax");
        }
        else if(a>=5f && a<=10f){
            System.out.println("You have to pay 20% tax");
        }
        else if(a>10f){
            System.out.println("You have to pay 30% tax");
        }



        //see Question 3 in chapter4 practice set from codewithharry pdf