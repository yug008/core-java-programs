public class Main {
    int age;
    String name;
    public Main() {
        System.out.println("printed!");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Main obj1 = new Main();
        Main obj2 = new Main();
        Main obj3 = new Main();
        Main obj4 = new Main();
    }
}


//here we created objects 5 times, thus, the constructor will be called 5 times.