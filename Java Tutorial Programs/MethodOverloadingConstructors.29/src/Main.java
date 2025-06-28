public class Main {
    public Main() {
        System.out.println("hi");
    }

    public Main(int x, String y) {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Main obj1 = new Main();
        Main obj2 = new Main(8, "Yug");
        Main obj3 = new Main(78, "xyz");
        Main obj4 = new Main(100, "ux");
    }
}

//here, we created 2 constructors with same name but different parameters. This is known as Method Overloading (in constructors).
//The first constructor is called 2 times because we created 2 objects with its respective parameters. (here its none)
//The second constructor is called 3 times because we created 3 objects with its respective parameters. (here its an int and a string)