package ch12;
import java.io.*;
import java.net.*;

public class Ex1209_URLTest
{
  public static void main(String[] args)
  {
    String str;

    try{
      String url = "http://joywins.kr/2Be/index.jsp";
      URL myURL= new URL(url);

      BufferedReader in= new BufferedReader(new InputStreamReader(myURL.openStream()));

      while((str= in.readLine())!=null){
        System.out.println(str);
      }
    }catch(MalformedURLException e){
      System.out.println(e.toString());
    }catch(IOException e){
      System.out.println(e.toString());
    }
  }
}