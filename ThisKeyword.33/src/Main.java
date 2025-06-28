class A4{
    public A4(){
        super();
        System.out.println("hi from A");
    }
    public A4(int y){
        super();
        System.out.println("hi from A2");
    }
}
class B4 extends A4{
    public B4(){
        super();
        System.out.println("hi from B");
    }
    public B4(int x){
        this();                                              // calls the constructor of the same class B4 having mo parameters.
        System.out.println("hi from B1");
    }
}

public class Main {
    public static void main(String[] args) {
        B4 obj1 = new B4(4);
    }
}


/* This() keyword calls the constructor of the same class. Here, after the object 'obj1' calls the
 parameterized constructor of the class B4, it will first run the this() of the respective constructor as per
 the order. Thus, due to this(), the constructor of the same class (without parameters) is called. Then as the
 constructor without parameters has a super(), it will first call the constructor of super class which has no
 parameters.

 Thus, the output of the super class constructor will be printed first, then the constructor which was called
 by this() and at the end the constructor which was called by object creation.

 */