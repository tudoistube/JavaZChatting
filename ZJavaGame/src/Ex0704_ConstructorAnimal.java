
public class Ex0704_ConstructorAnimal {
	
	  String name;
	  int age;

	  public Ex0704_ConstructorAnimal()
	  {
	    this("동물", 0);
	  }

	  public Ex0704_ConstructorAnimal(String name, int age)
	  {
	    this.name= name;
	    this.age= age;
	  }

	  public void print()
	  {
	    System.out.println("이름: "+ name);
	    System.out.println("나이: "+ age +"세");
	  }
}
