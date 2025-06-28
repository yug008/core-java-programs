import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>numerics = new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,7));

        /* if you want to get all the values of an array list, you can either use a for loop or an enhanced
        for loop generally.

        But you can also use ForEach method.
         */

        numerics.forEach(n -> System.out.println(n));
    }
}

/* forEach method here states that -- for each value of the variable n, print n. Thus , it will print all
the values of the arraylist.
 */