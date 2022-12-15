public abstract class TwoDimensionalShape extends Shape{
    public TwoDimensionalShape(double val1){
        super(val1);
    }

    public TwoDimensionalShape(double val1, double val2){
        super(val1, val2);
    }

    public abstract double getArea();
}
