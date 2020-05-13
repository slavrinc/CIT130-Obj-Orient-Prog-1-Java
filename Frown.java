/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-12-12
 * JDK 1.8.0 / NetBeans 8.2
 * This class generates a frown graphic.
 */

import java.awt.*;
import javax.swing.JPanel;

public class Frown extends JPanel {

    public static final int FACE_DIAMETER = 200;
    public static final int X_FACE = 90;
    public static final int Y_FACE = 10;

    public static final int EYE_WIDTH = 50;
    public static final int EYE_HEIGHT = 30;
    public static final int X_RIGHT_EYE = X_FACE + 40;
    public static final int Y_RIGHT_EYE = Y_FACE + 135;
    public static final int X_LEFT_EYE = X_FACE + 110;
    public static final int Y_LEFT_EYE = Y_FACE + 135;

    public static final int MOUTH_WIDTH = 100;
    public static final int MOUTH_HEIGHT = 150;
    public static final int X_MOUTH = X_FACE + 50;
    public static final int Y_MOUTH = Y_FACE + 180;
    public static final int MOUTH_START_ANGLE = 180;
    public static final int MOUTH_ARC_SWEEP = -180;

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER + 90);
        g.setColor(Color.WHITE);
        g.fillArc(X_FACE - 25, Y_FACE - 100, FACE_DIAMETER + 50, FACE_DIAMETER,
                MOUTH_START_ANGLE, MOUTH_START_ANGLE);

        //draw mouth:
        g.setColor(Color.WHITE);
        g.fillArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT, MOUTH_START_ANGLE,
                MOUTH_ARC_SWEEP);
        g.setColor(Color.BLACK);
        g.fillArc(X_MOUTH, Y_MOUTH + 25, MOUTH_WIDTH, MOUTH_HEIGHT, 170, -160);

        //draw eyes:
        g.setColor(Color.WHITE);
        g.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_HEIGHT);
        g.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_HEIGHT);
        g.setColor(Color.BLACK);
        g.fillOval(X_RIGHT_EYE - 5, Y_RIGHT_EYE - 8, EYE_WIDTH + 10, EYE_HEIGHT - 5);
        g.fillOval(X_LEFT_EYE - 5, Y_LEFT_EYE - 8, EYE_WIDTH + 10, EYE_HEIGHT - 5);
    }
}
