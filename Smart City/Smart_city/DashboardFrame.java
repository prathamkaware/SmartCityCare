package Smart_city;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DashboardFrame extends JFrame implements ActionListener {

    JButton cityInfoBtn, emergencyBtn, transportBtn, civicBtn, complaintBtn, feedbackBtn, profileBtn, logoutBtn;
    String userName;

     DashboardFrame(String userName) {
        super("Dashboard");
        this.userName = userName;

        setLayout(null);
        setBounds(400, 150, 600, 500);
         Font f1 = new Font("Arial Black",Font.PLAIN,30);
        Font f2 = new Font("Arial ",Font.BOLD,14);
        

        JLabel welcomeLabel = new JLabel("Welcome, " + userName);
        welcomeLabel.setBounds(200, 20, 300, 30);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(welcomeLabel);
        welcomeLabel.setFont(f1);

        cityInfoBtn = new JButton("City Info");
        cityInfoBtn.setBounds(200, 70, 180, 30);
        cityInfoBtn.addActionListener(this);
        add(cityInfoBtn);
        cityInfoBtn.setFont(f2);

        emergencyBtn = new JButton("Emergency Services");
        emergencyBtn.setBounds(200, 110, 180, 30);
        emergencyBtn.addActionListener(this);
        add(emergencyBtn);
        emergencyBtn.setFont(f2);

        transportBtn = new JButton("Transport Info");
        transportBtn.setBounds(200, 150, 180, 30);
        transportBtn.addActionListener(this);
        add(transportBtn);
        transportBtn.setFont(f2);

        civicBtn = new JButton("Civic Services");
        civicBtn.setBounds(200, 190, 180, 30);
        civicBtn.addActionListener(this);
        add(civicBtn);
        civicBtn.setFont(f2);

        complaintBtn = new JButton("Complaint Form");
        complaintBtn.setBounds(200, 230, 180, 30);
        complaintBtn.addActionListener(this);
        add(complaintBtn);
        complaintBtn.setFont(f2);

        feedbackBtn = new JButton("Feedback");
        feedbackBtn.setBounds(200, 270, 180, 30);
        feedbackBtn.addActionListener(this);
        add(feedbackBtn);
        feedbackBtn.setFont(f2);

        profileBtn = new JButton("My Profile");
        profileBtn.setBounds(200, 310, 180, 30);
        profileBtn.addActionListener(this);
        add(profileBtn);
        profileBtn.setFont(f2);

        logoutBtn = new JButton("Logout");
        logoutBtn.setBounds(200, 350, 180, 30);
        logoutBtn.addActionListener(this);
        add(logoutBtn);
        logoutBtn.setFont(f2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == cityInfoBtn) {
            new CityInfoFrame();
        } else if (ae.getSource() == emergencyBtn) {
            new EmergencyServicesFrame();
        } else if (ae.getSource() == transportBtn) {
            new TransportFrame();
        } else if (ae.getSource() == civicBtn) {
            new CivicServicesFrame();
        } else if (ae.getSource() == complaintBtn) {
            new ComplaintFormFrame();
        } else if (ae.getSource() == feedbackBtn) {
            new FeedbackFrame();
        } else if (ae.getSource() == profileBtn) {
            new UserProfileFrame(userName);
        } else if (ae.getSource() == logoutBtn) {
            new LoginFrame();
            this.dispose();
        }
    }
    public static void main(String[] args) {
        new DashboardFrame(null);
    }
    
}

