package Smart_city;

import javax.swing.*;

import db.DBConnection;

import java.awt.*;
import java.awt.event.*;

public class ComplaintFormFrame extends JFrame implements ActionListener {

    JTextField typeField;
    JTextArea descriptionArea;
    JButton submitBtn;
    DBConnection db;

     ComplaintFormFrame() {
        super("Complaint");

        Font f2 = new Font("Arial ",Font.BOLD,16);

        db = new DBConnection();

        setLayout(null);
        setBounds(450, 200, 500, 400);

        JLabel typeLabel = new JLabel("Complaint Type:");
        typeLabel.setBounds(50, 30, 150, 30);
        add(typeLabel);
        typeLabel.setFont(f2);

        typeField = new JTextField();
        typeField.setBounds(180, 30, 220, 30);
        add(typeField);
        typeField.setFont(f2);


        JLabel descLabel = new JLabel("Description:");
        descLabel.setBounds(50, 80, 150, 30);
        add(descLabel);
        descLabel.setFont(f2);


        descriptionArea = new JTextArea();
        JScrollPane sp = new JScrollPane(descriptionArea);
        sp.setBounds(180, 80, 220, 150);
        add(sp);
        descriptionArea.setFont(f2);


        submitBtn = new JButton("Submit Complaint");
        submitBtn.setBounds(160, 260, 180, 30);
        submitBtn.addActionListener(this);
        add(submitBtn);
        submitBtn.setFont(f2);


        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String type = typeField.getText();
        String desc = descriptionArea.getText();

        if (type.equals("") || desc.equals("")) {
            JOptionPane.showMessageDialog(this, "All fields required.");
            return;
        }

        String sql = "INSERT INTO complaints(type, description) VALUES('" + type + "','" + desc + "')";
        int result = db.executeUpdate(sql);
        if (result > 0) {
            JOptionPane.showMessageDialog(this, "Complaint submitted successfully!");
            typeField.setText("");
            descriptionArea.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Submission failed.");
        }
    }

    public static void main(String[] args) {
        new ComplaintFormFrame();
    }
}

