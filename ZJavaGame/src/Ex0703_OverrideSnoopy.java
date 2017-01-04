
public class Ex0703_OverrideSnoopy extends Ex0703_OverrideDog {

	public Ex0703_OverrideSnoopy()
	{
		super("Snoopy", 3);
	}

	public void bite(String name, int age)
	{
		System.out.println(dog_name + "가 문 " + name + " 는 " + age + " 살 입니다.(메소드 오버로딩)");
	}

	public void bark() 
	{
		System.out.println("안녕하세요, " + dog_name + " 입니다.(메소드 오버라이딩)");
	}	

}
