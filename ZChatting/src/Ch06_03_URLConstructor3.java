import java.io.*;
import java.net.*;//...네트워크 프로그램 작성 관련.

public class Ch06_03_URLConstructor3 
{
	   public static void main(String args[]){
	      URL u1, u2;
	      
	      try{
	         u1 = new URL("http://www.ssc.ac.kr/index.html");
	         //...같은 폴더에 저장되어 있는 여러 파일들을 처리하는 경우, 파일들의 이름만 바꾸어 가면서
	         //...생성자 메서드를 실행함.
	         u2 = new URL(u1, "haksa.html");
	         
	         System.out.println("u1 객체의 URL은 "+u1);
	         System.out.println("u2 객체의 URL은 "+u2);
	         
	      }catch(MalformedURLException e){
	         System.err.println(e);
	      }
	   }
	}