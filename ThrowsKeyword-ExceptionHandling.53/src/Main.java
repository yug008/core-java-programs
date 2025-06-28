import java.io.IOException;

class Computer{
    public int cost(int x) throws IOException{              //this method might throw a checked exception if x=0
        if(x == 0)
            throw new IOException();
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
Computer obj = new Computer();
try{
    obj.cost(0);                                    //method call
}
catch(IOException e){
    System.out.println("hi");
}
catch(Exception e1){
    System.out.println("hello");
}
    }
}

/* here as 'throws' is used with method, the method will tell the caller(method calling) to handle the
exception and that it will not handle the exception itself.


as x=0, the method will throw an exception and the specific exception catch block will catch it and 'hi'
will be printed
 */




