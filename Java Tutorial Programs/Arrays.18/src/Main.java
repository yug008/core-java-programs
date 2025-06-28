public class Main {
    public static void main(String[] args){
//MAKE A LIST OF 5 STUDENTS WHO HAVE ATTEMPTED A TEST OF 100 MARKS. DO IT BY USING ARRAYS. ALSO PRINT THE
//MARKS OF THE 5 STUDENTS INDIVIDUALLY


int [] marks = new int[5];                                   //(Declaration+memeory allocation)
marks[0] = 30;                                               //(initialization)
marks[1] = 56;
marks[2] = 78;
marks[3] = 88;
marks[4] = 95;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);



        String [] names = new String[4];
        names[0] = "Yug";
                names[1] = "Vedant";
                names[2] = "Jainil";
                names[3] = "Nabhya";
                names[3] = "Sujal";

        System.out.println(names[3]);


        char [] array = {'a','b','c','d'};                     //(Declaration+Memory allocation+ inintialization)
            System.out.println(array[0]);
            System.out.println(array[3]);

            

//HERE WE HAVE USED AN ARRAY OF THE SAME INDEX TWICE. THUS THE LAST ARRAY WITH THAT INDEX WILL BE THE OUTPUT.



        char [] united = new char[100];
        System.out.println(united.length);










    }
}