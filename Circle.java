import java.lang.Math;
public class Circle extends TwoDimensionalShape{
    public Circle(double val1) {
        super(val1);
    }

    private double circleArea = (Math.pow(getval1(), 2) * Math.PI);

    public double getArea(){
        return circleArea;
    }

    public String toString(){
        //return " radius: " + getval1();
        return String.format("%sRadius: %.2f\n",super.toString(),getval1());
    }
}
