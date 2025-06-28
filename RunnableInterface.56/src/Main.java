//MULTI-THREADING BY IMPLEMENTING RUNNABLE INTERFACE..

class A implements Runnable{
public void run(){
    for(int i = 0; i<10; i++){
        System.out.println("hi");
        try{
            Thread.sleep(2);
        }
        catch(Exception e){

        }
    }
}
}

class B implements Runnable{
    public void run(){
        for(int j = 0; j<10; j++){
            System.out.println("hello");
            try{
                Thread.sleep(2);
            }
            catch(Exception e){

            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}


/* The run() is called by start(). But as the classes A and B are implementing the Runnable Interface which
only has run() present in it not start(). Thus, we cant directly create objects of the classes implementing
the runnable and use start() with them to call run() of the classes A and B.

So, as start() is present in Thread class, we will create objects of the Thread class and pass the objects
of the classes implementing the Runnable interface as arguments. Then we will call the run() methods by
using start() and thread objects.
 */