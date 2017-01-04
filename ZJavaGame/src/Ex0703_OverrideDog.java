
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
		System.out.println(dog_name + "는 물지 않아요ㅋㅋ!");
	}

	public void bite(String name)
	{
		System.out.println(dog_name + "는 " + name + "는 물으려고 해요ㅋㅋ!");
	}

	public void bark() 
	{
		System.out.println("멍멍");
	}	

}
