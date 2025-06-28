class A3{
    public A3(){
        super();
        System.out.println("hi from A");
    }
    public A3(int y){
        super();
        System.out.println("hi from A2");
    }
}
class B3 extends A3{
    public B3(){
        super();
        System.out.println("hi from B");
    }
    public B3(int x){
        super();
        System.out.println("hi from B1");
    }
}

public class Main3 {
    public static void main(String[] args) {
        B3 obj1 = new B3(4);
    }
}


/*The super() keyword is always present with the constructors. Though not generally shown while creating constructors
but its always there and present with the constructors. So, whenever a subclass constructor is called when an
 object is declared, the constructor of the superclass is automatically called first, even before the
 subclass constructor executes/gets called. Thats why the output of the superclass constructor is printed
 first.

 Here, the constructor without any parameter of the superclass will be called because the super() keyword
 doesnt have any parameter. So it will only call the constructor of the superclass having no parameters.

 In Java, the super() keyword is used to call a constructor of the parent (superclass) class from a subclass.
 When a subclass constructor is called, it automatically invokes the constructor of the parent class.

 Thus, the constructor(no parameters) of class A3 is called as the super() present in the subclass doesnt
 have any parameters.
 */
