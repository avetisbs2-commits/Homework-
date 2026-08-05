import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {

    private final JTextField display;
    private double firstValue = 0;
    private String pendingOp = null;
    private boolean startNewNumber = true;

    public Calculator() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        display = new JTextField("0");
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("SansSerif", Font.PLAIN, 28));
        display.setPreferredSize(new Dimension(300, 60));

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
                "C", "±", "%", "/",
                "7", "8", "9", "*",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "0", ".", "⌫", "="
        };

        for (String label : buttons) {
            JButton button = new JButton(label);
            button.setFont(new Font("SansSerif", Font.PLAIN, 20));
            button.setFocusPainted(false);
            button.addActionListener(this::onButtonClick);
            buttonPanel.add(button);
        }

        setLayout(new BorderLayout(5, 5));
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        ((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        pack();
        setLocationRelativeTo(null);
    }

    private void onButtonClick(ActionEvent e) {
        String cmd = ((JButton) e.getSource()).getText();

        switch (cmd) {
            case "0": case "1": case "2": case "3": case "4":
            case "5": case "6": case "7": case "8": case "9":
                appendDigit(cmd);
                break;
            case ".":
                appendDecimalPoint();
                break;
            case "C":
                clear();
                break;
            case "⌫":
                backspace();
                break;
            case "±":
                toggleSign();
                break;
            case "%":
                applyPercent();
                break;
            case "/": case "*": case "-": case "+":
                setPendingOperation(cmd);
                break;
            case "=":
                calculateResult();
                break;
        }
    }

    private void appendDigit(String digit) {
        if (startNewNumber) {
            display.setText(digit.equals("0") ? "0" : digit);
            startNewNumber = false;
        } else {
            if (display.getText().equals("0")) {
                display.setText(digit);
            } else {
                display.setText(display.getText() + digit);
            }
        }
    }

    private void appendDecimalPoint() {
        if (startNewNumber) {
            display.setText("0.");
            startNewNumber = false;
        } else if (!display.getText().contains(".")) {
            display.setText(display.getText() + ".");
        }
    }

    private void clear() {
        display.setText("0");
        firstValue = 0;
        pendingOp = null;
        startNewNumber = true;
    }

    private void backspace() {
        String text = display.getText();
        if (text.length() > 1) {
            display.setText(text.substring(0, text.length() - 1));
        } else {
            display.setText("0");
            startNewNumber = true;
        }
    }

    private void toggleSign() {
        double value = Double.parseDouble(display.getText());
        display.setText(formatNumber(-value));
    }

    private void applyPercent() {
        double value = Double.parseDouble(display.getText());
        display.setText(formatNumber(value / 100));
    }

    private void setPendingOperation(String op) {
        if (pendingOp != null && !startNewNumber) {
            calculateResult();
        }
        firstValue = Double.parseDouble(display.getText());
        pendingOp = op;
        startNewNumber = true;
    }

    private void calculateResult() {
        if (pendingOp == null) return;

        double secondValue = Double.parseDouble(display.getText());
        double result;

        switch (pendingOp) {
            case "+": result = firstValue + secondValue; break;
            case "-": result = firstValue - secondValue; break;
            case "*": result = firstValue * secondValue; break;
            case "/":
                if (secondValue == 0) {
                    display.setText("Error");
                    pendingOp = null;
                    startNewNumber = true;
                    return;
                }
                result = firstValue / secondValue;
                break;
            default: return;
        }

        display.setText(formatNumber(result));
        pendingOp = null;
        startNewNumber = true;
    }

    private String formatNumber(double value) {
        if (value == Math.floor(value) && !Double.isInfinite(value)) {
            return String.valueOf((long) value);
        }
        return String.valueOf(value);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}