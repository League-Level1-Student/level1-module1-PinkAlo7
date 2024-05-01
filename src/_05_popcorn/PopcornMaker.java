package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What flavor would like you like your popcorn to have?");
	String time = JOptionPane.showInputDialog("How many minutes would you like your popcorn to cook?");
	int minutes = Integer.parseInt(time);
	Popcorn bag = new Popcorn(flavor);
	Microwave cooker = new Microwave();
	cooker.setTime(minutes);
	cooker.putInMicrowave(bag);
	cooker.startMicrowave();
}
}
