/*  
 *  Samantha Lavrinc
 *  CIT 130-702B / 2019-12-06
 *  JDK 1.8.0
 *  This class generates a triangle and applies the chaos method.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;
import javax.swing.JPanel;

public class genTri extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Point p1 = new Point(this.getWidth() / 2, 10);
        Point p2 = new Point(10, this.getHeight() - 10);
        Point p3 = new Point(this.getWidth() - 10, this.getHeight() - 10);
        displayTri(g, p1, p2, p3);
    }

    public Point midPoint(Point a, Point b) {
        Point mid = new Point();
        mid.x = (a.x + b.x) / 2;
        mid.y = (a.y + b.y) / 2;
        return mid;
    }

    public void displayTri(Graphics g, Point p1, Point p2, Point p3) {

        g.setColor(Color.white.brighter());
        Random r = new Random();
        Point[] p = {p1, p2, p3};
        Point currentPoint = new Point(p[r.nextInt(3)]);

        for (int x = 50000; x > 0; x--) {
            currentPoint = midPoint(currentPoint, p[r.nextInt(3)]);
            g.drawLine(currentPoint.x, currentPoint.y, currentPoint.x, currentPoint.y);
        }
    }
}
