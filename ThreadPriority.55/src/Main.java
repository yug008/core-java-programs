class A extends Thread{
    public void run(){
        for(int x = 1; x<=10; x++){
            System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int y = 0; y<10; y++){
            System.out.println("hello");
        }
    }
}

class C extends Thread{
    public void run(){
        for(int i = 1; i<=10; i++){
            System.out.println("heyy");
        }
    }
}

class D extends Thread{
    public void run(){
        for(int z = 1; z<=10; z++){
            System.out.println("yo");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        D obj4 = new D();

        obj2.setPriority(Thread.MAX_PRIORITY);            //priority set to 10
        obj1.setPriority(Thread.MIN_PRIORITY);            //priority set to 1
        obj3.setPriority(Thread.MAX_PRIORITY-6);          //priority set to 4
        obj4.setPriority(Thread.NORM_PRIORITY);           //priority set to 5

        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
    }
}



/*  To set the priority of a particular thread then first create an object/instance of that thread and then
use the 'setPriority' method with the respective object of that thread to set the thread priority.
 */