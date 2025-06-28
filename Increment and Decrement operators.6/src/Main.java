public class Main {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a++);   //It first performed the work and then value changed to 4.
        System.out.println(a++);   //It first performed the work and then valur changed to 5.
        System.out.println(++a);   //It first changed the value to 6 and then performed the work.


        int b = 4;
        int c = 5;
        int d = 6;
        System.out.println(b++ + c++ + d++);  //It first performs the work and then changes the values of b,c,d to 5,6,7.  (4+5+6)
        System.out.println(++b + ++c + ++d);  //It first changes the values of b,c,d to 6,7,8 and then performs the work.  (6+7+8)
        System.out.println(b);                //It will print the latest value of b which is 6.

        int e = 4;
        System.out.println(e++);     //It first performs work and then evaluates/changes the value to 5.
        System.out.println(++e);     //It first evaluates/changes the value to 6 and THEN performs the work.
        System.out.println(e);       //It prints the latest value of 'e'.
        System.out.println(--e);     //It first evaluates/changes the value to 5 and then performs the work.
        System.out.println(e--);     //It first performs the work and then changes the value to 4.
        System.out.println(++e);     //It evaluates/changes the value to 5 and THEN performs the work.

    }
}