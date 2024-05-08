package _07_duck;

public class DuckRunner {
public static void main(String[] args) {
	Duck uglyDuckling = new Duck("worms", 0);
	uglyDuckling.quack();
	uglyDuckling.waddle();
	
	Unicorn Annabel = new Unicorn("rainbow", true, 40);
	Annabel.colorful();
	Annabel.beautiful();
}
}
