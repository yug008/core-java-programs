class Audi{
    public int add(int x, int y){
        return x + y;
    }
    public float method2(int x, int y){
        return x + y;
    }
}

class Porsche extends Audi{
    public int add(int x, int y){
        return x + y + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Porsche obj = new Porsche();
        obj.add(3,4);
        System.out.println(obj.add(3,4));
    }
}

/*
As the same method 'Add' was present in both classes audi and porsche, when the method was called using object
creation, the behaviour/implementation of the method in subclass was implemented and the method in subclass
was called.

NOTE: The reason why subclass method got called is because of Run time polymorphism.
 */