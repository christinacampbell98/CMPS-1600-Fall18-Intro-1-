//Christina Campbell and Sam Eigen//
//CMPS 1600//
//9/10/2018//
public class Rectangle
{   //create all of the variables//
    private double height;
    private double length;
    public double area;
    public double perimeter;
    public int rectangleID;

    static int instancecounter=-1;
    int count=0;



    public Rectangle(double l,double h) {
        //use this. in order to make sure the values are being reset with each new object//
        this.height = h;
        this.length = l;
        //every time the instructor is accessed, the instancecounter increases by 1//
        instancecounter++;
        count=instancecounter;
        //this becomes the ID for each rectangle//
        this.rectangleID=count;
    }
// create a method that sets the height variable
    public void setHeight ( double h){

        this.height = h;
    }
    //create a get method for height that returns the assigned height 
    public double getHeight () {
        return this.height;
    }
    //create a set method for length
    public void setLength ( double l){

        this.length = l;
    }
    //create a get method for length that returns the assigned length
    public double getLength () {

        return this.length;
    }
//calculate the area and return it as a double
    public double area() {
        area= length*height;
        return area;
    }
//calculate the perimeter and return it as a double 
    public double perimeter() {
        perimeter= (2*height) + (2*length);
        return perimeter;
    }


//create a get method for the RectangleID that returns the certain ID
    public int getRectangleID(){
        return rectangleID;
    }
// this method displays information about the rectangle to the user as a string 
    public String toString() {

        String rectInfo=("This is a rectangle of dimension " + getHeight() + " by "+ getLength() + ".");
        return rectInfo;



    }



}

