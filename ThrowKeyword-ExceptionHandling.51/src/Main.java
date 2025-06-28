

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
    }
}





/* here, we used 'throw' keyword which throws an exception (arithmetic) inside a try block. This arithmetic
exception is then caught by arithmetic exception catch block.
 */