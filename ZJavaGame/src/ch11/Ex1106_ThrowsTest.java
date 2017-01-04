package ch11;
public class Ex1106_ThrowsTest
{
  //...throws 명령으로 예외발생이 가능하다는 것을 선언함.
  public int divide(int x, int y) throws ArithmeticException
  {
    int result;

    try{
      result= x/y;
    }catch(ArithmeticException e){
      //...프로그래머가 의도적으로 예외를 발생시킬때 throw명령으로 예외를 발생시킴.
      throw(e);
    }

    return result;
  }

  public static void main(String[] args)
  {
    Ex1106_ThrowsTest x= new Ex1106_ThrowsTest();
    
    for(int i=5; i>=0; i--){
      int divide_100= x.divide(100, i);
      System.out.println("100을 "+ i +"로 나누면: "+ divide_100);
    }
  }
}