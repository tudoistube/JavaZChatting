package ch08;

public class Ex0801_IF_HeightTest implements Ex0801_IF_Height
{
  private double cm= 0;

  public Ex0801_IF_HeightTest(double cm)
  {
    this.cm= cm;
  }

  public double getInch()
  {
    return cm/INCH;
  }

  public double getCM()
  {
    return cm;
  }

  public double getMeter()
  {
    return cm/100;
  }

  public static void main(String[] args)
  {
    Ex0801_IF_HeightTest myHeight= new Ex0801_IF_HeightTest(183);

    System.out.println(myHeight.getCM() +" cm");
    System.out.println(myHeight.getInch() +" inch");
    System.out.println(myHeight.getMeter() +" meter");
  }
}