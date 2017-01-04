package ch12;
import java.io.*;

public class Ex1205_FileCopyTest
{
  public static void main(String[] args)
  {
    try{
      String file = "D:\\2DoIs2Be\\WorkSpace\\ZJava_Game\\JavaGame\\src\\res\\ch12\\Ex1205_MYDATA-1.txt";
      String fileOut = "D:\\2DoIs2Be\\WorkSpace\\ZJava_Game\\JavaGame\\src\\res\\ch12\\Ex1205_MYDATA-2.txt";
      FileReader in= new FileReader(file);    	
      //FileReader in= new FileReader("MYDATA-1.txt");
      //FileWriter out= new FileWriter("MYDATA-2.txt");
      FileWriter out= new FileWriter(fileOut);

      int ch;
      while((ch= in.read())!=-1){
        out.write(ch);
      }

      in.close();
      out.close();
    }catch(IOException e){
      System.out.println(e.toString());
    }
  }
}