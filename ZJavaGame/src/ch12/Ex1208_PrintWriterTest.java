package ch12;
import java.io.*;

public class Ex1208_PrintWriterTest
{
  public static void main(String[] args)
  {
    PrintWriter out= new PrintWriter(new OutputStreamWriter(System.out));

    out.print("게임을 만들며 배우는 자바!");
    out.flush();
  }
}