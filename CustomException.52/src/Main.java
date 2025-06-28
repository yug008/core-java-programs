class LenovoException extends Exception{
    public LenovoException(String x){
        super("Calls super class constructor");       //calls the string parameterized super class constructor (of exception class)
    }
}

public class Main {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException("");
        }

        catch(ArithmeticException e1){
            System.out.println("hi");
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("hello");
        }
        catch(Exception e3){
            System.out.println("hey");
        }


        try{
            throw new LenovoException("Its a custom exception");        //throws custom exception and also calls the constructor/s of the custom exception class
        }

        catch(LenovoException e){
            System.out.println("hi");
        }

        catch(Exception e1){
            System.out.println("hello");
        }
    }
}


/* 'throw' keyword calls the constructor/s of the custom exception class. Here, there is a string argument
with the 'throw' keyword and thus the constructor/s of the custom exception class will also have a string
parameter.
 */