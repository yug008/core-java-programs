public class Main {
    public static void main(String[] args) {
 //DISPLAYING ARRAYS IN DIFFERENT WAYS:::

 //BY USING FOR LOOP:


 int [] yug = new int[4];
 yug [0] = 4;
 yug [1] = 5;
 yug [2] = 6;
 yug [3] = 7;

        System.out.println(yug.length);

        for(int x = 0; x>=0 && x<=3; x++){
            System.out.println(yug[x]);
        }


//QUESTION:- WRITE A JAVA PROGRAM TO PRINT THE ELEMENTS OF AN ARRAY IN REVERSE ORDER.

        for(int i = 3; i<=3 && i>=0; i--){
            System.out.println(yug[i]);
        }


                    //OR, THE ABOVE QUESTION CAN ALSO BE DONE LIKE THIS:

        for(int y = yug.length-1; y>=0 && y<=3; y--){
            System.out.println(yug[y]);
        }


 //BY USING FOR-EACH LOOP: (the simplest way to print all the elements of the array)

        String [] amar = new String[5];
        amar [0] = "Hi";
        amar [1] = "Hello";
                amar [2] = "Bye";
        amar [3] = "Yoo";
        amar [4] = "Good night";

        for(String element : amar){
            System.out.println(element);
        }










    }
}