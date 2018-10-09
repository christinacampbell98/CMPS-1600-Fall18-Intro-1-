public class SquareTester {
    public static void main(String [] args ) {
        Square sq= new Square(12.0);
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        System.out.println(sq.toString());
        Square sq2= new Square(12);
        Rectangle rec1= new Rectangle (5,4);
        Rectangle rec2= new Rectangle (5,4);
        System.out.println(rec1.toString());
        System.out.println(rec1==rec1);
        System.out.println(rec1.equals(rec1));
        System.out.println(sq==sq2);
        System.out.println(sq.equals(sq2));

    }
}
