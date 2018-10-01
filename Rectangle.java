public class Rectangle extends Shape {

    private double length;
    private double height;

    /** create a constructor that assigns the length and height variables to the inputs given by the user
     *
     * @param l the length of a rectangle
     * @param h the height of a rectangle
     */
    public Rectangle(double l, double h) {
        this.length=l;
        this.height=h;
        shapeCount++;
    }

    /**define the abstract method area to calculate the area of a rectangle using the formula
     * Area=length*width
     * @return returns the calculated area
     */
    @Override
    public double area() {
        return length*height;
    }

    /**define the abstract method perimeter to calculate the perimeter of a rectangle using the formula
     * Perimeter=2*length + 2*width
     * @return returns the calculated perimeter
     */
    @Override
    public double perimeter() {
        return ((2*length) + (2*height));
    }

    /** create a method that when called, it returns the type of shape, which is a Rectangle
     * @return the type of shape
     */
    @Override
    public String getShape() {
        return "Rectangle";
    }

}
