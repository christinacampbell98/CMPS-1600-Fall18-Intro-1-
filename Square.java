//Christina Campbell
//Sam Eigen
public class Square extends Rectangle {
    //define the variables that will be taken as an input
    double s;


    //Create a constructor that designates what inputs will be past to the rectangle class
    public Square(double s) {
        super(s, s);

    }
// create a new  toString method that prints information about the square and overrides the toString method in Rectangle
    @Override
    public String toString() {
        return ("This is a square of dimension " + getHeight() + " by " + getHeight() + ".");
         }
     @Override
     //override the equals method so that the method can compare the sizes of two squares
    public boolean equals(Object obj) {
        //if a square is being compared to itself, return true
        if (obj== this ) {
            return true;
        }
        // if the object being compared isn't a square, return false
        if (!(obj  instanceof Square)) {
            return false;
        }

        Square s= (Square) obj;
        //if the two squares have the same size height(or sides), return true
        if (Double.compare(this.getHeight(),((Square)obj).getHeight())==0 ) {
            return true;
        }
        //if the sides are not the same size, then the squares are not equal
        else {
            return false;
        }
        }

    }

