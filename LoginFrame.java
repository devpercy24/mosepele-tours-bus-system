import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {

    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    public LoginFrame() {

        setTitle("Mosepele Tours Login");
        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main panel with color
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(30, 144, 255)); // blue background
        add(panel);

        // Title
        JLabel title = new JLabel("Mosepele Tours");
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setForeground(Color.WHITE);
        title.setBounds(150,20,250,40);
        panel.add(title);

        // Username Label
        JLabel userLabel = new JLabel("Username:");
        userLabel.setForeground(Color.WHITE);
        userLabel.setBounds(100,100,100,25);
        panel.add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(200,100,150,30);
        panel.add(usernameField);

        // Password Label
        JLabel passLabel = new JLabel("Password:");
        passLabel.setForeground(Color.WHITE);
        passLabel.setBounds(100,150,100,25);
        panel.add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(200,150,150,30);
        panel.add(passwordField);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.setBounds(200,210,120,35);
        loginButton.setBackground(new Color(34,139,34)); // green
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if(username.equals("admin") && password.equals("1234")) {

                    JOptionPane.showMessageDialog(null,"Login Successful");

                    new MainApp();
                    dispose();

                } else {

                    JOptionPane.showMessageDialog(null,"Invalid Login");

                }
            }
        });

        setVisible(true);
    }
}