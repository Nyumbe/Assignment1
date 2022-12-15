public class Triangle extends TwoDimensionalShape {
    public Triangle(double val1, double val2) {
		super(val1, val2);
	}

    private double triangleArea = getval1() * getval2() * 0.5;

    public double getArea()	{
		return triangleArea;
	}

    public String toString(){
		//return " base: " + getval1() + " height: " + getval2(); 
        return String.format("%sBase: %.2f\nHeight: %.2f\n",super.toString(),getval1(),getval2());
	}
}
