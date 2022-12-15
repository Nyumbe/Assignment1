public class Tetrahedron extends ThreeDimensionalShape{
    public Tetrahedron (double val1){
		super(val1);
	}

    private double tetrahedronArea = Math.sqrt(3) * Math.pow(getval1(), 2);
    private double tetrahedronVolume = Math.pow(getval1(), 3) / (6 * Math.sqrt(2));

    public double getArea()	{
		return tetrahedronArea;
	}

    public double getVolume(){
		return tetrahedronVolume;
	}

    public String toString(){
		return String.format("%sSide: %.2f\n",super.toString(),getval1());
	}
}
