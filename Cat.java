package OOP.Encapsulation;

/**
 * Hello world!
 *
 */
	public class Cat extends Animal
	
	{
    public static void main( String[] args )
    {
    	Cat myCat = new Cat ();
    	myCat.animalType = "Cat";
    	   	System.out.println ("The animal type is: "+ myCat.animalType);
       myCat.eat ();
       
}	   public void eat () {
    	   System.out.println ("My Cat eats Fish");
       }
    
 }