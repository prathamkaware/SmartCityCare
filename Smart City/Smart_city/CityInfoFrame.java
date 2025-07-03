package Smart_city;



import javax.swing.*;
import java.awt.*;

public class CityInfoFrame extends JFrame {

     CityInfoFrame() {
        super("Info");
        

        setLayout(new BorderLayout());
        setBounds(450, 200, 500, 400);

        JTextArea area = new JTextArea();
        area.setText("\n\t    Smart City Facilities:\n\n\n" +
                "  - Hospital: Green Life Hospital, City Hospital\n\n" +
                " - Schools: Smart Public School, City International School\n\n" +
                " - Malls: Metro Mall, City Square\n\n" +
                " - Parks: Eco Garden, Rose Park\n\n" +
                " - Tourist Spots: River View, Tech Museum");

        area.setEditable(false);
        area.setFont(new Font("Arial", Font.BOLD, 16));
        add(new JScrollPane(area), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CityInfoFrame();
    }
}
