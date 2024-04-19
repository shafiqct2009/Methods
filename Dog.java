package OOP.Encapsulation;

public class Dog extends Animal{

	public static void main(String[] args) {
	
		Dog myDog = new Dog();
		
		myDog.animalType = "Dog";
		
		System.out.println ("The animal type is: "+myDog.animalType);
		myDog.eat();
		
	}

}
