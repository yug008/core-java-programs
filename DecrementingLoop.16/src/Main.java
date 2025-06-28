import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert any number you want to do a decreasing for loop:");
    int x = sc.nextInt();

    for(int i = x; i>0; i--){
        System.out.println(i);
    }



    // LETS DO IT WITH WHILE LOOP


        System.out.println("Insert any number for decreasing while loop:");
    int y = sc.nextInt();
    int var = y;
    while(var>0){
        System.out.println(var);
        var--;
    }















    }
}