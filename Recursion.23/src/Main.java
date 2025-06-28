public class Main{
    public static void main(String[] args) {
        meth(3);
    }

    static void meth(int count){
        System.out.println("hi");
        if(count<=1){
            return;
        }
        meth(count-1);           // here the method calls itself. Thus this is recursion
    }
}