package ch11;
public class Ex1105_ExceptionTest
{
  public static void main(String[] args)
  {
    String language[]= {"C언어", "C++언어", "자바"};

    int i= 1;
    while(i<4){
      System.out.println(language[i]);
      i++;
    }
  }
}