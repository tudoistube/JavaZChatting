package ch11;
public class Ex1107_ExceptionTest
{
  public static void a(int i)
  {
    try{
      b(i);
     //...��������� Exception.
    }catch(Ex1107_MyException e){
      if(e instanceof Ex1107_MySubException){
        System.out.print("MySubException: ");
      }else{
        System.out.print("MyException: ");
      }
      System.out.println(e.getMessage());
      System.out.println("��ġ - 1");
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
      System.out.println("��ġ - 2");
    }finally{
      System.out.print("\n");
    }
  }

  public static int c(int i) throws Ex1107_MyException, Ex1107_MyOtherException
  {
    switch(i){
      case  0: throw new Ex1107_MyException("�ʹ� ���� ���� �ԷµǾ����ϴ�.");
      case  1: throw new Ex1107_MySubException("�Էµ� ���� �ʹ� �۽��ϴ�.");
      case 99: throw new Ex1107_MyOtherException("�ʹ� ū ���� �ԷµǾ����ϴ�.");
      default: return i*i;
    }
  }

  public static void main(String[] args)
  {
    int i;

    try{
      i= Integer.valueOf(args[0]).intValue();
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("�μ��� �ʿ��մϴ�.");
      System.out.println("(��) ExceptionTest 4");
      return;
    }catch(NumberFormatException e){
      System.out.println("�μ��� �����̾�߸� �մϴ�.");
      System.out.println("(��) ExceptionTest 4");
      return;
    }finally{
      System.out.println("������ ��µǴ� �κ�");
    }

    //a(i);
    a(0);
  }
}