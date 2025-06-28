import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
       Map<String,Integer>record = new HashMap<>();               //creating a hashmap named 'record'

        record.put("Yug", 100);
        record.put("Amita", 200);
        record.put("Amar", 300);
        record.put("Narayana", 1000);

        System.out.println(record);

        System.out.println(record.get("Yug"));
        System.out.println(record.get("Narayana"));

        System.out.println(record.keySet());

        for(String name : record.keySet()){
            System.out.println(name + " : " + record.get(name));
        }

        System.out.println(record.values());

    }
}