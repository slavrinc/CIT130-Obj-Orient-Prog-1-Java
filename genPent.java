/*  
 *  Samantha Lavrinc
 *  CIT 130-702B / 2019-12-06
 *  JDK 1.8.0
 *  This class generates a pentagon and applies the chaos method.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;
import javax.swing.JPanel;

public class genPent extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Point p1 = new Point(this.getWidth() / 2, 10);
        Point p2 = new Point(10, this.getHeight() * 2 / 5);
        Point p3 = new Point(this.getWidth() - 10, this.getHeight() * 2 / 5);
        Point p4 = new Point(this.getWidth() / 5, this.getHeight() - 10);
        Point p5 = new Point(this.getWidth() * 4 / 5, this.getHeight() - 10);
        displayPent(g, p1, p2, p3, p4, p5);
    }

    public Point midPoint(Point a, Point b) {
        Point mid = new Point();
        double tmp;
        tmp = (a.x + b.x) / 2.618033;
        mid.x = (int) tmp;
        tmp = (a.y + b.y) / 2.618033;
        mid.y = (int) tmp;
        return mid;
    }

    public void displayPent(Graphics g, Point p1, Point p2, Point p3, Point p4, Point p5) {

        g.setColor(Color.magenta.brighter());
        Random r = new Random();
        Point[] p = {p1, p2, p3, p4, p5};
        Point currentPoint = new Point(p[r.nextInt(5)]);

        for (int x = 50000; x > 0; x--) {
            currentPoint = midPoint(currentPoint, p[r.nextInt(5)]);
            g.drawLine(currentPoint.x * 21 / 13, currentPoint.y * 21 / 13,
                    currentPoint.x * 21 / 13, currentPoint.y * 21 / 13);
        }
    }
}
