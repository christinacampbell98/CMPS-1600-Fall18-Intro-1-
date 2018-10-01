public class Triangle extends Shape{
   private double side1;
   private double side2;
   private double side3;

    /** create a constructor that assigns the length of each side inputted by the user
     * Also the program increases the shapeCount whenever it is ran
     * @param s1 the first side of the triangle
     * @param s2 the second side of the triangle
     * @param s3 the third side of the triangle
     */
    public  Triangle(double s1, double s2, double s3) {
        this.side1=s1;
        this.side2=s2;
        this.side3=s3;
        shapeCount++;
    }


    /**define the abstract method perimeter to calculate the perimeter of a triangle using the formula
     * Perimeter=(side1+side2+side3)
     * @return returns the calculated perimeter
     */
    @Override

    public double perimeter() {
        return (side1+side2+side3);
    }

    /**define the abstract method area to calculate the area of a triangle using the formula
     * Perimeter=sqrt((perimeter*(perimeter-side1)(perimeter-side2)(perimeter-side3))
     * @return returns the calculated area
     */
    @Override
    public double area() {
        double S1 =perimeter()- side1;
        double S2 = perimeter() - side2;
        double S3 = perimeter()- side3 ;
        return Math.sqrt(perimeter()*(S1*S2*S3));
    }
    /** create a method that when called, it returns the type of shape, which is a Triangle
     * @return the type of shape
     */
    @Override
    public String getShape() {
        return "Triangle";
    }



}

