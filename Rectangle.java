/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-10-01
 * JDK 1.8.0 / Netbeans 8.2
 * This is the derived rectangle class. 
 */

public class Rectangle extends Figure {

    int width, height;

    public Rectangle() {
        super(0, 0, "none");
        setWidth(0);
        setHeight(0);
    }

    public Rectangle(String n, int a, int b, int w, int h) {
        super(a, b, n);
        setWidth(w);
        setHeight(h);
    }

    public String toString() {
        return "In Rectangle Drawing " + getName() + " centered at (" + getX() + ","
                + getY() + ") width " + getWidth() + " height " + getHeight();
    }

    public void erase() {
        System.out.println("In Rectangle erasing");
    }

    public void draw() {
        center();
        erase();
        System.out.println("" + this);
    }

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
