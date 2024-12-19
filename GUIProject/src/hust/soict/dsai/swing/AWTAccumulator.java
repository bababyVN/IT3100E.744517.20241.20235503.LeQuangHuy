package hust.soict.dsai.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame {
    private TextField tfInput; 
    private TextField tfOutput; 
    private int sum = 0; // Initialize sum to 0
    
    public AWTAccumulator() {
        setLayout(new GridLayout(2, 2)); 

        add(new Label("Enter an integer:"));
        
        tfInput = new TextField(10); 
        add(tfInput); 
        tfInput.addActionListener(new TFInputListener()); 

        add(new Label("The Accumulated Sum is:")); 
        
        tfOutput = new TextField(10); 
        tfOutput.setEditable(false); 
        add(tfOutput); 

        setTitle("AWT Accumulator"); 
        setSize(350, 120); 
        setVisible(true); 
    }

    public static void main(String[] args) {
        new AWTAccumulator(); 
    }

    class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int inputNumber = Integer.parseInt(tfInput.getText()); 
            sum += inputNumber; 
            tfInput.setText(""); 
            tfOutput.setText("" + sum); 
        }
    }
}