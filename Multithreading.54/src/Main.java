class A extends Thread{
    public void run(){
       for(int i = 0; i<10; i++){
            System.out.println("hi");
           try {
               Thread.sleep(1);                  //sleep for 1 millisecond
           }
           catch(InterruptedException e){

           }
        }
       }
}

class B extends Thread{
    public void run(){
     for(int i = 0; i<10; i++){
            System.out.println("hello");
         try {
             Thread.sleep(1);                   //sleep for 1 millisecond
         }
         catch(InterruptedException e1){

         }
        }
     }
}

public class Main {
    public static void main(String[] args) {
A obj1 = new A();
B obj2 = new B();

obj1.start();                                          //calling run method of A using start()
obj2.start();                                          //calling run method of B using start()
    }
}




/* here, as class A and B are extending the 'Thread' class, they can also be called as Threads.

We called run() which is present and overriden in both classes A and B using the start(), after creating
objects of both the threads A and B.

Then we used thread.sleep() method so that threads can be executed concurrently/parallelly.

We set the thread sleep time as 1 millisecond so that the execution of both threads stop simultaneously after
1 millisecond.

But, the 'thread.sleep()' method throws an InterruptedException, thus, we will implement it in try-catch
block.


As class A/thread A prints 'hi' one time, then it sleeps/its execution gets paused for 1 millisecond.
During this time, thread B will print 'hello' but after that immediately, it will also pause its execution
for 1 millisecond. Thus,like this, the execution of multiple threads occurs concurrently or parallelly.
This is the reason we use thread.sleep() method.


 */