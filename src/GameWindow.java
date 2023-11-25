import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JTextField inputField;
    private JButton button;

    public GameWindow() {
        super("Stranded");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Create the text area
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Create the input field
        inputField = new JTextField();
        inputField.addActionListener(this);

        // Create the button
        button = new JButton("Submit");
        button.addActionListener(this);

        // Create a panel and add the input field and button
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(button, BorderLayout.EAST);

        // Add the components to the content pane
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(panel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void appendText(String text) {
        textArea.append(text + "\n");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == inputField || e.getSource() == button) {
            String userInput = inputField.getText();
            // Process the user input
            // ...
            inputField.setText(""); // Clear the input field
        }
    }

    public static void main(String[] args) {
        GameWindow window = new GameWindow();
        window.appendText("Welcome to the text-based game!");
    }
}