import java.io.*;
import java.net.*;//...��Ʈ��ũ ���α׷� �ۼ� ����.

public class Ch06_02_URLConstructor2 
{
	   public static void main(String args[]){
	      URL webURL, ftpURL, ldapURL;
	      try{
	    	 //...��Ʈ��ȣ�� �ڵ������� -1�� �Ҵ�ǰ�, ������(/)�� �����ؾ� �ϰ�, �ʿ��ϸ�
	    	 //...���� �� ������ġ �� ���Ǿ ���� �� �ִ�.
	         webURL = new URL("http", "www.ssc.ac.kr", "/index.html");
	         System.out.println(webURL);
	         ftpURL = new URL("ftp", "www.ssc.ac.kr", "/public");
	         System.out.println(ftpURL);
	         ldapURL = new URL("ldap", "www.ssc.ac.kr", "/");
	         System.out.println(ldapURL);
	         
	      }catch(MalformedURLException e){
	         System.out.println("������ URL�� ã�� �� �����ϴ�.");
	      }
	   }
	}