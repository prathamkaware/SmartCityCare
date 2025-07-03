package Smart_city;



import javax.swing.*;
import java.awt.*;

public class EmergencyServicesFrame extends JFrame {

     EmergencyServicesFrame() {
        super("Services");

        setLayout(new BorderLayout());
        setBounds(450, 200, 500, 400);

        JTextArea area = new JTextArea();
        area.setText("\n\t   Emergency Contacts:\n\n" +
                "Police Station: 100\n" +
                "Fire Station: 101\n" +
                "Ambulance: 102\n" +
                "Disaster Management: 108\n" +
                "Women Helpline: 1091\n" +
                "Child Helpline: 1098\n");

        area.setEditable(false);
        area.setFont(new Font("Arial", Font.BOLD, 16));
        add(new JScrollPane(area), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EmergencyServicesFrame();
    }
}

