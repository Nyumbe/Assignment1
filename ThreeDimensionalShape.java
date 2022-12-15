public abstract class ThreeDimensionalShape extends Shape{
    public ThreeDimensionalShape(double val1) {
		super(val1);
	}

    public ThreeDimensionalShape (double val1, double val2, double val3){
		super(val1, val2, val3);
	}

    public abstract double getArea();
	public abstract double getVolume();
}
