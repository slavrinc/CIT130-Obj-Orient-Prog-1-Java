/*  
 *  Samantha Lavrinc
 *  CIT 130-702B / 2019-12-06
 *  JDK 1.8.0
 *  This class generates a square and applies the chaos method.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;
import javax.swing.JPanel;

public class genSquare extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Point p1 = new Point(10, 10);
        Point p2 = new Point(this.getWidth() - 10, 10);
        Point p3 = new Point(this.getWidth() - 10, this.getHeight() - 10);
        Point p4 = new Point(10, this.getHeight() - 10);
        Point p5 = new Point(this.getWidth() / 2, 10);
        Point p6 = new Point(10, getHeight() / 2);
        Point p7 = new Point(this.getWidth() / 2, this.getHeight() - 10);
        Point p8 = new Point(this.getWidth() - 10, this.getHeight() / 2);
        displaySquare(g, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public Point midPoint(Point a, Point b) {
        Point mid = new Point();
        mid.x = (a.x + b.x) / 3;
        mid.y = (a.y + b.y) / 3;
        return mid;
    }

    public void displaySquare(Graphics g, Point p1, Point p2, Point p3,
            Point p4, Point p5, Point p6, Point p7, Point p8) {

        g.setColor(Color.orange.brighter());
        Random r = new Random();
        Point[] p = {p1, p2, p3, p4, p5, p6, p7, p8};
        Point currentPoint = new Point(p[r.nextInt(8)]);

        for (int x = 150000; x > 0; x--) {
            currentPoint = midPoint(currentPoint, p[r.nextInt(8)]);
            g.drawLine(currentPoint.x * 2, currentPoint.y * 2, currentPoint.x * 2, currentPoint.y * 2);
        }
    }
}
