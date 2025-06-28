import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
     TreeSet<String>name = new TreeSet<String>();

     name.add("yug");
     name.add("amar");
     name.add("amita");
     name.add("mahesh");
     name.add("kalpana");
     name.add("chandra");

        System.out.println(name);

        for(String word: name){
            System.out.println(word);
        }

    }
}

/* unlike hashset, the elements in the tree set are arranged/sorted in ascending order. In case of strings,
the elements in a tree set are arranged alphabetically
 */