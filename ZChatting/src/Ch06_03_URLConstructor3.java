import java.io.*;
import java.net.*;//...��Ʈ��ũ ���α׷� �ۼ� ����.

public class Ch06_03_URLConstructor3 
{
	   public static void main(String args[]){
	      URL u1, u2;
	      
	      try{
	         u1 = new URL("http://www.ssc.ac.kr/index.html");
	         //...���� ������ ����Ǿ� �ִ� ���� ���ϵ��� ó���ϴ� ���, ���ϵ��� �̸��� �ٲپ� ���鼭
	         //...������ �޼��带 ������.
	         u2 = new URL(u1, "haksa.html");
	         
	         System.out.println("u1 ��ü�� URL�� "+u1);
	         System.out.println("u2 ��ü�� URL�� "+u2);
	         
	      }catch(MalformedURLException e){
	         System.err.println(e);
	      }
	   }
	}