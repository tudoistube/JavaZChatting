
public class Ex0703_OverrideDog {
	
	String dog_name;
	int		 dog_age;

	public Ex0703_OverrideDog(String name, int age)
	{
		dog_name = name;
		dog_age	   = age;
	}

	public void bite()
	{
		System.out.println(dog_name + "�� ���� �ʾƿ䤻��!");
	}

	public void bite(String name)
	{
		System.out.println(dog_name + "�� " + name + "�� �������� �ؿ䤻��!");
	}

	public void bark() 
	{
		System.out.println("�۸�");
	}	

}
