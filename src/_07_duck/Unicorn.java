package _07_duck;

public class Unicorn {
	
	
	String color;
	boolean doesSheFly;
	int numberOfColors;
Unicorn(String color, boolean doesSheFly, int howManyColors) {
		this.numberOfColors = howManyColors;
		this.doesSheFly = doesSheFly;
		this.color = color;
	}
void beautiful() {
	System.out.println("She's outstanding, she has a glaring horn,  and the best flyer!");
}
void colorful() {
	System.out.println("She has various colors of hair, pink skin, and a silver horn!");
}
}
