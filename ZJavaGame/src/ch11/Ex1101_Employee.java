package ch11;
abstract class Ex1101_Employee
{
  String name;

  public abstract int income();

  public Ex1101_Employee(String n)
  {
    name= n;
  }

  public void getInformation()
  {
    System.out.println("¿Ã∏ß:"+ name +", ø¨∫¿: "+ income());
  }
}

