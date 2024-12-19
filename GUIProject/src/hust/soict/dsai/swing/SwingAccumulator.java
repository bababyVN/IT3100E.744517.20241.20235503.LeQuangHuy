package hust.soict.dsai.swing;

import javax.swing.*;  // Import for Swing components

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;  // Import for event handling

public class SwingAccumulator extends JFrame {
    private JTextField tfInput;  
    private JTextField tfOutput; 
    private int sum = 0;  // Initialize sum to 0

    public SwingAccumulator() {
        Container cp = getContentPane();  
        cp.setLayout(new GridLayout(2, 2));  

        cp.add(new JLabel("Enter an integer:"));  
        tfInput = new JTextField();  
        tfInput.addActionListener(new TFInputListener());  
        cp.add(tfInput); 

        cp.add(new JLabel("The accumulated sum is:"));  
        tfOutput = new JTextField(20);  
        tfOutput.setEditable(false); 
        cp.add(tfOutput);  

        setTitle("Swing Accumulator");  
        setSize(350, 120);  
        setVisible(true); 
    }

    public static void main(String[] args) {
        new SwingAccumulator();  
    }

    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int numberInput = Integer.parseInt(tfInput.getText()); 
            sum += numberInput;  
            tfInput.setText("");  
            tfOutput.setText(sum + "");  
        }
    }
}
