// Q-- WRITE A PROGRAM TO PRINT ALL NATURAL NUMBERS FROM n to 1 USING RECURSION.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Write any number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        meth(number);
    }
    static void meth(int number) {
        if(number<1){
            return ;                                    //here there is simply only 'return', not any returntype or variable after 'return' because the return type of the method is 'Void'.
        }
        System.out.println(number);
        meth(number - 1);
    }
}