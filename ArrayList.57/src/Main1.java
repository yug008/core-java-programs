import java.util.ArrayList;
public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer>num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        System.out.println(num);

        //using get() method to get values of array list at a particular index.
        System.out.println(num.get(0));
        System.out.println(num.get(4));
        System.out.println(num.get(3));

        //using set() method to set values of array list at a particular index.
        System.out.println(num.set(2,10));            //changing value of the int at 2nd index
        System.out.println(num.set(4,100));           //changing value of the int at 4th index

        System.out.println(num);
    }
}
