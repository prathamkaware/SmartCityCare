package Smart_city;



import javax.swing.*;

import db.DBConnection;

import java.awt.*;
import java.sql.*;

public class AdminPanelFrame extends JFrame {

    DBConnection db;
    JTextArea area;

     AdminPanelFrame() {
        super("AdminPanel");

        db = new DBConnection();

        setLayout(new BorderLayout());
        setBounds(400, 180, 600, 450);

        area = new JTextArea();
        loadData();
        add(new JScrollPane(area), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void loadData() {
        area.setText("All Users:\n\n");
        try {
            ResultSet rs = db.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                area.append("ID: " + rs.getInt("id") + "\n");
                area.append("Name: " + rs.getString("name") + "\n");
                area.append("Email: " + rs.getString("email") + "\n");
                area.append("City: " + rs.getString("city") + "\n");
                area.append("Mobile: " + rs.getString("mobile") + "\n\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new AdminPanelFrame();
    }
}

