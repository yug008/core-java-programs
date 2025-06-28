class Cylinder{
    int radius;
     int height;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius = r;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height = h;
    }
}

public class Main{
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
        obj.setRadius(2);
        obj.setHeight(3);

        System.out.println("The radius of the cylinder is: " + obj.getRadius() + " units" + ". " + "The height of the cylinder is: " +obj.getHeight() + " units.");
        System.out.println("Also the area of cylinder is: " + (3.14)*(2)*(2) + " square units.");
        System.out.println("Also the volume of cylinder is: " + (3.14)*(2)*(2)*(3) + " cubic units.");

    }
}










      





















