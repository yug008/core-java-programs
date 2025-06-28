class Pacifica{
    int reflections(int x, int y){                    //declaring a method
        int z;
        if(x>y) {
            z = (x + y) * 2;
        }
        else {
            z = (x - y) * 2;
        }
        return z;
        }
    }



    public class Main{
    public static void main(String[]args) {

        int a = 5;
        int b = 6;

        Pacifica obj = new Pacifica();            //object creation

        int c = obj.reflections(a, b);            //calling method by object creation

        System.out.println("The value of c is: " + c);
    }
    }































































