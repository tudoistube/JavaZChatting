
public class Ex0704_ConstructorAnimal {
	
	  String name;
	  int age;

	  public Ex0704_ConstructorAnimal()
	  {
	    this("����", 0);
	  }

	  public Ex0704_ConstructorAnimal(String name, int age)
	  {
	    this.name= name;
	    this.age= age;
	  }

	  public void print()
	  {
	    System.out.println("�̸�: "+ name);
	    System.out.println("����: "+ age +"��");
	  }
}
