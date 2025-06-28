import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<Integer>(Arrays.asList(4,5,6,7,8));
        System.out.println(nums);
        System.out.println(nums.size());                // gives the size of array list

        for(int i : nums){
            if(i%2 == 0){
                i = i*2;
                System.out.println(i);
            }
        }

        for(int j : nums){
            if(j%5 == 0 || j%7 == 0){
              j = j*3;
                System.out.println(j);
            }
        }

        for(int z = 0; z<nums.size(); z++){                 //getting all the values of arraylist using for loop
            System.out.println(nums.get(z));
        }

        for(int x : nums){                     //getting all the values of arraylist using enhanced for loop
            System.out.println(x);
        }
    }
}