class Dog{
    public void bark(){
        System.out.println("I hate dogs!");
    }
}

public class Main {
    public static void main(String[] args) {
       Dog obj = new Dog(){
           public void bark(){                        //method overriding present in the body of anonymous inner class
               System.out.println("I love dogs!");
           }
       };
       obj.bark();
    }
}