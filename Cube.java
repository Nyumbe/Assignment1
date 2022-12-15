public class Cube extends ThreeDimensionalShape{
    public Cube(double val1) {
        super(val1);
    }

    private double cubeArea = 6 * Math.pow(getval1(), 2.0);
    private double cubeVolume = Math.pow(getval1(), 3.0);
    public double getArea() {
        return cubeArea;
    }

    public double getVolume() {
        return cubeVolume;
    }

    public String toString() {
        //return " length: " + getval1(); 
        return String.format("%sSide: %.2f\n",super.toString(),getval1());
    }
}
