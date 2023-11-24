import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LAB3P1B {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    //LAB 3 PART 1 SECTION B

    private static void createAndShowGUI() {


        JFrame frame = new JFrame("Aniuzu Text Changer");


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JPanel panel = new JPanel();
        frame.add(panel);




        JButton changingButton = new JButton("My Text Changes When You Push Me");
        panel.add(changingButton);




        changingButton.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                changingButton.setText("See, I Told You The Text Would Change!");


            }
        });



        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}