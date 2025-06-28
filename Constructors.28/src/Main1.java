class Yug {
   private int age;
     private String name;

    public Yug(int a, String n) {                           //constructor
        age = a;
        name = n;
    }

    public int getAge() {                                   //getter
        return age;
    }

    public String getName() {                               //getter
        return name;
    }
}

        public class Main1{
    public static void main(String[] args) {
        Yug obj = new Yug(12, "John");                                 //object
        System.out.println(obj.getAge() + " " + obj.getName() );
    }
}




/* Here, we used object creation and constructor to assign values to the class attributes(variables). Then, we
created Getters to return the values of those class attributes. And at the end as we wanted an output we printed
the method calling statements using object.
 */