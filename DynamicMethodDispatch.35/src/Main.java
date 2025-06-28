class Audi{
    public int add(int x, int y){
        return x + y;
    }
    public float method2(int x, int y){
        return x + y;
    }
}

class Porsche extends Audi{
    public int add(int x, int y){
        return x + y + 1;
    }
}

class Lambhorghini extends Porsche{
    public int add(int x, int y){
        return x + y + 2;
    }
}

public class Main {
    public static void main(String[] args) {
       Audi obj = new Porsche();                        //calling method of 'Porsche' class
       System.out.println(obj.add(3,4));

       obj = new Audi();                                //calling method of 'Audi' class
        System.out.println(obj.add(3,4));

        obj = new Lambhorghini();                       //calling method of 'Lambhorghini' class
        System.out.println(obj.add(3,4));

    }
}

/*In line 27, we created a new reference class for object 'obj' because we wanted to call overriden method of
class 'Audi'.

In line 30, we created a new reference class for object 'obj' because we wanted to call overriden method of
class 'Lambhorghini'.

The type of class should be the superclass.

 firstly, we wanted to call the overriden method of porsche class using the same method, so we used audi(superclass)
 as type of class and porsche as a reference class because we want to call its respective overriden method.

 */

