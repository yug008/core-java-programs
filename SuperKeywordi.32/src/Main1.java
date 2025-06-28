class A1{
    public A1(){
        System.out.println("hi from A");
    }
}
class B1 extends A1{
    public B1(){
        System.out.println("hi from B");
    }
    public B1(int x){
        System.out.println("hi from B1");
    }
}

public class Main1 {
    public static void main(String[] args) {
        B1 obj1 = new B1();
    }
}


/*here we have added a parameterized constructor which accepts an int value. But as the object called does
not have an argument which associates with the int parameter of constructor B1, it will only call the
constructor B1 and A1.
 */









