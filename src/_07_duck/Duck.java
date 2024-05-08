package _07_duck;

public class Duck {
int numberOfFriends;
String favoriteFood;

Duck(String favoriteFood, int numberOfFriends) {
    this.favoriteFood = favoriteFood;
    this.numberOfFriends = numberOfFriends;
}

void quack() {
	System.out.println("QUACK! QUACK! QUACK");
}
void waddle() {
	System.out.println("I CAN'T WALK STRAIGHT!");
	
}


}
