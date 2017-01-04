package ch12;
import java.io.*;
import java.net.*;

public class Ex1210_ServerSocketTest
{
  public static void main(String[] args)
  {
    try{
      ServerSocket myServerSocket= new ServerSocket(9000);
      System.out.println("Ŭ���̾�Ʈ�� �����ϱ� ��ٸ��� �ֽ��ϴ�.");

      Socket mySocket= myServerSocket.accept();
      System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");

      BufferedReader in= new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
      PrintWriter out= new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()));

      System.out.println("Ŭ���̾�Ʈ�κ��� ���� �޽���: "+ in.readLine());
      String msg="2Do, ������ ����մϴ�.";
      out.println(msg);
      out.flush();
      System.out.println("Ŭ���̾�Ʈ���� ���� �޽���: "+ msg);

      mySocket.close();
    }catch(MalformedURLException e){
      System.out.println(e.toString());
    }catch(IOException e){
      System.out.println(e.toString());
    }
  }
}