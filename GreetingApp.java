import javax.swing.*;
import java.awt.*;

public class GreetingApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(GreetingApp::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Greeting App");
        JLabel nameLabel = new JLabel("Enter your name:");
        JTextField nameField = new JTextField(15);
        JButton greetButton = new JButton("Greet");
        JLabel resultLabel = new JLabel(" ");

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(greetButton);
        panel.add(resultLabel);

        greetButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            if (name.isEmpty()) {
                resultLabel.setText("Please enter your name!");
            } else {
                resultLabel.setText("Hello, " + name + "! Welcome to Java GUI.");
            }
        });

        frame.add(panel);
        frame.setSize(450, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}