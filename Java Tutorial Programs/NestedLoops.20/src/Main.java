public class Main {
    public static void main(String[] args) {
        for(int x = 0; x<6; x++){
            for(int y = 1; y<6; y++){
                System.out.print(y + " ");
            }
            System.out.println();                                   //this is for a new line
            System.out.println("For " + x + " times");
        }


//PATTERN BASED PROBLEM...

        for(int p = 0; p<9; p++){
            for(int q = 0; q<=p; q++){
                System.out.print(q + "\t");
            }
            System.out.println("\n");
        }

    }
}