// CREATING STREAM USING BUILDER PATTERN...

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>(Arrays.asList(5,8,2,6,1));

        //coverting the collection named 'list' into a stream and then using Builder pattern
        list.stream().sorted().map(x -> x*2).filter(x -> x%2 ==0).distinct().skip(3);



    }
}

/* The builder pattern is a design pattern that provides a flexible solution in creating streams. It also
doesnt require the creation of multiple streams for Chaining. It covers all the stream methods in a single
line.
 */