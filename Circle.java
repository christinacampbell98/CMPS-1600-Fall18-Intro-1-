public class Circle extends Shape  {
    private double radius;

    /** create a constructor that assigns the input radius to the variable radius
     * and adds 1 to the shapeCount variable whenever the constructor is called
     * @param r is the radius inputed by the user
     */
    public Circle(double r) {
        this.radius=r;
        shapeCount++;
       // shapeList.add( new Circle(r));
    }

    /** calculate the area using the formula Area=Pi*radius*radius
     *
     * @return the calculated area
     */
    @Override
    public double area() {
        return (Math.PI*Math.pow(radius,2));
    }

    /** calculate the perimeter using the formula Perimeter= 2*Pi*radius
     *
     * @return the calculated perimeter
     */
    @Override
    public double perimeter() {
        return (2*Math.PI*radius);
    }

    /** create a method that when called, it returns the type of shape, which is a Circle
     * @return the type of shape
     */
    @Override
    public String getShape() {
        return "Circle";
    }

}
