package ch12;
import java.io.*;

public class Ex1208_PrintWriterTest
{
  public static void main(String[] args)
  {
    PrintWriter out= new PrintWriter(new OutputStreamWriter(System.out));

    out.print("������ ����� ���� �ڹ�!");
    out.flush();
  }
}