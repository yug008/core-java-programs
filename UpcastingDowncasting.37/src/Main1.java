//DOWNCASTING...

class Sport1{
    void displayName(){
        System.out.println("Sport");
    }
}
class Football1 extends Sport1 {
    void displayName() {
        System.out.println("Football");
    }
}
class Cricket1 extends Sport1{
    void displayName(){
        System.out.println("Cricket");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Sport1 obj = new Football1();
        Football1 obj1 = (Football1)obj;
        obj1.displayName();

        Sport1 obj3 = new Cricket1();
        Cricket1 obj2 = (Cricket1)obj3;
        obj2.displayName();

    }
}
