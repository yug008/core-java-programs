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
        super(3);
        System.out.println("hi from B1");
    }
}

public class Main4 {
    public static void main(String[] args) {
        B4 obj1 = new B4(4);
    }
}


/* if we want to call the constructor of super class with parameters, then we will need to assign a parameter
in the super() keyword of the constructor of the subclass which is called. (in line 17)
 */