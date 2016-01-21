import java.io.*;
import java.net.*;//...네트워크 프로그램 작성 관련.

public class Ch06_02_URLConstructor2 
{
	   public static void main(String args[]){
	      URL webURL, ftpURL, ldapURL;
	      try{
	    	 //...포트번호는 자동적으로 -1이 할당되고, 슬래쉬(/)로 시작해야 하고, 필요하면
	    	 //...파일 내 참조위치 및 질의어가 사용될 수 있다.
	         webURL = new URL("http", "www.ssc.ac.kr", "/index.html");
	         System.out.println(webURL);
	         ftpURL = new URL("ftp", "www.ssc.ac.kr", "/public");
	         System.out.println(ftpURL);
	         ldapURL = new URL("ldap", "www.ssc.ac.kr", "/");
	         System.out.println(ldapURL);
	         
	      }catch(MalformedURLException e){
	         System.out.println("지정된 URL를 찾을 수 없습니다.");
	      }
	   }
	}