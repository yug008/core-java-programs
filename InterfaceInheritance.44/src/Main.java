interface Car{
    public abstract void drive();
}

interface Jeep extends Car{
    public abstract void brakes();
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/* As the interface 'jeep' inherits the interface 'car', it can declare its own abstract methods, in
addition to inheriting the abstract methods from the parent interface.
 */