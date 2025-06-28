/* here, we will use 'If-else' and 'Switch' statements in an Enum.

 */

public class Main {
    public static void main(String[] args) {
        enum Status{
            Passed, Failed, Delivered, NotDelivered;
        }

        Status var = Status.Delivered;

        if(var == Status.Delivered){
            System.out.println("Done");
        }

        else if(var == Status.Passed){
            System.out.println("N/A");
        }

        else if(var == Status.Failed){
            System.out.println("N/A");
        }

        else if(var == Status.NotDelivered){
            System.out.println("N/A");
        }


        Status var1 = Status.Passed;

        switch(var1){
            case Failed:
                System.out.println("N/A");
                break;

            case Delivered:
                System.out.println("N/A");
                break;

            case Passed:
                System.out.println("Done");
                break;

            case NotDelivered:
                System.out.println("N/A");
                break;
        }
    }
}