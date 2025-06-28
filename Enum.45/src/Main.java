public class Main {
    public static void main(String[] args) {
        enum day{
            Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        }

        day var = day.Thursday;
        System.out.println(var.ordinal());                  // gives position of the constant

    day var1 = day.valueOf("Wednesday");
        System.out.println(var1);                     //converts string to its corresponding enum constant

        for( day x : day.values()){              // gives the entire group of constants present in an enum
            System.out.println(x);
        }
    }
}