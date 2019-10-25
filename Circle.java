/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-10-01
 * JDK 1.8.0 / Netbeans 8.2
 * This is the derived circle class.
 */

public class Circle extends Figure {

    int radius;

    public Circle() {
        super(0, 0, "none");
    }

    public Circle(String position, int lenth, int height, int radius) {
        super(lenth, height, position);
        this.radius = radius;
    }

    public String toString() {
        return "In Circle Drawing " + getName() + " centered at (" + getX() + ","
                + getY() + ") with radius " + getRadius();
    }

    public void erase() {
        System.out.println("In Circle erasing");
    }

    public void draw() {
        center();
        erase();
        System.out.println("" + this);
    }

    public int getRadius() {
        return radius;
    }
}
