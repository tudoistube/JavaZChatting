package ch12;
import java.io.*;

public class Ex1204_OutputStreamWriterTest
{
  public static void main(String[] args)
  {
    OutputStreamWriter out= new OutputStreamWriter(System.out);

    try{
      out.write("�������� ���� �ڹ�!");
      out.flush();
    }catch(IOException e){
      System.out.println(e.toString());
    }
  }
}