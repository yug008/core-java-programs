//2. WE WILL DO PRODUCT OF VARYING ARGUMENTS.


class Company{
  int method(int ... z){                       //the variable 'z' will act as an array of set of variable arguments.
     int product = 1;
      for(int i: z){                           //let 'i' be an integer in the array set 'z'
product = product*i;
      }
      return product;
  }
}

public class Yug {
    public static void main(String[] args) {
        Company object = new Company();               //object creation
        System.out.println("The product of 3 & 4 is: " + object.method(3,4));        //calling method using object creation
        System.out.println("The product of 25 & 26 is: " + object.method(25,26));    // calling method using object creation
    }
}
