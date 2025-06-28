/*   Now, unlike in Main.java previously, we will make the class attributes(variables) private. Thus, now
they cant be accessed from other classes unlike we did in the previous program through dot syntax. The only
way they can be accessed is by creating Methods (Getters and Setters).
 */

class Human1{
    private int age;
    private String name;

    public int getAge(){                                //getter
        return age;
    }
    public void setAge(int a){                          //setter
        age = a;
    }
    public String getName(){                            //getter
        return name;
    }
    public void setName(String n){                      //setter
        name = n;
    }
}

public class Main1{
    public static void main(String[]args){
        Human1 obj = new Human1();
        obj.setAge(18);                                           //calling method with an argument 18
        obj.setName("Yug");                                       //calling method with an argument "Yug"

        System.out.println("The age of " + obj.getName() + " is: " + obj.getAge());
    }
}

/* First we assigned the values to the class attributes(variables) through setters and then we printed the
output through getters as getters return the value and those values were already set through setters in lines 27 and 28.
 */



