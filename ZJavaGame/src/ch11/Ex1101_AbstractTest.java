package ch11;
public class Ex1101_AbstractTest
{
  public static void main(String[] args)
  {
	//...getInformation() 메서드는 모두 Employee클래스에 선언되어 있지만,
	//...상속받는 서브클래스에서 추상메서드인 income() 메서드를 모두 다르게
	//...구현했기 때문에 모두 다른 결과를 출력함.
    Ex1101_HourlyWorker employee1= new Ex1101_HourlyWorker("김경미");
    employee1.getInformation();

    Ex1101_WeeklyWorker employee2= new Ex1101_WeeklyWorker("유선미");
    employee2.getInformation();

    Ex1101_MonthlyWorker employee3= new Ex1101_MonthlyWorker("옥정희");
    employee3.getInformation();  
  }
}