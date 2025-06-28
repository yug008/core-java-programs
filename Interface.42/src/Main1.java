/*In this, the implementing class being an abstract class doesnt need to override all the abstract
methods of the interface. It can override some methods such as 'fuel' done here. If the abstract class
overrides all the methods of the interface then it must be declared as a non abstract.
*/


interface Rocket{
    public abstract int fuel(int x);
    public abstract  String booster(String n);
    }

    abstract class Nuke implements Rocket{
    public int saas(){
        return 0;
    }
    public int fuel(int x){
        return 1;
    }
    }

    class SpaceRocket extends Nuke{
        public int saas(){
            return 100;
        }
        public int fuel(int x){
            return 11;
        }
        public String booster(String n){
            return "Boom!";
        }
    }

public class Main1 {
    public static void main(String[] args) {
        SpaceRocket obj = new SpaceRocket();
        System.out.println(obj.saas());
        System.out.println(obj.fuel(1));
        System.out.println(obj.booster("Y"));
    }
}



/* here we cant create objects of interface and abstract class. Thus, we created another class which
extended the abstract class to call the methods
 */