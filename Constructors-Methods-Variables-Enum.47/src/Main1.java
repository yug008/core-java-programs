enum Laptop{
    Macbook(100), Lenovo(60), Dell(40), Intel(20);

    private int model;

     Laptop(int x){
    model = x;
    }

    public int getModel(){
         return model;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Laptop var = Laptop.Lenovo;
        System.out.println(var + " : " + var.getModel());

        Laptop var1 = Laptop.Intel;
        System.out.println(var1 + " : " + var1.getModel());

        for(Laptop var2 : Laptop.values()){
            System.out.println(var2 + " : " + var2.getModel());
        }
    }
}
