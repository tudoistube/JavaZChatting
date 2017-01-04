package ch11;
public class Ex1101_WeeklyWorker extends Ex1101_Employee
{
  int pay_per_hour= 2000;
  int work_hour= 8;
  int work_week= 1;

  public Ex1101_WeeklyWorker(String name)
  {
    super(name);
  }

  public int income()
  {
    return (work_hour * pay_per_hour) * (work_week * 5);
  }
}