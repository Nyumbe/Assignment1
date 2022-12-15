public class TestCircle {
    public static void main(String[] args) {
        Circle1 C1 = new Circle1();
        Circle1 C2 = new Circle1();

        C1.setRadius(4);
        C2.setRadius(7);

        System.out.println("Circle 1");
        System.out.println("Diameter: "+C1.computeDiameter());
        System.out.println("Area: "+C1.computeArea());
        System.out.println("\nCircle 2");
        System.out.println("Diameter: "+C2.computeDiameter());
        System.out.println("Area: "+C2.computeArea());
    }
}