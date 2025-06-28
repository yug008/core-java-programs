import java.util.HashMap;
import java.util.Map;
public class Main1 {
    public static void main(String[] args) {
        Map<String, Integer>book = new HashMap<>();
        book.put("Apple", 100);
        book.put("Samsung", 50);
        book.put("Oppo", 30);
        book.put("Motorola", 10);

        System.out.println(book);

        System.out.println(book.values());                     //list of values

        System.out.println(book.keySet());                     //set of keys

        System.out.println(book.get("Oppo"));                  //to get a value through its respective key using get() method
        System.out.println(book.get("Samsung"));
        System.out.println(book.get("Apple"));

        for(String company : book.keySet()){
            System.out.println(company + " : " + book.get(company));
        }

    }
}
