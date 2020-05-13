/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-12-12
 * JDK 1.8.0 / NetBeans 8.2
 * This program generates the UI to switch between a frown and a smile.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;

public final class Lavrinc_Smile extends JFrame implements ActionListener {

    JButton happy = new JButton("Smile");
    JButton sad = new JButton("Frown");
    JPanel faceDisplay = new JPanel();
    JPanel buttonDisplay = new JPanel();

    public Lavrinc_Smile() {
        setTitle("Lavrinc Smile DEMO");
        this.setPreferredSize(new Dimension(400, 450));
        getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        faceDisplay.setLayout(new BorderLayout());
        faceDisplay.setBackground(Color.WHITE);
        this.add(faceDisplay, BorderLayout.CENTER);
        buttonDisplay.setPreferredSize(new Dimension(this.getWidth(), 50));
        buttonDisplay.setBackground(Color.WHITE);
        this.add(buttonDisplay, BorderLayout.PAGE_END);

        ButtonStyle(sad);
        ButtonStyle2(happy);
        buttonDisplay.add(happy, BorderLayout.CENTER);
        buttonDisplay.add(sad, BorderLayout.CENTER);
        sad.setVisible(false);

        this.pack();
        this.setVisible(true);
        addActionEvent();
    }

    public void addActionEvent() {
        happy.addActionListener(this);
        sad.addActionListener(this);
    }

    public void paint(Graphics g) {
        super.paint(g);
    }

    private static JButton ButtonStyle(JButton b) {
        b.setForeground(Color.WHITE);
        b.setBackground(Color.BLACK);
        b.setBorder(new LineBorder(Color.WHITE, 2));
        b.setPreferredSize(new Dimension(100, 35));
        b.setFont(new Font("Courier", Font.BOLD, 25));
        b.setFocusPainted(false);
        return b;
    }

    private static JButton ButtonStyle2(JButton b) {
        b.setForeground(Color.BLACK);
        b.setBackground(Color.WHITE);
        b.setBorder(new LineBorder(Color.BLACK, 2));
        b.setPreferredSize(new Dimension(100, 35));
        b.setFont(new Font("Courier", Font.BOLD, 25));
        b.setFocusPainted(false);
        return b;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == happy) {
            happy.setVisible(false);
            sad.setVisible(true);
            Smile smile = new Smile();
            smile.setBackground(Color.BLACK);
            buttonDisplay.setBackground(Color.BLACK);
            faceDisplay.removeAll();
            faceDisplay.add(smile);
            faceDisplay.repaint();
            faceDisplay.revalidate();
        } else if (source == sad) {
            happy.setVisible(true);
            sad.setVisible(false);
            Frown frown = new Frown();
            frown.setBackground(Color.WHITE);
            buttonDisplay.setBackground(Color.WHITE);
            faceDisplay.removeAll();
            faceDisplay.add(frown);
            faceDisplay.repaint();
            faceDisplay.revalidate();
        }
    }

    public static void main(String[] args) {
        Lavrinc_Smile demo = new Lavrinc_Smile();
    }

}
