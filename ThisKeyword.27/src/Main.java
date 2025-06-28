/*  'This' keyword id ued to eliminate the confusion between class attributes(variables) and parameters having the
same name. Here, both class attributes and parameters 'age' and 'name' have the same name. Thus, it is recommended
that during this situation only we must use 'this' keyword. */



class Human1{
    private int age;
    private String name;

    public int getAge(){                                //getter
        return age;
    }
    public void setAge(int age){                          //setter
       this.age = age;
    }
    public String getName(){                            //getter
        return name;
    }
    public void setName(String name){                      //setter
        this.name = name;
    }
}

public class Main{
    public static void main(String[]args){
        Human1 obj = new Human1();
        obj.setAge(18);                                           //calling method with an argument 18
        obj.setName("Yug");                                       //calling method with an argument "Yug"

        System.out.println("The age of " + obj.getName() + " is: " + obj.getAge());
    }
}