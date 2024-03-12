/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ExamPreperation;

import javax.swing.*;

public class JTextFieldExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("JTextField Example");

        // Create a label
        JLabel label = new JLabel("Enter text:");

        // Create a text field
        JTextField textField = new JTextField(20); // 20 is the number of columns

        // Set the position of label and text field
        label.setBounds(50, 50, 100, 30);
        textField.setBounds(150, 50, 200, 30);

        // Add label and text field to the frame
        frame.add(label);
        frame.add(textField);

        // Set frame size and layout
        frame.setSize(400, 150);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}