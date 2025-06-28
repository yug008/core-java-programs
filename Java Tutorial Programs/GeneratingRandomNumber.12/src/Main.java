import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        //We want to generate a random int (any range)
        int x = rand.nextInt();
        System.out.println(x);
        //now, we will generate a random number with any range. for example between 1 to 10 (both 1 and 10 inclusive)
        int x1 = rand.nextInt(11);
        System.out.println(x1);

        //Now we will generate a random float with any range and also with a range of 1 to 100 (both 1 and 100 inclusive)
        float y = rand.nextFloat();
        System.out.println(y);
        float y1 = rand.nextFloat(101);
        System.out.println(y1);











    }
}