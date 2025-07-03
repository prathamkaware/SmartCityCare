package Smart_city;



import javax.swing.*;

import db.DBConnection;

import java.awt.*;
import java.awt.event.*;

public class SignupFrame extends JFrame implements ActionListener {

    JTextField nameField, emailField, mobileField, cityField;
    JPasswordField passwordField;
    JButton registerBtn, backBtn;
    DBConnection db;

     SignupFrame() {
        super("Signup");
        Font f1 = new Font("Arial Black",Font.PLAIN,30);
        Font f2 = new Font("Arial ",Font.BOLD,18);



        db = new DBConnection();

        setLayout(null);
        setBounds(450, 180, 450, 400);

         JLabel title = new JLabel("Enter Details for create Account");
        title.setBounds(50, 50, 600, 30);
        add(title);
        title.setFont(f1);
        

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(100, 120, 100, 30);
        add(l1);
        l1.setFont(f2);

        nameField = new JTextField();
        nameField.setBounds(200, 120, 200, 30);
        add(nameField);
         nameField.setFont(f2);

        JLabel l2 = new JLabel("Email:");
        l2.setBounds(100, 170, 100, 30);
        add(l2);
         l2.setFont(f2);

        emailField = new JTextField();
        emailField.setBounds(200, 170, 200, 30);
        add(emailField);
         emailField.setFont(f2);

        JLabel l3 = new JLabel("Mobile:");
        l3.setBounds(100, 220, 100, 30);
        add(l3);
         l3.setFont(f2);

        mobileField = new JTextField();
        mobileField.setBounds(200, 220, 200, 30);
        add(mobileField);
         mobileField.setFont(f2);

        JLabel l4 = new JLabel("City:");
        l4.setBounds(100, 270, 100, 30);
        add(l4);
         l4.setFont(f2);

        cityField = new JTextField();
        cityField.setBounds(200, 270, 200, 30);
        add(cityField);
         cityField.setFont(f2);

        JLabel l5 = new JLabel("Password:");
        l5.setBounds(100, 320, 100, 30);
        add(l5);
         l5.setFont(f2);

        passwordField = new JPasswordField();
        passwordField.setBounds(200, 320, 200, 30);
        add(passwordField);
         passwordField.setFont(f2);

        registerBtn = new JButton("Register");
        registerBtn.setBounds(130, 400, 120, 30);
        registerBtn.addActionListener(this);
        add(registerBtn);
         registerBtn.setFont(f2);

        backBtn = new JButton("Back");
        backBtn.setBounds(270, 400, 120, 30);
        backBtn.addActionListener(this);
        add(backBtn);
         backBtn.setFont(f2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(650,500);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == registerBtn) {
            registerUser();
        } else if (ae.getSource() == backBtn) {
            new LoginFrame();
            this.dispose();
        }
    }

    private void registerUser() {
        String name = nameField.getText();
        String email = emailField.getText();
        String mobile = mobileField.getText();
        String city = cityField.getText();
        String password = new String(passwordField.getPassword());

        if (name.equals("") || email.equals("") || mobile.equals("") || city.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(this, "All fields are required");
            return;
        }

        try {
            String query = "INSERT INTO users(name, email, mobile, city, password) VALUES('" +
                    name + "','" + email + "','" + mobile + "','" + city + "','" + password + "')";
            int result = db.executeUpdate(query);

            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Registered successfully");
                new LoginFrame();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error occurred while registering");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignupFrame();
    }
}
