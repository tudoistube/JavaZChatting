package ch11;
public class Ex1101_HourlyWorker extends Ex1101_Employee
{
  int pay_per_hour= 2000;
  int work_hour= 8;

  public Ex1101_HourlyWorker(String name)
  {
    super(name);
  }

  public int income()
  {
    return work_hour * pay_per_hour;
  }
}