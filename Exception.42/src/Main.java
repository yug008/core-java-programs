public class Main {
    public static void main(String[] args) {
       try{
           int [] numbers = {1,2,3,4,5};
           System.out.println(numbers[8]);
       }

       catch(Exception jj){
            System.out.println("Due to exception, this is printed.");
        }

       try{
           int j;
           j = 24/0;                              // throws an ArithmeticException
       }

       catch(Exception e){
           System.out.println("Not possible as any number divided by 0 is undefined.");
       }

    }
}