import java.util.HashSet;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer>nums = new HashSet<Integer>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);

        Stream<Integer>s1 = nums.stream();  //converting collections 'nums' into a stream.

        Stream<Integer>s2 = s1.sorted();    // stream s1 has been used as it can only be used once. Also stream s2 has been created which can be used only once.

       Stream<Integer>s3 = s2.map(y -> y*2);   //s2 is used up and stream s3 which is created can be used once

        Stream<Integer>s4 = s3.filter(x -> x%2 == 0);   //filters the stream for only the even numbers

        Stream<Integer>s5 = s4.distinct();

        Stream<Integer>s6 = s5.skip(2);

        s6.forEach(x -> System.out.println(x));

        /* The chaining is ended when we used up stream s6 one time. If you want to continue chaining of
        streams then you have to create another stream in which you can consume the stream s6 not in the
        foreach method because it doesnt create any new stream so chaining gets ended.
         */







                


    }
}