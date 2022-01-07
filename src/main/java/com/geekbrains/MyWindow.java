package com.geekbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MyWindow extends JFrame {
    int number;
    String operator;

    public MyWindow() {
        setTitle("Калькулятор Алины");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 275, 350);
        setResizable(false);
        JButton[] numberButtons = new JButton[10];

        setLayout(null);
        numberButtons[0] = new JButton("0");
        numberButtons[0].setBounds(70, 200 + 50, 50, 50);
        add(numberButtons[0]);
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                int btnIndex = x * 3 + y + 1;
                numberButtons[btnIndex] = new JButton(String.valueOf(btnIndex));
                numberButtons[btnIndex].setBounds(y * (50 + 10) + 10, x * (50 + 10) + 70, 50, 50);
                add(numberButtons[btnIndex]);
            }
        }
        JTextField textField = new JTextField();
        add(textField);
        JCheckBox checkBox = new JCheckBox();
        setVisible(true);
        textField.setBounds(10, 10, 240, 50);
        add(checkBox);


        ActionListener l = (ActionEvent e) -> {
            JButton b = (JButton) e.getSource();
            textField.setText(textField.getText() + b.getText());
        };

        for (JButton b : numberButtons) {
            b.addActionListener(l);
        }


        JButton backspace = new JButton("<-");
        backspace.setBounds(10, 250, 50, 50);
        add(backspace);
        backspace.addActionListener(e -> textField.setText(""));

        JButton equ = new JButton("=");
        equ.setBounds(130, 250, 50, 50);
        add(equ);
        equ.addActionListener(e -> {
            int c = Integer.parseInt(textField.getText());
            int result = number;
            if (Objects.equals(operator, "+")) {
                result = number + c;
            }
            if (Objects.equals(operator, "-")) {
                result = number - c;
            }
            if (Objects.equals(operator, "*")) {
                result = number * c;
            }
            if (Objects.equals(operator, "/")) {
                if (c == 0) {
                    result = 0;
                } else {
                    result = number / c;
                }
            }
            textField.setText(String.valueOf(result));

        });

        JButton plus = new JButton("+");
        plus.setBounds(200, 70, 50, 50);
        add(plus);
        plus.addActionListener(e -> {
            number = Integer.parseInt(textField.getText());
            operator = "+";
            textField.setText("");
        });

        JButton minus = new JButton("-");
        minus.setBounds(200, 130, 50, 50);
        add(minus);
        minus.addActionListener(e -> {
            number = Integer.parseInt(textField.getText());
            operator = "-";
            textField.setText("");
        });

        JButton multiply = new JButton("*");
        multiply.setBounds(200, 190, 50, 50);
        add(multiply);
        multiply.addActionListener(e -> {
            number = Integer.parseInt(textField.getText());
            operator = "*";
            textField.setText("");
        });

        JButton div = new JButton("/");
        div.setBounds(200, 250, 50, 50);
        add(div);
        div.addActionListener(e -> {
            number = Integer.parseInt(textField.getText());
            operator = "/";
            textField.setText("");
        });

    }


    public static void main(String[] args) {

        new MyWindow();


    }
}

