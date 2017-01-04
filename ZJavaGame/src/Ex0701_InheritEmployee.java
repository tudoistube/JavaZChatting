
public class Ex0701_InheritEmployee {

	String name;
	int salary;

	public Ex0701_InheritEmployee (String n, int s)	//생성자.
	{
		name = n;
		salary = s;
	}

	public void getInformation()
	{
		System.out.println("이름 : " + name + ", 연봉 : " + salary);
	}	
	
}
