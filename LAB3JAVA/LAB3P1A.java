import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LAB3P1A {
    private JLabel nameLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    // LAB 3 PART 1 SECTION A

    private static void createAndShowGUI() {

        LAB3P1A lab = new LAB3P1A();

        JFrame frame = new JFrame("Aniuzu Translator");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);



        lab.nameLabel = new JLabel("My name is Jordan Aniuzu!");
        panel.add(lab.nameLabel);



        JButton translateButton = new JButton("CLICK TO TRANSLATE");
        panel.add(translateButton);




        translateButton.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent event) {


           
                String translatedName = translateName("Jordan Aniuzu is ainm dom!", "Irish");
                lab.nameLabel.setText(" " + translatedName);

            }
        });

        frame.setSize(500, 500);
        frame.setVisible(true);


    }


    private static String translateName(String name, String language) {
  
        if (language.equalsIgnoreCase("Irish")) {
            return "Jordan Aniuzu is ainm dom!";
        } else {
            return name; 
        }
    }
}