// Take Home 5: Login Frame (Swing GUI) (Take Home, p. 70)
package page70;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton okButton, clearButton, exitButton;
    public LoginFrame() {
        setTitle("USER LOGIN");
        setSize(350, 220);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel userLabel = new JLabel("USERNAME");
        userLabel.setBounds(30, 30, 100, 25);
        add(userLabel);
        usernameField = new JTextField();
        usernameField.setBounds(130, 30, 150, 25);
        add(usernameField);
        JLabel passLabel = new JLabel("PASSWORD");
        passLabel.setBounds(30, 70, 100, 25);
        add(passLabel);
        passwordField = new JPasswordField();
        passwordField.setBounds(130, 70, 150, 25);
        add(passwordField);
        okButton = new JButton("OK");
        okButton.setBounds(50, 120, 70, 25);
        okButton.addActionListener(this);
        add(okButton);
        clearButton = new JButton("CLEAR");
        clearButton.setBounds(130, 120, 80, 25);
        clearButton.addActionListener(this);
        add(clearButton);
        exitButton = new JButton("EXIT");
        exitButton.setBounds(225, 120, 70, 25);
        exitButton.addActionListener(this);
        add(exitButton);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == okButton) {
            String user = usernameField.getText();
            String pass = new String(passwordField.getPassword());
            if (user.equals("Admin") && pass.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.");
            }
        }
        if (e.getSource() == clearButton) {
            usernameField.setText("");
            passwordField.setText("");
        }
        if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }
    public static void main  (String[] args) {
        new LoginFrame();
    }
}
