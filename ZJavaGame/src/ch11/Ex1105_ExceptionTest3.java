package ch11;
public class Ex1105_ExceptionTest3
{
  public static void main(String[] args)
  {
    String language[]= {"C���", "C++���", "�ڹ�"};

    int i= 1;
    while(i<4){
      try{
        System.out.println(language[i]);
      }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("�迭�� ÷�ڸ� �ٽ� �����մϴ�.");
        i= -1;
      }finally{
        System.out.println("������ ��µǴ� �κ�");
      }
      i++;
    }
  }
}