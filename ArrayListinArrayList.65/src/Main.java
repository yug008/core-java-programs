import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     ArrayList<ArrayList<Integer>>list = new ArrayList<>();

     ArrayList<Integer>r1 = new ArrayList<>();
     r1.add(1);
     r1.add(2);
     r1.add(3);

     list.add(r1);

     ArrayList<Integer>r2 = new ArrayList<>();
     r2.add(10);
     r2.add(20);
     r2.add(30);

     list.add(r2);

     ArrayList<Integer>r3 = new ArrayList<>(Arrays.asList(100,200,300));

     list.add(r3);

        System.out.println(list);
    }
}