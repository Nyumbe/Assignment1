public class Sphere extends ThreeDimensionalShape{
    public Sphere(double val1) {
		super(val1);
	}

    private double sphereArea = 4 * (Math.pow(getval1(), 2) * Math.PI);
    private double sphereVolume = Math.PI * 4/3 * Math.pow(getval1(), 3.0);

    public double getArea() {
		return sphereArea;
	}

    public double getVolume() {
		return sphereVolume;
	}

    public String toString()	{
		//return " radius: " + getval1();
        return String.format("%sRadius: %.2f\n",super.toString(),getval1()); 
	}
}
