@FunctionalInterface
interface week{
    public abstract int meth();
}

@FunctionalInterface
interface Year{
    public abstract void meth1(int x);
}

@FunctionalInterface
interface Car{
    public abstract String gas(String cost, String company);
}

public class Main {
    public static void main(String[] args) {
        week obj = () -> {                                        //lambda expression
            return 0;
        };
        System.out.println(obj.meth());

        Year obj1 = (int x) -> {                                 // lambda expression

        };
        System.out.println("No return due to void");

        Car obj2 = (String cost, String company) -> {                 //lambda expression
            return "A good gas from a good company!";
        };
        System.out.println("Cost efficient !");
    }
}


/* here, the compiler will declare the object and override the method 'meth' implicitly as lambda expression
is used. We added the return statement which is the own implementation of the overriden method in the
body of the lambda expression.

Hence, the lambda expression reduces the code. It will tell the compiler to declare the object and override
the method. We have just added the 'return' statement which is the own implementation of the overriden
method.

Genrally you cant create objects of an abstract class or an interface. But when you use Lambda expression
you can create objects of the interface / functional interface.

Always the logic of printing/print statement is used outside the lambda expression.
 */