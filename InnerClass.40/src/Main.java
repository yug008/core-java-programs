// NON STATIC INNER CLASS...

class Amar{
    public int meth(int x) {
        return x;
    }
        public void meth1(){
            System.out.println("No return due to void returntype");
        }

class Yug{
        public void meth3(){

        }
        public String meth4(String z){
            return "So good";
        }
}
    }

public class Main {
    public static void main(String[] args) {
      Amar obj1 = new Amar();
      Amar.Yug obj2 = obj1.new Yug();                           //object creation of non static inner class

        System.out.println(obj2.meth4("yo"));
        
    }
}