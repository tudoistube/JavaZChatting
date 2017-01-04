package ch11;
public class Ex1107_ExceptionTest
{
  public static void a(int i)
  {
    try{
      b(i);
     //...사용자정의 Exception.
    }catch(Ex1107_MyException e){
      if(e instanceof Ex1107_MySubException){
        System.out.print("MySubException: ");
      }else{
        System.out.print("MyException: ");
      }
      System.out.println(e.getMessage());
      System.out.println("위치 - 1");
    }
  }

  public static void b(int i) throws Ex1107_MyException
  {
    int result;
    try{
      System.out.println("i = "+ i);
      result= c(i);
      System.out.println("c(i) = "+ result);
    }catch(Ex1107_MyOtherException e){
      System.out.println("MyOtherException: "+ e.getMessage());
      System.out.println("위치 - 2");
    }finally{
      System.out.print("\n");
    }
  }

  public static int c(int i) throws Ex1107_MyException, Ex1107_MyOtherException
  {
    switch(i){
      case  0: throw new Ex1107_MyException("너무 작은 값이 입력되었습니다.");
      case  1: throw new Ex1107_MySubException("입력된 값이 너무 작습니다.");
      case 99: throw new Ex1107_MyOtherException("너무 큰 값이 입력되었습니다.");
      default: return i*i;
    }
  }

  public static void main(String[] args)
  {
    int i;

    try{
      i= Integer.valueOf(args[0]).intValue();
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("인수가 필요합니다.");
      System.out.println("(예) ExceptionTest 4");
      return;
    }catch(NumberFormatException e){
      System.out.println("인수가 정수이어야만 합니다.");
      System.out.println("(예) ExceptionTest 4");
      return;
    }finally{
      System.out.println("언제나 출력되는 부분");
    }

    //a(i);
    a(0);
  }
}