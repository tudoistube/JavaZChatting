package ch12;
import java.io.*;
import java.net.*;

public class Ex1210_ServerSocketTest
{
  public static void main(String[] args)
  {
    try{
      ServerSocket myServerSocket= new ServerSocket(9000);
      System.out.println("클라이언트가 접속하길 기다리고 있습니다.");

      Socket mySocket= myServerSocket.accept();
      System.out.println("클라이언트가 접속했습니다.");

      BufferedReader in= new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
      PrintWriter out= new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()));

      System.out.println("클라이언트로부터 받은 메시지: "+ in.readLine());
      String msg="2Do, 접속을 허락합니다.";
      out.println(msg);
      out.flush();
      System.out.println("클라이언트에게 보낸 메시지: "+ msg);

      mySocket.close();
    }catch(MalformedURLException e){
      System.out.println(e.toString());
    }catch(IOException e){
      System.out.println(e.toString());
    }
  }
}