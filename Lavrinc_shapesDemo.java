/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-10-01
 * JDK 1.8.0 / Netbeans 8.2
 * This is a demo program to test the shape creation classes.
 */

public class Lavrinc_shapesDemo {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle("Rectangle", 25, 100, 10, 15);
        Rectangle r2 = new Rectangle("Rectangle 2", 20, 0, 30, 8);
        Circle c1 = new Circle("Circle", 5, 10, 3);

        Figure[] f = new Figure[Figure.getNumberOfShapes()];
        f[0] = c1;
        f[1] = r1;
        f[2] = r2;

        for (int i = 0; i < Figure.getNumberOfShapes(); i++) {
            f[i].draw();
        }
    }
}
