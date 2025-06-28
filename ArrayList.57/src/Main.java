import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>number = new ArrayList<Integer>();
        number.add(7);
        number.add(8);
        number.add(9);
        number.add(10);

        System.out.println(number);

        for(int x : number){                  //(Enhanced For loop)to get output of array list one by one.
            System.out.println(x);
        }

        System.out.println(number.get(0));       //accessing values of Array list using indexes
        System.out.println(number.get(1));
        System.out.println(number.get(2));
        System.out.println(number.get(3));

        ArrayList<String>words = new ArrayList<String>();

        words.add("Yug");
        words.add("Amar");
        words.add("Amita");
        words.add("Family");

        System.out.println(words);

        for(String y : words){
            System.out.println(y);
        }

    }
}