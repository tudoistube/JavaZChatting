package ch11;
public class Ex1101_AbstractTest
{
  public static void main(String[] args)
  {
	//...getInformation() �޼���� ��� EmployeeŬ������ ����Ǿ� ������,
	//...��ӹ޴� ����Ŭ�������� �߻�޼����� income() �޼��带 ��� �ٸ���
	//...�����߱� ������ ��� �ٸ� ����� �����.
    Ex1101_HourlyWorker employee1= new Ex1101_HourlyWorker("����");
    employee1.getInformation();

    Ex1101_WeeklyWorker employee2= new Ex1101_WeeklyWorker("������");
    employee2.getInformation();

    Ex1101_MonthlyWorker employee3= new Ex1101_MonthlyWorker("������");
    employee3.getInformation();  
  }
}