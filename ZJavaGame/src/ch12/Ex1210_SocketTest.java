package ch12;
import java.io.*;
import java.net.*;

public class Ex1210_SocketTest
{
  public static void main(String[] args)
  {
    try{
      Socket mySocket= new Socket("192.168.1.187", 9000);
      System.out.println("������ �����߽��ϴ�.");

      BufferedReader in= new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
      PrintWriter out= new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()));

      String msg="2Be, ������ ������ּ���.";
      System.out.println("�������� ���� �޽���: "+ msg);
      out.println(msg);
      out.flush();
      System.out.println("�����κ��� ���� �޽���: "+ in.readLine());

      mySocket.close();
    }catch(MalformedURLException e){
      System.out.println(e.toString());
    }catch(IOException e){
      System.out.println(e.toString());
    }
  }
}