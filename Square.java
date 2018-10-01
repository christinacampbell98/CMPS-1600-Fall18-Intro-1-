public class Square extends Rectangle {
    /** create a constructor that assigns the side measurement given by the user,
     * to the s variable
     *
     * @param s parameter used as the length and height parameters in the rectangle class
     */
    private double s;
    public Square(double s) {
        super(s,s);
    }

    /** create a method that when called, it returns the type of shape, which is a Square
     * @return the type of shape
     */
    @Override
    public String getShape() {
        return "Square";
    }


}
