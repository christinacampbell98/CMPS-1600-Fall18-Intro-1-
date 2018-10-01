import java.util.ArrayList;

public abstract class Shape implements Comparable<Shape> {
    /** <h1> Shape</h1>
     * The Shape class allows for various shapes to be created and then
     * for their areas and perimeters to be calculated. The class also
     * keeps track of how many shapes are created.
     *
     * @author Christina Campbell
     * @since 9/30/2018
     */
     abstract double area();
     abstract double perimeter();
     abstract String getShape();
     static int shapeCount=0;

     /** define a method that returns information about the shape to the user.
     * The specific information will be filled in based on how the abstract methods are defined for the shape
     * @return returns to the user information about the shape created
     */
    public String display() {
        return "The " + getShape() + " has an area of "+ area() + " and a perimeter of " + perimeter()+ ".";
    }

    /** create a method that returns the the number of shapes that have been created
     *
     * @return the shapeCount
     */
    public int getShapeCount() {
        return shapeCount;
    }

    @Override
/**override the compareTo(Object obj) method so that it compares the areas of the shapes
 *
 */
    public int compareTo(Shape o) {
        if (o==this) {
            return 0;
        }
        if ( o.area() > this.area()) {
            return -1;
        }
        if (o.area() < this.area()) {
            return 1;
        }

        return 0;
}


}
