class A5{
    public A5(){
        super();
        System.out.println("hi from A");
    }
    public A5(int y){
        super();
        System.out.println("hi from A2");
    }
}
class B5 extends A4{
    public B5(){
        super(6);
        System.out.println("hi from B");
    }
    public B5(int x){
        super();
        System.out.println("hi from B1");
    }
}

public class Main5 {
    public static void main(String[] args) {
        B5 obj1 = new B5();
    }
}




/* this will call the constructor without parameters of the subclass and the constructor with paramters of
the super class.

The reason why it called the superclass constructor with parameters and not the one without parameters is
because when the subclass constructor was called, we added a parameter in its respective super(), which
will then call the superclass constructor with parameters.(in line 13)
 */