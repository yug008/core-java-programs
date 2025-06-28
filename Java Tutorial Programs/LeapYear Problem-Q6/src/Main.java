import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter any year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        //for a year to be considered as a leap year, that particular year should have  a remainder 0 when
        //its divided by both 4 and 400

        if(year%4 == 0){
            System.out.println("Its a leap year");
        }
else if(year%400 == 0){
            System.out.println("Its a leap year");
        }
else{
            System.out.println("Its not a leap year");
        }

















    }
}