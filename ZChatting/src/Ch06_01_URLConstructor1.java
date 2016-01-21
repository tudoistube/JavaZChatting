import java.io.*;
import java.net.*;//...네트워크 프로그램 작성 관련.

public class Ch06_01_URLConstructor1 
{
	   public static void main(String args[]){
	      URL webURL, ftpURL, ldapURL;
	      
	      try{
	         webURL = new URL("http://www.ssc.ac.kr/index.html");
	         System.out.println(webURL);
	         ftpURL = new URL("ftp://www.ssc.ac.kr/public/");
	         System.out.println(ftpURL);
	         ldapURL = new URL("ldap://www.ssc.ac.kr/"); // 예외를 발생시킨다.
	         System.out.println(ldapURL);
	         
	      }catch(MalformedURLException e){
	         System.out.println("지정된 URL를 찾을 수 없습니다.");
	      }
	   }
	}