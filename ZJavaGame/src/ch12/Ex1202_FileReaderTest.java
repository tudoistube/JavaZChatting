package ch12;
import java.io.*;

public class Ex1202_FileReaderTest
{
  public static void main(String[] args)
  {
    int i;

    try{
      //FileReader in= new FileReader("FileReaderTest.java");
      String file = "D:\\2DoIs2Be\\WorkSpace\\ZJava_Game\\JavaGame\\src\\ch12\\Ex1202_FileReaderTest.java";
      FileReader in= new FileReader(file);

      while((i=in.read())!=-1){ // 파일 끝까지 반복
        char myChar= (char)i;
        System.out.print(myChar);
      }
    }catch(IOException e){
      System.out.println(e.toString());
    }
  }
}