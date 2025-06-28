public class Main {
    public static void main(String[] args) {
        //Q-1.

        float [] app = new float [5];
        app [0] = 1.1f;
        app [1] = 1.2f;
        app [2] = 1.3f;
        app [3] = 1.4f;
        app [4] = 1.5f;


        float sum = 0;
        for(int i = 0; i < app.length; i++ ) {
            sum = sum + app[i];
        }
        System.out.println(sum);


        //Q-2.

        //let that integer be 4.


        int [] cept = new int [6];
        cept [0] = 1;
        cept [1] = 2;
        cept [2] = 3;
        cept [3] = 4;
        cept [4] = 5;
        cept [5] = 6;

        for(int x = 0; x>=0 && x<6; x++){
            System.out.println(cept[x]);
            if(cept[x] == 4){
                System.out.println("4 is present!");
            }
        }


        //Q-3.

        int [] marks = new int [5];
        marks [0] = 32;
        marks [1] = 34;
        marks [2] = 45;
        marks [3] = 67;
        marks [4] = 78;

        int sum1 = 0;
        for(int element : marks){
            sum1 = sum1 + element;
        }

        System.out.println("The average marks are: " + sum1/marks.length);



        //Q-4.


        int [][] mat1 = new int [2][3];
        mat1 [0][0] = 1;
        mat1 [0][1] = 2;
        mat1 [0][2] = 3;
        mat1 [1][0] = 4;
        mat1 [1][1] = 5;
        mat1 [1][2] = 6;

        int [][] mat2 = new int [2][3];
        mat2 [0][0] = 0;
        mat2 [0][1] = 1;
        mat2 [0][2] = 2;
        mat2 [1][0] = 3;
        mat2 [1][1] = 4;
        mat2 [1][2] = 5;


        int [][] sum3 = new int [2][2];

        for(int i  = 0; i<2; i++){
            for(int j = 0; j<2; j++) {
                sum3[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum3[i][j] + " ");
            }
            System.out.println();
            }

          
// LETS DO THE ADDITION OF TWO 3*3 MATRICES...

        int [][] ved1 = { {1,2,3},
                          {4,5,6},
                          {7,8,9} };

        int [][] ved2 = { {1,2,3},
                          {4,5,6},
                          {7,8,9} };
        int [][] add = new int [3][3];

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++) {
                add[i][j] = ved1[i][j] + ved2[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
            }



        //Q-5....

        int [] array = new int [5];
        array [0] = 1;
        array [1] = 2;
        array [2] = 3;
        array [3] = 4;
        array [4] = 5;

 for(int i = 4; i>=0; i--){
     System.out.println(array[i]);
 }



//Q-6....


 int [] we = {1,2,3,4,5};
 for(int i = 0; i<5; i++) {
     System.out.println(we[i]);
     if(we[i] == we.length) {
         System.out.println("Its the maximum value");
     }
     else{
         System.out.println("Its not the maximum value");
     }
 }


                            //OR WE CAN DO IT WITH ANOTHER METHOD...

        int [] arr = {1,2,3,4,5};
 int max = 0;
 for(int x : arr){
     if(x>max){
         max = x;
     }
 }
        System.out.println("The maximum value is " + max);



      //Q-7....


        int [] dx = {9,78,345,87,2};
        int min = 9999;
        for(int y: dx){
            if(y<min){                             //the least value among all the values in the array will be assigned to the variable 'min'
                min = y;
            }
        }
        System.out.println("The minimum value is: " + min);















    }
}