package Smart_city;



import data.User;

import javax.swing.*;

import db.DBConnection;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginFrame extends JFrame implements ActionListener {

    JTextField emailField;
    JPasswordField passwordField;
    JButton loginBtn, signupBtn;
    DBConnection db;

     LoginFrame() {
        super("Login");
        Font f1 = new Font("Arial Black",Font.PLAIN,30);
        Font f2 = new Font("Arial ",Font.BOLD,18);

        db = new DBConnection();


        setLayout(null);
        setBounds(500, 200, 400, 300);
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/7.jpg"));
         Image i2 = i1.getImage().getScaledInstance(1000, 500, 1);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel l9 = new JLabel(i3);
         l9.setBounds(0, 0, 960, 1080);
         add(l9);


        JLabel title = new JLabel("LOGIN DETAILS");
        add(title);
        title.setBounds(100,50,300,40);
        title.setFont(f1);

        JLabel l1 = new JLabel("Email:");
        l1.setBounds(50, 150, 100, 30);
        add(l1);
        l1.setFont(f2);

        emailField = new JTextField();
        emailField.setBounds(150, 150, 180, 30);
        add(emailField);
        emailField.setFont(f2);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(50, 200, 100, 30);
        add(l2);
        l2.setFont(f2);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 200, 180, 30);
        add(passwordField);
        passwordField.setFont(f2);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(80, 260, 100, 30);
        loginBtn.addActionListener(this);
        add(loginBtn);
        loginBtn.setFont(f2);

        signupBtn = new JButton("Signup");
        signupBtn.setBounds(200, 260, 100, 30);
        signupBtn.addActionListener(this);
        add(signupBtn);
        signupBtn.setFont(f2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,350);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == loginBtn) {
            login();
        } else if (ae.getSource() == signupBtn) {
            new SignupFrame();
            this.dispose();
        }
    }

    private void login() {
        String email = emailField.getText();
        String password = String.valueOf(passwordField.getPassword());

        try {
            String query = "SELECT * FROM users WHERE email='" + email + "' AND password='" + password + "'";
            ResultSet rs = db.executeQuery(query);

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login successful!");
                new DashboardFrame(rs.getString("name"));
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}

