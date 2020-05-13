/* Samantha Lavrinc
 * CIT130-702B / 2019-11-20
 * JDK 1.8.0
 * This program uses a swing GUI to implement a basic calculator.
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public final class Lavrinc_calcDemo extends JFrame implements ActionListener {

    double hold, tmp;
    int calc;

    JButton oneButton = new JButton("1");
    JButton twoButton = new JButton("2");
    JButton threeButton = new JButton("3");
    JButton divButton = new JButton("/");
    JButton fourButton = new JButton("4");
    JButton fiveButton = new JButton("5");
    JButton sixButton = new JButton("6");
    JButton multButton = new JButton("*");
    JButton sevenButton = new JButton("7");
    JButton eightButton = new JButton("8");
    JButton nineButton = new JButton("9");
    JButton subButton = new JButton("-");
    JButton clearButton = new JButton("C");
    JButton zeroButton = new JButton("0");
    JButton equalsButton = new JButton("=");
    JButton additionButton = new JButton("+");
    JTextField display = new JTextField(25);
    JLabel label = new JLabel();

    public Lavrinc_calcDemo() {
        initGUI();
        addActionEvent();
    }

    private static JButton ButtonStyle(JButton b) {
        b.setForeground(Color.GREEN);
        b.setBackground(Color.BLACK);
        b.setBorder(new LineBorder(Color.GREEN));
        b.setFont(new Font("Courier", Font.BOLD, 20));
        return b;
    }

    private static JButton ButtonStyle2(JButton b) {
        b.setForeground(Color.MAGENTA);
        b.setBackground(Color.BLACK);
        b.setBorder(new LineBorder(Color.MAGENTA));
        b.setFont(new Font("Courier", Font.BOLD, 20));
        return b;
    }

    private void initGUI() {
        ButtonStyle(oneButton);
        ButtonStyle(twoButton);
        ButtonStyle(threeButton);
        ButtonStyle(fourButton);
        ButtonStyle(fiveButton);
        ButtonStyle(sixButton);
        ButtonStyle(sevenButton);
        ButtonStyle(eightButton);
        ButtonStyle(nineButton);
        ButtonStyle(zeroButton);
        ButtonStyle2(divButton);
        ButtonStyle2(multButton);
        ButtonStyle2(subButton);
        ButtonStyle2(clearButton);
        ButtonStyle2(equalsButton);
        ButtonStyle2(additionButton);

        JPanel gui = new JPanel(new BorderLayout(5, 5));

        gui.setBorder(new EmptyBorder(5, 5, 5, 5));
        gui.setBackground(Color.BLACK);
        gui.setPreferredSize(new Dimension(266, 206));

        display.setPreferredSize(new Dimension(50, 50));
        gui.add(display, BorderLayout.NORTH);
        display.setBackground(Color.BLACK);
        display.setForeground(Color.GREEN);
        display.setBorder(new LineBorder(Color.GREEN));
        display.setFont(new Font("Courier", Font.BOLD, 30));
        display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JFrame frame = new JFrame("Lavrinc_calcDemo");
        frame.setContentPane(gui);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel gridLayout = new JPanel(new GridLayout(4, 4, 4, 4));
        gridLayout.add(oneButton);
        gridLayout.add(twoButton);
        gridLayout.add(threeButton);
        gridLayout.add(divButton);
        gridLayout.add(fourButton);
        gridLayout.add(fiveButton);
        gridLayout.add(sixButton);
        gridLayout.add(multButton);
        gridLayout.add(sevenButton);
        gridLayout.add(eightButton);
        gridLayout.add(nineButton);
        gridLayout.add(subButton);
        gridLayout.add(clearButton);
        gridLayout.add(zeroButton);
        gridLayout.add(equalsButton);
        gridLayout.add(additionButton);

        gui.add(gridLayout, BorderLayout.CENTER);
        frame.setBounds(50, 50, 500, 500);
        gridLayout.setBackground(Color.BLACK);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

    public void addActionEvent() {
        oneButton.addActionListener(this);
        twoButton.addActionListener(this);
        threeButton.addActionListener(this);
        divButton.addActionListener(this);
        fourButton.addActionListener(this);
        fiveButton.addActionListener(this);
        sixButton.addActionListener(this);
        multButton.addActionListener(this);
        sevenButton.addActionListener(this);
        eightButton.addActionListener(this);
        nineButton.addActionListener(this);
        subButton.addActionListener(this);
        clearButton.addActionListener(this);
        zeroButton.addActionListener(this);
        equalsButton.addActionListener(this);
        additionButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        String inputRes = null;

        if (source == oneButton) {
            display.setText(display.getText() + "1");
        } else if (source == twoButton) {
            display.setText(display.getText() + "2");
        } else if (source == threeButton) {
            display.setText(display.getText() + "3");
        } else if (source == fourButton) {
            display.setText(display.getText() + "4");
        } else if (source == fiveButton) {
            display.setText(display.getText() + "5");
        } else if (source == sixButton) {
            display.setText(display.getText() + "6");
        } else if (source == sevenButton) {
            display.setText(display.getText() + "7");
        } else if (source == eightButton) {
            display.setText(display.getText() + "8");
        } else if (source == nineButton) {
            display.setText(display.getText() + "9");
        } else if (source == zeroButton) {
            display.setText(display.getText() + "0");

        } else if (source == divButton) {
            inputRes = display.getText();
            hold = Double.parseDouble(display.getText());
            display.setText("");
            label.setText(inputRes + "/");
            calc = 1;
        } else if (source == multButton) {
            inputRes = display.getText();
            hold = Double.parseDouble(display.getText());
            display.setText("");
            label.setText(inputRes + "*");
            calc = 2;
        } else if (source == subButton) {
            inputRes = display.getText();
            hold = Double.parseDouble(display.getText());
            display.setText("");
            label.setText(inputRes + "-");
            calc = 3;
        } else if (source == additionButton) {
            inputRes = display.getText();
            hold = Double.parseDouble(display.getText());
            display.setText("");
            label.setText(inputRes + "+");
            calc = 4;
        } else if (source == clearButton) {
            label.setText("");
            display.setText("");

        } else if (source == equalsButton) {
            switch (calc) {
                case 1:
                    tmp = Double.parseDouble(display.getText());
                    hold = (hold / tmp);
                    display.setText(Double.toString(hold));
                    break;
                case 2:
                    tmp = Double.parseDouble(display.getText());
                    hold = (hold * tmp);
                    display.setText(Double.toString(hold));
                    break;
                case 3:
                    tmp = Double.parseDouble(display.getText());
                    hold = (hold - tmp);
                    display.setText(Double.toString(hold));
                    break;
                case 4:
                    tmp = Double.parseDouble(display.getText());
                    hold = (hold + tmp);
                    display.setText(Double.toString(hold));
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Lavrinc_calcDemo lavrinc_calcDemo = new Lavrinc_calcDemo();
    }
}
