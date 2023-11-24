import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class LAB3P3 {
    private Map<String, ImageIcon> imageMap;
    private JLabel imageLabel;
    private JLabel colorChangeLabel;

    public LAB3P3() {


        //LAB 3 PART 3
        JFrame frame = new JFrame("Arsenal Football Club");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());

        JComboBox<String> colorComboBox = new JComboBox<>();
        colorComboBox.addItem("Arsenal History");
        colorComboBox.addItem("Arsenal Players");
        colorComboBox.addItem("Arsenal Managers");
        colorComboBox.addItem("Arsenal Trophies");
        topPanel.add(colorComboBox);

        
        frame.add(topPanel, BorderLayout.NORTH);

        imageLabel = new JLabel("Select an item from the combo box to display the image: ");
        
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        frame.add(imageLabel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        colorChangeLabel = new JLabel("This image changes depending on which arsenal category you pick: ");


        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LAB3P3());
    }
}