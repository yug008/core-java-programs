/*This is Main class. Here we will only test the codes and operations wanted by the user. The user can use
any operation(add,sum,multiply,divide) of his choice here.

If the user wants to add or subtract, then he will call the methods mentioned in the Calc class.
If the user wants to multiply or divide, then he will call the methods mentioned in the AdvCalc class.


 But if the user wants to call methods of 'Calc' class using an object of 'AdvCalc', then an error will occur
 because the methods (add & sub) aren't present/declared in 'AdvCalc'.

 There are two ways to fix the error:   1. By declaring the methods of 'Calc' class again in 'AdvCalc' class
                                           which doesnt promote code reusability.
                                        2. OR by inheriting the methods and fields present in the 'Calc class
                                           to the 'AdvCalc' class.
Thus, 'AdvCalc' will be child class and 'Calc' class will be parent class.
*/

public class Main {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();                        //Here the object 'obj' and method 'multi' both
        System.out.println(obj.mult(3, 4));            // are from the same class 'AdvCalc' so no error.

        Calc obj1 = new Calc();
        System.out.println(obj1.sub(5, 6));           //Here the object 'obj1' and method 'sub' both
                                                            //are from the same class 'Calc' so no error

        System.out.println(obj.add(5, 6));            //Here the object 'obj' is from 'AdvCalc' class and the
    }                                                       //method 'add' is from 'Calc'. Due to this an error will
}                                                           //occur. To not get an error, 'AdvCalc' inherited the
                                                            //'Calc' class .

//AdvCalc class is the child class and Calc class is the parent class.