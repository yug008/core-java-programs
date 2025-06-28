abstract class Car{                              // abstract class

    public abstract void Lights();               //abstract method
public abstract void wheels();                   //abstract method
public String radio(){
    return "Turn the music on !";
  }
}

class Mercedes extends Car{
    public void Lights(){

    }
    public void wheels(){

    }
    public String cost(){
        return "Its a bit costly.";
    }
}


public class Main {
    public static void main(String[] args) {
        Car obj = new Mercedes();
        obj.Lights();
        obj.wheels();

        Mercedes obj1 = new Mercedes();
        System.out.println(obj1.cost());
    }
}


/* As mercedes inherited the car class and as the car class was an abstract class, we have to compulsorily
override / do method overriding of its abstract methods which are 'lights' and 'wheels'. We can add other
methods in the abstract class as per our wish such as 'radio' unless its also an abstract method.

Its compulsory for abstract methods to always belong to abstract classes. Thus, 'Car' is an abstract class.

We cant create an object of the abstract class. Thus we used reference class as the subclass 'Mercedes',
to call the overriden methods.
 */