package ch11;
public class Ex1106_ThrowsTest
{
  //...throws ������� ���ܹ߻��� �����ϴٴ� ���� ������.
  public int divide(int x, int y) throws ArithmeticException
  {
    int result;

    try{
      result= x/y;
    }catch(ArithmeticException e){
      //...���α׷��Ӱ� �ǵ������� ���ܸ� �߻���ų�� throw������� ���ܸ� �߻���Ŵ.
      throw(e);
    }

    return result;
  }

  public static void main(String[] args)
  {
    Ex1106_ThrowsTest x= new Ex1106_ThrowsTest();
    
    for(int i=5; i>=0; i--){
      int divide_100= x.divide(100, i);
      System.out.println("100�� "+ i +"�� ������: "+ divide_100);
    }
  }
}