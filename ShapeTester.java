import java.util.ArrayList;
import java.util.Collections;
public class ShapeTester {
    /** the following is the main method that calls on the methods created in
     * the classes Shape, Circle, Triangle, Rectangle, and Square
     * An arrayList is initiated that will store the various shapes made
     * one of each shape is initiated, and their various calculations are called on
     * @param args
     */
    public static void main (String [] args) {
        ArrayList <Shape> shapes= new ArrayList<>();
        /** create an instance of class circle, and add it to the array
         *
         */
        Circle c= new Circle(6);
        shapes.add(c);
        /** Create an instance of class triangle and add it to the arrayList

         */
        Triangle t= new Triangle(2,1,3);
        shapes.add(t);
        /** Create an instance of class rectangle and add it to the ArrayList
         *
         */
        Rectangle rec= new Rectangle(5,4);
        shapes.add(rec);
        /**Create an instance of the class Rectangle and add it to the arrayList
         *
         */
        Square sq= new Square(5);
        shapes.add(sq);

        /**call on the displayArray method in order to display information about each shape in the array
         *
         */
        System.out.println(displayArray(shapes));

        for (int i=0; i<shapes.size(); i++) {
            System.out.println(shapes.get(i).getShape());

        }
        for (int i=0; i<shapes.size(); i++) {
            if (shapes.get(i).getShape()== "Circle") {
                System.out.println(shapes.get(i).getShape()+ ": position " + (i+1) + " in the list.");
            }
        }
        System.out.println(sq.getShapeCount()+ " shapes were created.");
        Collections.sort(shapes);
        System.out.println(displayArray(shapes));


    }

    public static String displayArray(ArrayList<Shape> shapes) {
        String s="";
        for (int i=0; i<shapes.size(); i++) {
             s= s+ shapes.get(i).display()+ "\n";
        }
        return s;

    }

}
