// THIS INCLUDES THE SAME CONCEPT OF 'TAKING INPUT FROM THE USER.3' using Scanner.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Getting input from the user: ");
        Scanner sc = new Scanner(System.in);
        boolean a1 = sc.hasNextInt();
        System.out.println(a1);
    }

}