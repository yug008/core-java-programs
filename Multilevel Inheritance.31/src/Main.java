//This is the demo program in which we will test different codes from other classes, 'calc','advcalc' and 'scientificcalc'.

public class Main {
    public static void main(String[] args) {
        ScientificCalc obj = new ScientificCalc();
        int a = obj.add(2,7);
        int b = obj.div(100,2);
        double c = obj.power(3,3);

        System.out.println(a + "\n" + b + "\n" + c);

    }
}



/*In multilevel inheritance, scientific class inherited properties and methods from advcalc class, which in turn
also inherited properties and methods from calc class. Thus, all the properties and methods of advcalc and calc
classes are now inherited and present in the scientificCalc class
 */