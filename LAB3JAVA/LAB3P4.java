import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LAB3P4 {
    private double balance = 50.0;
    private JLabel balanceLabel;

    public LAB3P4() {

        // LAB 3 PART 4V
        JFrame frame = new JFrame("Mobile Top-up System");


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        balanceLabel = new JLabel("Balance: $" + balance);
        balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);


        panel.add(balanceLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();

        buttonPanel.setLayout(new FlowLayout());

        JButton topUpButton = createButton("Top-up");
        JButton makeCallButton = createButton("Make Call");
        JButton sendTextButton = createButton("Send Text");

        buttonPanel.add(topUpButton);
        buttonPanel.add(makeCallButton);
        buttonPanel.add(sendTextButton);

        panel.add(buttonPanel, BorderLayout.CENTER);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

private JButton createButton(String buttonText) {
        JButton button = new JButton(buttonText);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (buttonText.equals("Top-up")) {
                    topUp();
                } else if (buttonText.equals("Make Call")) {
                    makeCall();
                } else if (buttonText.equals("Send Text")) {
                    sendText();
                }
            }
        });
        return button;
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LAB3P4());
    }
}