
public class Ex0701_InheritManager extends Ex0701_InheritEmployee{

	String department;

	public Ex0701_InheritManager (String n, int s, String d)	//������.
	{
		super(n, s);
		name = n;
		this.department = d;
	}

	public void getInformation()
	{
		System.out.println("�̸� : " + name + ", ���� : " + salary + ", �μ� : " + department);
	}	
	
}
