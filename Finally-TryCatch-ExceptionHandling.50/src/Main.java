public class Main {
    public static void main(String[] args) {
      int [] price = {100, 200, 300 ,400 ,500};

      try{
          System.out.println(price[5]);                     //throws an ArrayIndexOutOfBounds Exception
      }

      catch(ArrayIndexOutOfBoundsException e){
          System.out.println("Out of array index");
        }

      catch(Exception e){
          System.out.println("Nothing here");
      }

      finally{
          System.out.println("Hey");                             // this will always be executed.
      }
    }
}