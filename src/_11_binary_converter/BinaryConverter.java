package _11_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {

	public static void main(String[] args) {
		new BinaryConverter().run();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField binaryBar = new JTextField(21);
	JButton convertButton = new JButton("convert");
	JLabel answer = new JLabel();
	
	
	
	void run() {
		// TODO Auto-generated method stub
		frame.add(panel);
		convertButton.addActionListener(this);
		panel.add(binaryBar);
		panel.add(convertButton);
		panel.add(answer);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String input = binaryBar.getText();
		String k = convert(input);
		answer.setText(k);
		frame.pack();
		
	}
	
	String convert(String xyz) {
	    if(xyz.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!xyz.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(xyz, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	    
	}

	
	
	//IF YOU ARE WISE, YOU'LL LISTEN TO ME..TOOOOOOOOT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	                                       
}
