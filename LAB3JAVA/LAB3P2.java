import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class LAB3P2 {
    private Map<String, String> itemInfo = new HashMap<>();
    private DefaultListModel<String> listModel;

    //LAB 3 PART 2 

    public LAB3P2() {
        JFrame frame = new JFrame("IMAGE SWITCH");

        System.out.println(System.getProperty("user.dir"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel topPanel = new JPanel();

        listModel = new DefaultListModel<>();

        JList<String> itemList = new JList<>(listModel);


        itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        topPanel.add(itemList);

        JPanel centerPanel = new JPanel();
        JLabel imageLabel = new JLabel("Images will appear here: please select from the above list");


        centerPanel.add(imageLabel);

        JPanel bottomPanel = new JPanel();
        JTextArea infoTextArea = new JTextArea();



        infoTextArea.setEditable(false);
        infoTextArea.setLineWrap(true);
        infoTextArea.setWrapStyleWord(true);
        bottomPanel.add(infoTextArea);



        frame.getContentPane().setLayout(new BorderLayout());
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);


   
        itemInfo.put("Dean", "This is Dean, is silly yet very funny and enjoys sports!");
        ImageIcon imageIcon = new ImageIcon("brother.jpeg"); 

        itemInfo.put("Princewill", "This is Princewill, He enjoys Video games and chocolate!");
         ImageIcon ImageIcon = new ImageIcon("brother1.jpeg");

        itemInfo.put("Alexis", "This is Alexis, she recently graduated from Computer Science and were all so proud!");

         ImageIcon ImageIcon1 = new ImageIcon("sister.jpeg"); 

        for (String item : itemInfo.keySet()) {
            listModel.addElement(item);

        }

        itemList.addListSelectionListener(e -> {
            String selectedItem = itemList.getSelectedValue();
            if (selectedItem != null) {
                imageLabel.setText("Image of " + selectedItem);
                infoTextArea.setText(itemInfo.get(selectedItem));
            }
        });

        frame.setVisible(true);
        topPanel.add(imageLabel);
    }

    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new LAB3P2());


    }
}