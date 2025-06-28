interface Animal{
    public abstract void sound();
}

interface Pet{
    public abstract void play();
}

class Dog implements Animal,Pet{
    public void sound(){
        System.out.println("hey");
    }
    public void play(){
        System.out.println("hi");
    }
}

public class Main {
    public static void main(String[] args) {
       Dog obj = new Dog();
        obj.sound();
      obj.play();
    }
}

/* as class dog is a non abstract class, it will have to compulsorily override all the abstract methods
of both interfaces.
 */