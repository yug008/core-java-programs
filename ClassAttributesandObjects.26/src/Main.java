/*  Here, we will create a class and its class attributes(variables). Then we will assign values to those
attributes/variables by creating objects and through dot syntax  */

class Human{
    int age;
    String name;
}

public class Main {
    public static void main(String[] args) {

        Human obj = new Human();
        obj.age = 18;                           //dot syntax (assigning values to class attributes/variables with an object)
        obj.name = "Yug";

        System.out.println("The age of " + obj.name + " is: " + obj.age);
    }
}