/* FOR NON ABSTRACT CLASS IMPLEMENTING AN INTERFACE..
In this, the implementing class being a non abstract class has to compulsorily override all the abstract
methods of the interface.
 */


interface Bubble{
    public abstract String meth();          //abstract method
    public abstract int meth1();            //abstract method
}

class Glass implements Bubble{                   //Non abstract class
    public String meth(){
        return "Hello";
    }
    public int meth1(){
        return 8;
    }
}

public class Main {
    public static void main(String[] args) {
Bubble obj = new Glass();
        System.out.println(obj.meth());
        System.out.println(obj.meth1());
    }
}