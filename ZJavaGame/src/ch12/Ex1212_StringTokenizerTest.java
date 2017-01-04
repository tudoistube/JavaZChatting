package ch12;
import java.io.*;
import java.util.*;

public class Ex1212_StringTokenizerTest
{
  public static void main(String[] args)
  {
    InputStreamReader isReader= new InputStreamReader(System.in);
    BufferedReader in= new BufferedReader(isReader);

    int myTokens= 0;
    do{
      System.out.print("���ڿ� �Է�: ");

      try{
        String str= in.readLine();
        //...�⺻�����ڴ� ��ĭ�̴�.
        StringTokenizer myST= new StringTokenizer(str);

        myTokens= myST.countTokens();
        System.out.println("��ū��: "+ myTokens);

        while(myST.hasMoreTokens()){
          System.out.println("    "+ myST.nextToken());
        }
      }catch(IOException e){
        System.out.println(e.toString());
      }
      System.out.println();
    }while(myTokens!=0);
  }
}