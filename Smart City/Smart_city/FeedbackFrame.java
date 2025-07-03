package Smart_city;

import javax.swing.*;

import db.DBConnection;

import java.awt.*;
import java.awt.event.*;

public class FeedbackFrame extends JFrame implements ActionListener {

    JTextArea feedbackArea;
    JComboBox<String> ratingBox;
    JButton submitBtn;
    DBConnection db;

    FeedbackFrame() {
        super("Feedback");
        Font f1 = new Font("Arial Black",Font.PLAIN,30);
        Font f2 = new Font("Arial ",Font.BOLD,18);

        db = new DBConnection();

        setLayout(null);
        setBounds(450, 200, 500, 350);

        JLabel title = new JLabel(" Give Your Feedback ");
        title.setBounds(100, 30, 400, 30);
        add(title);
        title.setFont(f1);

        JLabel label = new JLabel(" Your Feedback:");
        label.setBounds(50, 130, 150, 30);
        add(label);
        label.setFont(f2);

        feedbackArea = new JTextArea();
        JScrollPane sp = new JScrollPane(feedbackArea);
        sp.setBounds(200, 130, 250, 100);
        add(sp);
        feedbackArea.setFont(f2);

        JLabel ratingLabel = new JLabel("Rating:");
        ratingLabel.setBounds(100, 300, 100, 30);
        add(ratingLabel);
        ratingLabel.setFont(f2);

        String[] ratings = {"1", "2", "3", "4", "5"};
        ratingBox = new JComboBox<>(ratings);
        ratingBox.setBounds(200, 300, 60, 30);
        add(ratingBox);
        ratingBox.setFont(f2);

        submitBtn = new JButton("Submit");
        submitBtn.setBounds(230, 370, 120, 30);
        submitBtn.addActionListener(this);
        add(submitBtn);
        submitBtn.setFont(f2);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(600,500);
    }

    public void actionPerformed(ActionEvent ae) {
        String feedback = feedbackArea.getText();
        int rating = Integer.parseInt((String) ratingBox.getSelectedItem());

        if (feedback.equals("")) {
            JOptionPane.showMessageDialog(this, "Please write feedback.");
            return;
        }

        String sql = "INSERT INTO feedback(message, rating) VALUES('" + feedback + "'," + rating + ")";
        int result = db.executeUpdate(sql);
        if (result > 0) {
            JOptionPane.showMessageDialog(this, "Thank you for your feedback!");
            feedbackArea.setText("");
            ratingBox.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(this, "Feedback submission failed.");
        }
    }
    public static void main(String[] args) {
        new FeedbackFrame();
    }
}
