package ch12;
import java.io.*;
import java.net.*;

public class Ex1210_SocketTest
{
  public static void main(String[] args)
  {
    try{
      Socket mySocket= new Socket("192.168.1.187", 9000);
      System.out.println("서버에 접속했습니다.");

      BufferedReader in= new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
      PrintWriter out= new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()));

      String msg="2Be, 접속을 허락해주세요.";
      System.out.println("서버에게 보낸 메시지: "+ msg);
      out.println(msg);
      out.flush();
      System.out.println("서버로부터 받은 메시지: "+ in.readLine());

      mySocket.close();
    }catch(MalformedURLException e){
      System.out.println(e.toString());
    }catch(IOException e){
      System.out.println(e.toString());
    }
  }
}