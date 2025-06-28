class A2{
    public A2(){
        System.out.println("hi from A");
    }
    public A2(int y){
        System.out.println("hi from A2");
    }
}
class B2 extends A2{
    public B2(){
        System.out.println("hi from B");
    }
    public B2(int x){
        System.out.println("hi from B1");
    }
}

public class Main2 {
    public static void main(String[] args) {
        B2 obj1 = new B2(4);
    }
}

/* THIS IS VERY IMP CONCEPT.
now, we have added a constructor with an int paramter in class A2. Also we have created an object with an
int argument (int parameter). Now its expected that after running it will call the int parameterized
constructor of class B2 and as class B2 is inheriting from class A2, the parameterized constructor of class
A2 will also be called.

BUT NO ! THE CONSTRUCTOR WITHOUT ANY PARAMETER OF CLASS A2 WILL BE CALLED !

THIS IS BECAUSE OF SUPER() KEYWORD.

THE REASON AND CONCEPT BEHIND IT IS SHOWN IN MAIN.3 CLASS FILE.

The super() keyword is always present with the constructors. Though not generally shown while creating constructors
but its always there and present with the constructors. So, whenever a subclass constructor is called, the constructor
 of the superclass is automatically called first, even before the subclass constructor executes/gets called.

 Here, the constructor without any parameter of the superclass will be called because the super() keyword
 doesnt have any parameter. So it will only call the constructor of the superclass having no parameters.
 */









