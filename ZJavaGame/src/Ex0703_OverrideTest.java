
public class Ex0703_OverrideTest {
	
	public static void main(String[] args) {
		
		Ex0703_OverrideDog yourDog = new Ex0703_OverrideDog("Benji", 3);
		yourDog.bark();
		yourDog.bite("Postman");
		
		Ex0703_OverrideSnoopy myDog = new Ex0703_OverrideSnoopy();
		myDog.bark();
		myDog.bite("Nancy", 9);
		
		System.out.println("Hi World!");
		
	}
	
}
