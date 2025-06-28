//FINDING NUMBER OF FIBONACCI SERIES BY TAKING INPUT FROM THE USER..


import java.util.Scanner;
public class Main1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any integer: ");
            int num = sc.nextInt();
            System.out.println(method(num));

        }
        static int method(int number){
            if(number<=1){
                return number;
            }
            return(method(number-1) + method(number-2));
        }


    }


