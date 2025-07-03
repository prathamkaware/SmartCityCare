package Smart_city;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CivicServicesFrame extends JFrame implements ActionListener {

    JCheckBox waterCheck, electricityCheck, garbageCheck, internetCheck;
    JButton submitBtn;

      CivicServicesFrame() {
        super("CivicServices");
         Font f2 = new Font("Arial ",Font.BOLD,16);

        setLayout(null);
        setBounds(450, 200, 500, 400);

        JLabel label = new JLabel("Select services you want to request:");
        label.setBounds(50, 30, 400, 30);
        add(label);
        label.setFont(f2);

        waterCheck = new JCheckBox("Water Supply");
        waterCheck.setBounds(50, 70, 200, 30);
        add(waterCheck);
        waterCheck.setFont(f2);

        electricityCheck = new JCheckBox("Electricity Connection");
        electricityCheck.setBounds(50, 110, 200, 30);
        add(electricityCheck);
        electricityCheck.setFont(f2);

        garbageCheck = new JCheckBox("Garbage Collection");
        garbageCheck.setBounds(50, 150, 200, 30);
        add(garbageCheck);
        garbageCheck.setFont(f2);

        internetCheck = new JCheckBox("Broadband Connection");
        internetCheck.setBounds(50, 190, 200, 30);
        add(internetCheck);
        internetCheck.setFont(f2);

        submitBtn = new JButton("Submit Request");
        submitBtn.setBounds(150, 250, 150, 30);
        submitBtn.addActionListener(this);
        add(submitBtn);
        submitBtn.setFont(f2);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        StringBuilder sb = new StringBuilder("Service Requested:\n");

        if (waterCheck.isSelected()) sb.append("- Water Supply\n");
        if (electricityCheck.isSelected()) sb.append("- Electricity Connection\n");
        if (garbageCheck.isSelected()) sb.append("- Garbage Collection\n");
        if (internetCheck.isSelected()) sb.append("- Broadband Connection\n");

        if (sb.toString().equals("Service Requested:\n")) {
            JOptionPane.showMessageDialog(this, "No service selected.");
        } else {
            JOptionPane.showMessageDialog(this, sb.toString());
        }
    }

    public static void main(String[] args) {
        new CivicServicesFrame();
    }
}
