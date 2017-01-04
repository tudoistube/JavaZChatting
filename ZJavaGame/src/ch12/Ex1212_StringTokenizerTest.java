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
      System.out.print("문자열 입력: ");

      try{
        String str= in.readLine();
        //...기본구분자는 빈칸이다.
        StringTokenizer myST= new StringTokenizer(str);

        myTokens= myST.countTokens();
        System.out.println("토큰수: "+ myTokens);

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