import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
       ArrayList<Integer>nums = new ArrayList<Integer>();
       nums.add(0);
       nums.add(1);
       nums.add(2);
       nums.add(3);

       Iterator<Integer>oct = nums.iterator();
       while(oct.hasNext()){
           System.out.println(oct.next());
       }
    }
}



/* Iterator is an interface which traverses through the elements of the Collection. Here the collection is
ArrayList. Thus, the iterator will traverse through the elements of the Arraylist.
 */