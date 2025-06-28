class Boltzmann{
     int wizard(int x , int y){                     // declaring a method
        int z;
        z = x + y;
        return z;
    }
}

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        Boltzmann obj = new Boltzmann();            //object creation
        int c = obj.wizard(a,b);                    //calling method by object creation
        System.out.println(c);

    }
}













