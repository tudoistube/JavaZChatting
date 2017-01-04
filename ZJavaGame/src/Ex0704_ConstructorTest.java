
public class Ex0704_ConstructorTest {
	
	  //Ex0704_ConstructorBoy
	  //Ex0704_ConstructorBoy
	
	public static void main(String[] args)
	{
		Ex0704_ConstructorAnimal animal = new Ex0704_ConstructorAnimal();
		animal.print();
		
		Ex0704_ConstructorHuman human = new Ex0704_ConstructorHuman();
		human.print();
		
		Ex0704_ConstructorBoy boy = new Ex0704_ConstructorBoy();
		boy.print();
		
		System.out.println();
		
		Ex0704_ConstructorAnimal tiger = new Ex0704_ConstructorAnimal("Tiger", 8);
		tiger.print();
		
		Ex0704_ConstructorHuman mary = new Ex0704_ConstructorHuman("Mary", 32);
		mary.print();
		
		Ex0704_ConstructorBoy kid = new Ex0704_ConstructorBoy("Tom", 21);
		kid.print();
	}
}
