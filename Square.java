public class Square extends TwoDimensionalShape {
    public Square(double val1){
        super(val1);
    }

    private double squareArea = getval1() * getval1();

    public double getArea() {
        return squareArea;
    }

    public String toString() {
        //return "length: " + getval1();
        return String.format("%sLength: %.2f\n",super.toString(),getval1());
    }
}
