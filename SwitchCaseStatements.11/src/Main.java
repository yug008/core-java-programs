import java.util.Scanner;
public class Main {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age:");
    int age = sc.nextInt();

    switch(age){
        case 16:
            System.out.println("You are immature");
            break;
        case 23:
            System.out.println("You have matured");
            break;
        case 40:
            System.out.println("You have become old");
            break;
        case 60:
            System.out.println("You are a senior citizen");
            break;
        default:
            System.out.println("Enjoy your life!");
    }


    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter your name:");
String name = sc1.nextLine();

switch(name) {
    case "Harry":
        System.out.println("Welcome to the store");
        break;
    case "Priyanshi":
        System.out.println("Congratulations on the wedding");
        break;
    case "Vedant":
        System.out.println("Thank you so much");
        break;
    case "Varun":
        System.out.println("Thanks brother");
        break;
    default:
        System.out.println("Thanksss");
        break;
}


Scanner yt = new Scanner(System.in);
    System.out.println("Enter any alphabet:");
String y = yt.nextLine();
switch(y) {
    case "A":
        System.out.println("You are Hard working");
        break;
    case "M":
        System.out.println("You are the best");
        break;
    case "K":
        System.out.println("You are really great!");
        break;
    default:
        System.out.println("You are charismatic");
        break;
}


//Below is what happens when the 'break;' is not added/used at the end of any case in switch case statements

    Scanner z = new Scanner(System.in);
    System.out.println("Enter your age:");
int years = z.nextInt();
switch(years){
    case 18:
        System.out.println("You are an adult");
    case 30:
        System.out.println("You are in your prime");
    case 50:
        System.out.println("You are in middle age");
    case 70:
        System.out.println("u are old");
        break;
    case 100:
        System.out.println("u are dead");
        break;
}

// here as the 'break' statement isnt used at the end of each case, the output statements of the next cases
    // will also be printed until a case with a break statement isnt found.














    }
}