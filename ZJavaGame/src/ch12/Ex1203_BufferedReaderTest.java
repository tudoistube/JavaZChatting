package ch12;
import java.io.*;

public class Ex1203_BufferedReaderTest
{
  public static void main(String[] args)
  {
    InputStreamReader isReader= new InputStreamReader(System.in);
    BufferedReader in= new BufferedReader(isReader);

    try{
      System.out.println("�۾��� �Է��Ͻø� ���� �մϴ�.");

      String str= in.readLine();
      System.out.print(str);
    }catch(IOException e){
      System.out.println(e.toString());
    }
  }
}