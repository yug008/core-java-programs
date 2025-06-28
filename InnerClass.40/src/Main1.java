//STATIC INNER CLASS...

class Computer{
    private int price;
    private String model;

    public String d1(String x){
        return "Good!";
    }
    public int d2(int x, int y, int z){
        return x + y + z;
    }

    static class Laptop{
        public int e1(int x, int y ,int z) {
            return (x + y) - z;
        }
            public void e2(){

            }

        }
    }

public class Main1 {
    public static void main(String[] args) {
        Computer object = new Computer();
        Computer.Laptop obj = new Computer.Laptop();
        System.out.println(obj.e1(6, 9, 7));
    }
}


/* As this is a Static Inner class, we dont need to create an object of the outer class to call the methods
of the inner class.
 */