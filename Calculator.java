/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator extends JFrame
{
    private JTextArea display; 

    private JButton zero;
    private JButton decimal;
    private JButton posneg;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton clear;
    private JButton equal;

    private JButton addition;
    private JButton subtraction;
    private JButton multiplication;
    private JButton division;
    private JButton backspace;

    public static void Main(String[] args) {
        new Calculator();
    }

    public Calculator() {
        setDisplay();
        setButtons();
        setUI(this);
    }

    private void setDisplay() {
        display = new JTextArea();
        
        //create a white bar
        display.setBounds(10, 10, 280, 50);
        display.setEditable(false);

        //make the numbers display at the right side of the bar
        display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);        
        display.setText("0");

        //edit the style of the font
        display.setFont(new Font("Arial",Font.PLAIN,32));
        add(display);
    }

    private void setButtons() {
        zero = new JButton("0");
        zero.setBounds(82,256,65,55);
        zero.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (display.getText().length() > 13)
                        return;
                    if (display.getText().equalsIgnoreCase("0")) {
                        display.setText("0");
                        return;
                    }
                    display.append("0");
                }
            });
        add(zero);

        one = new JButton("1");
        one.setBounds(10,194,65,55);
        one.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (display.getText().length() > 13)
                        return;
                    if (display.getText().equalsIgnoreCase("0")) {
                        display.setText("1");
                        return;
                    }
                    display.append("1");
                }
            });
        add(one);

        two = new JButton("2");
        two.setBounds(82,194,65,55);
        two.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (display.getText().length() > 13)
                        return;
                    if (display.getText().equalsIgnoreCase("0")) {
                        display.setText("2");
                        return;
                    }
                    display.append("2");
                }
            });
        add(two);

        three = new JButton("3");
        three.setBounds(154,194,65,55);
        three.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (display.getText().length() > 13)
                        return;
                    if (display.getText().equalsIgnoreCase("0")) {
                        display.setText("3");
                        return;
                    }
                    display.append("3");
                }
            });
        add(three);

        four = new JButton("4");
        four.setBounds(10,132,65,55);
        four.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (display.getText().length() > 13)
                        return;
                    if (display.getText().equalsIgnoreCase("0")) {
                        display.setText("4");
                        return;
                    }
                    display.append("4");
                }
            });
        add(four);

        five = new JButton("5");
        five.setBounds(82,132,65,55);
        five.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (display.getText().length() > 13)
                        return;
                    if (display.getText().equalsIgnoreCase("0")) {
                        display.setText("5");
                        return;
                    }
                    display.append("5");
                }
            });
        add(five);

        six = new JButton("6");
        six.setBounds(154,132,65,55);
        six.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (display.getText().length() > 13)
                        return;
                    if (display.getText().equalsIgnoreCase("0")) {
                        display.setText("6");
                        return;
                    }
                    display.append("6");
                }
            });
        add(six);

        seven = new JButton("7");
        seven.setBounds(10,70,65,55);
        seven.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (display.getText().length() > 13)
                        return;
                    if (display.getText().equalsIgnoreCase("0")) {
                        display.setText("7");
                        return;
                    }
                    display.append("7");
                }
            });
        add(seven);

        eight = new JButton("8");
        eight.setBounds(82,70,65,55);
        eight.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (display.getText().length() > 13)
                        return;
                    if (display.getText().equalsIgnoreCase("0")) {
                        display.setText("8");
                        return;
                    }
                    display.append("8");
                }
            });
        add(eight);

        nine = new JButton("9");
        nine.setBounds(154,70,65,55);
        nine.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (display.getText().length() > 13)
                        return;
                    if (display.getText().equalsIgnoreCase("0")) {
                        display.setText("9");
                        return;
                    }
                    display.append("9");
                }
            });
        add(nine);
        
        decimal = new JButton(".");
        decimal.setBounds(10,256,65,55);
        add(decimal);

        posneg = new JButton("+/-");
        posneg.setBounds(154,256,65,55);
        add(posneg);

        clear = new JButton("C");
        clear.setBounds(154,318,65,55);
        add(clear);

        equal = new JButton("=");
        equal.setBounds(10,318,137,55);
        add(equal);

        addition = new JButton("+");
        addition.setBounds(226,70,65,55);
        add(addition);

        subtraction = new JButton("-");
        subtraction.setBounds(226,132,65,55);
        add(subtraction);

        multiplication = new JButton("x");
        multiplication.setBounds(226,194,65,55);
        add(multiplication);

        division = new JButton("÷");
        division.setBounds(226,254,65,55);
        add(division);

        backspace = new JButton("\u232b");
        backspace.setBounds(226,316,65,55);
        add(backspace);
    }

    private void setUI(Calculator app) {
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(300,400);
        app.setResizable(false);
        app.setLayout(null);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
    }
}
