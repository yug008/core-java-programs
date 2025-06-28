//UPCASTING...

class Sport{
    void displayName(){
        System.out.println("Sport");
    }
}
class Football extends Sport {
    void displayName() {
        System.out.println("Football");
    }
}
    class Cricket extends Sport{
        void displayName(){
            System.out.println("Cricket");
        }
    }
public class Main {
    public static void main(String[] args) {
        Sport obj = new Football();
        obj.displayName();
        Sport obj1 = new Cricket();
        obj1.displayName();

    }
}