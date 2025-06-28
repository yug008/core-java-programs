//MULTI-THREADING BY RUNNABLE INTERFACE USING LAMBDA EXPRESSIONS...

public class Main1 {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for(int i = 0; i<10; i++){
                System.out.println("hi");
                try{
                    Thread.sleep(2);
                }
                catch(Exception e){

                }
            }
        };

        Runnable obj2 = () -> {
            for(int j = 0; j<10; j++){
                System.out.println("hello");
                try{
                    Thread.sleep(2);
                }
                catch(Exception e){

                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}


/* Here we did multiple threading using Runnable Interface by using Lambda Expressions. As we are providing
our own implementations of the run() methods, we can use Lambda expressions in which we only just have to
provide own implementations of the run() present in Runnable interface IMPLICITLY.

In lamda expressions we only have to provide implementations. The compiler will itself create objects and
override the run() methods, we just have to provide implementation of run().

But, creation of thread objects and passing Runnable objects as arguments is ALWAYS COMPULSORY !

Then, we will simply use the thread objects with start() to call the run().
 */