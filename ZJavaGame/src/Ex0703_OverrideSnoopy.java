
public class Ex0703_OverrideSnoopy extends Ex0703_OverrideDog {

	public Ex0703_OverrideSnoopy()
	{
		super("Snoopy", 3);
	}

	public void bite(String name, int age)
	{
		System.out.println(dog_name + "�� �� " + name + " �� " + age + " �� �Դϴ�.(�޼ҵ� �����ε�)");
	}

	public void bark() 
	{
		System.out.println("�ȳ��ϼ���, " + dog_name + " �Դϴ�.(�޼ҵ� �������̵�)");
	}	

}
