/*  
 *  Samantha Lavrinc
 *  CIT 130-702B / 2019-12-06
 *  JDK 1.8.0
 *  This program generates shapes based on user input and applies the chaos method.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lavrinc_sierpinskiDemo extends JFrame implements ActionListener {

    JButton triButton = new JButton("Triangle");
    JButton squareButton = new JButton("Square");
    JButton pentaButton = new JButton("Pentagon");
    JButton hexButton = new JButton("Snowflake");
    JPanel shapeDisplay = new JPanel();
    JPanel buttonDisplay = new JPanel();

    public Lavrinc_sierpinskiDemo() {
        setTitle("Sierpinski Chaos Method");
        this.setPreferredSize(new Dimension(620, 660));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        shapeDisplay.setLayout(new CardLayout());
        this.add(shapeDisplay, BorderLayout.CENTER);
        buttonDisplay.setPreferredSize(new Dimension(this.getWidth(), 50));
        this.add(buttonDisplay, BorderLayout.PAGE_END);

        buttonDisplay.setLayout(new GridLayout());
        buttonDisplay.add(triButton);
        buttonDisplay.add(squareButton);
        buttonDisplay.add(pentaButton);
        buttonDisplay.add(hexButton);

        this.pack();
        this.setVisible(true);

        addActionEvent();
    }

    public void addActionEvent() {
        triButton.addActionListener(this);
        squareButton.addActionListener(this);
        pentaButton.addActionListener(this);
        hexButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == triButton) {
            genTri tri = new genTri();
            shapeDisplay.removeAll();
            shapeDisplay.add(tri);
            tri.setBackground(Color.GREEN.darker());
            shapeDisplay.repaint();
            shapeDisplay.revalidate();

        } else if (source == squareButton) {
            genSquare square = new genSquare();
            shapeDisplay.removeAll();
            square.setBackground(Color.RED.darker());
            shapeDisplay.add(square);
            shapeDisplay.repaint();
            shapeDisplay.revalidate();

        } else if (source == pentaButton) {
            genPent pent = new genPent();
            shapeDisplay.removeAll();
            pent.setBackground(Color.BLACK);
            shapeDisplay.add(pent);
            shapeDisplay.repaint();
            shapeDisplay.revalidate();

        } else if (source == hexButton) {
            genHex hex = new genHex();
            shapeDisplay.removeAll();
            hex.setBackground(Color.BLUE.darker());
            shapeDisplay.add(hex);
            shapeDisplay.repaint();
            shapeDisplay.revalidate();
        }
    }

    public static void main(String[] args) {
        Lavrinc_sierpinskiDemo chaosGen = new Lavrinc_sierpinskiDemo();
    }
}
