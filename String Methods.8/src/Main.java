import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        String name = "Harry";

        int a1 = name.length();
        System.out.println(a1);
        //as length of string/number of letters in the string will be an integer, thus we used an int datatype
        //to find the length of the string.

        String a2 = name.toLowerCase();
        System.out.println(a2);
        //as here we are converting the letters of the string into lowercase letters; which means we will get
        //a word as an output.Hence, a word as an output is possible only in String. Thus we used String datatype
        //here.

        String a3 = name.toUpperCase();
        System.out.println(a3);
        //same as that of the case of lower case. As the output is a word, we will use string datatype here.




        String age = "    Seventeen    ";
        String b1 = age.trim();
        System.out.println(b1);





        String surname = "Mehta";
        String c1 = surname.substring(1);
        System.out.println(c1);

        String c2 = surname.substring(0,4);
        System.out.println(c2);

        String c3 = surname.substring(0,5);
        System.out.println(c3);

        String c4 = surname.substring(2,4);
        System.out.println(c4);



        String number = "Eighteen";

        String d1 = number.replace('e','a');
        System.out.println(d1);

        String d2 = number.replace("ee","ai");
        System.out.println(d2);




        String sports = "Football";
        System.out.println(sports.startsWith("Fo"));
        System.out.println(sports.startsWith("al"));



        String game = "Cricket";
        System.out.println(game.endsWith("CI"));
        System.out.println(game.endsWith("et"));



        String x = "Eight";
        System.out.println(x.charAt(2));
        System.out.println(x.charAt(4));


        String name1 = "Harry";
        System.out.println(name1.indexOf("ar"));
        System.out.println(name1.indexOf("Ha"));
        System.out.println(name1.indexOf("rr"));
        System.out.println(name1.indexOf("y"));


        String xy = "Harryrry";
        System.out.println(xy.indexOf("rry",4));
        String xyz = "Harryrryrry";
        System.out.println(xyz.indexOf("rry",7));

        System.out.println(xyz.indexOf("rry234"));
        //as the mentioned string didnt match with any of the substring present in the original string,
        // the output is -1.



        String abc = "Harryrry";
        System.out.println(abc.lastIndexOf("rr"));
        System.out.println(abc.lastIndexOf("rry"));
        System.out.println(abc.lastIndexOf('r'));
        System.out.println(abc.lastIndexOf("y"));



        String gfh = "Harryrry";
        System.out.println(gfh.lastIndexOf("rr",4));


        String him = "Harry";
        System.out.println(him.equals("Harry"));
        System.out.println(him.equalsIgnoreCase("hArRy"));
        System.out.println((him.equalsIgnoreCase("yug")));


        



        






    }
}