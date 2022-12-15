public class Shapes {
    public static void main(String[] args) {
        Shape shape[] = new Shape[6];
        shape[0] = new Square(4.0);
        shape[1] = new Circle(6.0);
        shape[2] = new Triangle(4.0, 5.0);
        shape[3] = new Cube(4.0);
        shape[4] = new Sphere(4.0);
        shape[5] = new Tetrahedron(3.0);


        for (Shape s : shape) {
            //System.out.println(curentShape);
            if (s instanceof TwoDimensionalShape) {
                TwoDimensionalShape twoDimentionalShape = (TwoDimensionalShape) s;
                System.out.printf("%sArea: %.2f\n\n", twoDimentionalShape.toString(), twoDimentionalShape.getArea());   
                }
             else if (s instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) s;
                System.out.printf("%sSurface Area: %.2f\nVolume: %.2f\n\n", threeDimensionalShape.toString(), threeDimensionalShape.getArea(), threeDimensionalShape.getVolume());   
            }
        }
    }
}