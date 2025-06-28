//Variable Arguments are in short known as Varargs.


// 1. WE WILL DO THE SUMMATION OF VARYING ARGUMENTS  (USING FOR LOOP)

class Boltzmann {
    int wizard(int... n) {                    //'n' will become an array of set of variable arguments.
        int sum = 0;
        for (int i : n) {                     // let 'i' be an integer in the array set 'n'
            sum = sum + i;
        }
        return sum;                            // returns the sum of the varying arguments which the user desires.
    }
}


public class Main {
    public static void main(String[] args) {
        Boltzmann obj = new Boltzmann();                                       //object creation
        System.out.println("The sum of 3 & 4 is: " + obj.wizard(3,4));      //calling method using object creation
        System.out.println("The sum of 32 & 34 is: " + obj.wizard(32,34));    //calling method using object creation

    }
}


