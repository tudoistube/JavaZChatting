package ch11;
public class Ex1101_MonthlyWorker extends Ex1101_Employee
{
  int pay_per_hour= 2000;
  int work_hour= 8;
  int work_month= 1;

  public Ex1101_MonthlyWorker(String name)
  {
    super(name);
  }

  public int income()
  {
    return (work_hour * pay_per_hour) * (work_month * 25);
  }
}