import java.io.*;
import java.net.*;//...네트워크 프로그램 작성 관련.

public class Ch06_04_ProtocolTester 
{
	   public static void main(String args[]){
	      String strHost = "www.ssc.ac.kr";
	      String strFile = "/root/";
	      String[] str_arrProtocols = {"http", "https", "ftp", "mailto", "telnet", "file", "ldap", 
	    		  											"gopher", "jdbc", "rmi", "jndi", "jar", "doc", "netdoc", 
	    		  											"nfs", "verbatim", "finger", "daytime", "systemresource"};
	      
	      for(int i=0; i<str_arrProtocols.length; i++){
	         try{
	        	//...리스트에서 보여준 프로토콜 중 호스트가 사용하는 운영체제와 JVM버전에 따라
	        	//...지원하는 프로토콜 및 지원하지 않는 프로토콜을 보여줌.
	            URL u = new URL(str_arrProtocols[i], strHost, strFile);
	            System.out.println(strHost+"는 "+str_arrProtocols[i]+" 프로토콜를 지원한다.");
	            
	         }catch(MalformedURLException e){
	            System.out.println(strHost+"는 "+str_arrProtocols[i]+" 프로토콜를 지원하지 않는다.");
	         }
	      }
	   }
	} 