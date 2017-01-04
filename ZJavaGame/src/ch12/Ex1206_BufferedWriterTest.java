package ch12;
import java.io.*;

public class Ex1206_BufferedWriterTest
{
  public static void main(String[] args)
  {
    BufferedWriter out= new BufferedWriter(new OutputStreamWriter(System.out));

    try{
      out.write("게임을 만들며 배우는 자바!");
      out.flush();
    }catch(IOException e){
      System.out.println(e.toString());
    }
  }
}