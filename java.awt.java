import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
 
public class SimpleCalculator extends JFrame implements ActionListener { 
    JTextField display; 
    double num1, result; 
    String operator; 
 
    SimpleCalculator() { 
        setTitle("Simple Calculator"); 
        setLayout(new BorderLayout()); 
 
        display = new JTextField(); 
        display.setEditable(false); 
        add(display, BorderLayout.NORTH); 
 
        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5)); 
        String[] buttons = { 
            "7", "8", "9", "/", 
            "4", "5", "6", "*", 
            "1", "2", "3", "-", 
            "C", "0", "=", "+" 
        }; 
 
        for (String text : buttons) { 
            JButton btn = new JButton(text); 
            btn.addActionListener(this);   // register event listener 
            panel.add(btn); 
        } 
 
        add(panel, BorderLayout.CENTER); 
        setSize(300, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true); 
    } 
 
    public void actionPerformed(ActionEvent e) { 
        String command = e.getActionCommand(); 
 
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') { 
            display.setText(display.getText() + command); 
        } else if (command.equals("C")) { 
            display.setText(""); 
            num1 = 0; 
            operator = ""; 
        } else if (command.equals("=")) { 
            double num2 = Double.parseDouble(display.getText()); 
            switch (operator) { 
                case "+": result = num1 + num2; break; 
                case "-": result = num1 - num2; break; 
                case "*": result = num1 * num2; break; 
                case "/": result = num1 / num2; break; 
            } 
            display.setText(String.valueOf(result)); 
        } else { // operator pressed 
            num1 = Double.parseDouble(display.getText()); 
            operator = command; 
            display.setText(""); 
        } 
    } 
 
    public static void main(String[] args) { 
        new SimpleCalculator(); 
    } 
} 