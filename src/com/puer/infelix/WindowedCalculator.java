package com.puer.infelix;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowedCalculator {
    private JPanel panel;
    private JTextField firstNumberTextField;
    private JTextField secondNumberTextField;
    private JTextField resultTextField;
    private JButton clearButton;
    private JButton divideButton;
    private JButton multiplyButton;
    private JButton minusButton;
    private JButton plusButton;
    private JLabel charLabel;
    private JLabel equalsLabel;

    public WindowedCalculator() {
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float firstNumber = Float.parseFloat(firstNumberTextField.getText());
                float secondNumber = Float.parseFloat(secondNumberTextField.getText());
                resultTextField.setText(String.valueOf(firstNumber + secondNumber));
                charLabel.setText("+");
                equalsLabel.setText("=");
            }
        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float firstNumber = Float.parseFloat(firstNumberTextField.getText());
                float secondNumber = Float.parseFloat(secondNumberTextField.getText());
                resultTextField.setText(String.valueOf(firstNumber - secondNumber));
                charLabel.setText("-");
                equalsLabel.setText("=");
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float firstNumber = Float.parseFloat(firstNumberTextField.getText());
                float secondNumber = Float.parseFloat(secondNumberTextField.getText());
                resultTextField.setText(String.valueOf(firstNumber * secondNumber));
                charLabel.setText("*");
                equalsLabel.setText("=");
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float firstNumber = Float.parseFloat(firstNumberTextField.getText());
                float secondNumber = Float.parseFloat(secondNumberTextField.getText());
                resultTextField.setText(String.valueOf(firstNumber / secondNumber));
                charLabel.setText("/");
                equalsLabel.setText("=");
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                charLabel.setText("");
                equalsLabel.setText("");
                firstNumberTextField.setText("");
                secondNumberTextField.setText("");
                resultTextField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new WindowedCalculator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setMinimumSize(new Dimension(600, 200));
        frame.setSize(new Dimension(600, 200));
        frame.setVisible(true);
    }
}
