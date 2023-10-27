import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {

    private JTextField textField;
    private String input = "";
    private double num1 = 0;
    private char operator = ' ';

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        textField = new JTextField(16);
        textField.setFont(new Font("Arial", Font.PLAIN, 18));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String button : buttons) {
            JButton btn = new JButton(button);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9]")) {
            input += command;
            textField.setText(input);
        } else if (command.equals("C")) {
            input = "";
            num1 = 0;
            operator = ' ';
            textField.setText("");
        } else if (command.matches("[+\\-*/]")) {
            if (input.length() > 0) {
                num1 = Double.parseDouble(input);
                operator = command.charAt(0);
                input = "";
            }
        } else if (command.equals("=")) {
            if (!input.isEmpty() && operator != ' ') {
                double num2 = Double.parseDouble(input);
                double result = 0;

                try {
                    switch (operator) {
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                        case '/':
                            if (num2 == 0) {
                                textField.setText("Error: Divide by zero");
                                return;
                            }
                            result = num1 / num2;
                            break;
                    }
                    textField.setText(String.valueOf(result));
                    input = String.valueOf(result);
                } catch (Exception ex) {
                    textField.setText("Error");
                }
                operator = ' ';
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleCalculator calculator = new SimpleCalculator();
            calculator.setVisible(true);
        });
    }
}
