package Smart_city;



import javax.swing.*;
import java.awt.*;

public class TransportFrame extends JFrame {

     TransportFrame() {
        super("TransportInfo");
         

        setLayout(new BorderLayout());
        setBounds(450, 200, 500, 400);

        JTextArea area = new JTextArea();
        area.setText("     Public Transport System:\n\n" +
                "Metro:\n - Line 1: Central Station to East End (Every 10 mins)\n \n" +
                "Bus:\n Route 21: Airport to City Center\n\n- Route 33: Old Town to Tech Park\n\n" +
                "Auto/Taxi:\n- Available via City Cab App or Smart Taxi Stands\n\n" +
                "Bikes/Scooters:\n- Rented via 'SmartRide' Kiosks across town");
                

        area.setEditable(false);
        area.setFont(new Font("Arial", Font.BOLD, 16));
        add(new JScrollPane(area), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TransportFrame();
        
    }
}

