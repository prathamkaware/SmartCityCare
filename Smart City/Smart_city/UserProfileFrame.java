package Smart_city;

import javax.swing.*;
import java.awt.*;

public class UserProfileFrame extends JFrame {

     UserProfileFrame(String userName) {
        super("MyProfile");

        setLayout(null);
        setBounds(450, 200, 450, 300);

        JLabel label = new JLabel("User Profile");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setBounds(150, 20, 200, 30);
        add(label);

        JLabel name = new JLabel("Name: " + userName);
        name.setBounds(50, 70, 300, 30);
        add(name);

        JLabel email = new JLabel("Email: sample@user.com");
        email.setBounds(50, 110, 300, 30);
        add(email);

        JLabel mobile = new JLabel("Mobile: 9876543210");
        mobile.setBounds(50, 150, 300, 30);
        add(mobile);

        JLabel city = new JLabel("City: Smartville");
        city.setBounds(50, 190, 300, 30);
        add(city);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UserProfileFrame(null);
    }
}

