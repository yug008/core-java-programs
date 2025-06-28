public class Main {
    public static void main(String[] args) {
      int [] array = new int[5];
      try{
          System.out.println(array[9]);             // will throw an ArrayIndexOutOfBoundsException
      }

      catch(ArithmeticException e){                       //specific exception catch block
          System.out.println("Can't divide by zero.");
      }

      catch(ArrayIndexOutOfBoundsException e){                  //specific exception catch block
          System.out.println("This array is only uptil index 4.");
      }

      catch(Exception e){                                    //general exception catch block
          System.out.println("there is an exception!");
      }
    }
}


/* In 'Try with Multiple Catch' , we will use the specific exception catch blocks before the general exception
catch blocks. The general exception catch blocks will be used at the end.

Thus it is recommended to use all the specific exception catch blocks first, and then at the end use the
general exception catch block to avoid errors.
 */