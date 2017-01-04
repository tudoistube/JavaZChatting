
public class Ex0701_InheritManager extends Ex0701_InheritEmployee{

	String department;

	public Ex0701_InheritManager (String n, int s, String d)	//생성자.
	{
		super(n, s);
		name = n;
		this.department = d;
	}

	public void getInformation()
	{
		System.out.println("이름 : " + name + ", 연봉 : " + salary + ", 부서 : " + department);
	}	
	
}
