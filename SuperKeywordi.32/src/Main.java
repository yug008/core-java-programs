class A{
    public A(){
        System.out.println("hi from A");
    }
}

class B extends A{
    public B(){
        System.out.println("hi from B");
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
    }
}


/*Here class B is child class and class A is parent class. Here, an object of class B is created. Thus, it
will call the constructor of class B. But as class B is inheriting from class A, the constructor of class A
will also be called along.

If object of class A is called then only the constructor of class A will be called. But if the object of class
B is called, then the constructor of classes A and B both will be called.
 */