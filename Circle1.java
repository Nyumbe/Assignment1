/*Create a class called Circle.java with fields named radius, area, and diameter. Include methods named
 setRadius(), getRadius(), and computeDiameter(), which calculates the circle's diameter and computeArea(),
 which computes the circle's area.
 Hint: diameter of a circle is twice its radius.
 Hint: area of a circle is 3.14 multiplied by the square of the radius.
 Create a class called TestCircle.java whose main method declares 2 Circle objects.
 Using setRadius() method, assign one Circle a small radius value and assign another a larger radius value.
 Call computeDiameter() and computeArea() for each circle and display the results.
 */


public class Circle1 {
    double radius;
    double diameter;
    double area;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double computeDiameter() {
        diameter = 2*radius;
        return diameter;
    }
    public double computeArea() {
        area = 3.14*radius*radius;
        return area;
    }
}
