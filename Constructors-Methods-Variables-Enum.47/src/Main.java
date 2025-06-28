enum Phone{
    Apple(1000), Samsung(800), Nokia(500), Oppo(200), Vivo(100);

    private int price;

    Phone(int price){
        this.price = price;
        }

        public int getPrice(){                                         //getters
        return price;
    }
}

public class Main {
    public static void main(String[] args) {

Phone var = Phone.Apple;
        System.out.println(var + " and its price is: " + var.getPrice());    //calling getters using variable 'var'

        Phone var1 = Phone.Oppo;
        System.out.println(var1 + " and its price is: " + var1.getPrice());

        for(Phone var2 : Phone.values()){
            System.out.println(var2 + " and its price is: " + var2.getPrice());
        }

    }
}

/* as we assigned int values to the constants in the enum, they will act as Objects and the enum Phone will
act as a Class. Then we declared an instance variable (they should be made private).

The constructor will have the same name as that of the enum because is itself a special type of class.

Each object will call the constructor and the constructor will set the value of the instance variable 'price'
for each object/constructor respectively.

Then to get the value assigned to each enum constant as an output, we created Getters. The getters will
return the values of each enum constants respectively.

To call getters, we will create variables of each enum constant respectively. And then call the getters
using the particular variable.

 Purpose of Getters: The values of each enum constant is set to the instance variable by the constructor.
 But as the instance variable is private, the only way to access it is by methods(getters).

 When you call Getters through variable, the price of the enum constant, the enum constant which is
 associated with the variable at the time of declaring the variable will be printed.
 FOR EXAMPLE: in line 18, the variable 'var' declared of the enum is associated with 'Apple'. Thus, when
 the getters is called using that variable, it will give the output of the price of apple.

 The prices of all phones are respectively stored in 'price'. And as its a private variable, we use getters
 to access it.
 */