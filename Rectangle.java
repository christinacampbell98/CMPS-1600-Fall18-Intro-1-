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

    public void setHeight ( double h){

        this.height = h;
    }
    public double getHeight () {
        return this.height;
    }
    public void setLength ( double l){

        this.length = l;
    }
    public double getLength () {

        return this.length;
    }

    public double area() {
        area= length*height;
        return area;
    }

    public double perimeter() {
        perimeter= (2*height) + (2*length);
        return perimeter;
    }



    public int getRectangleID(){
        return rectangleID;
    }

    public String toString() {

        String rectInfo=("This is a rectangle of dimension " + getHeight() + " by "+ getLength() + ".");
        return rectInfo;



    }



}

