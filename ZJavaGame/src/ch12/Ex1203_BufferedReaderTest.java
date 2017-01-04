package ch12;
import java.io.*;

public class Ex1203_BufferedReaderTest
{
  public static void main(String[] args)
  {
    InputStreamReader isReader= new InputStreamReader(System.in);
    BufferedReader in= new BufferedReader(isReader);

    try{
      System.out.println("글씨를 입력하시면 따라 합니다.");

      String str= in.readLine();
      System.out.print(str);
    }catch(IOException e){
      System.out.println(e.toString());
    }
  }
}