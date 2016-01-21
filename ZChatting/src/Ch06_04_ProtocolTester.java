import java.io.*;
import java.net.*;//...��Ʈ��ũ ���α׷� �ۼ� ����.

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
	        	//...����Ʈ���� ������ �������� �� ȣ��Ʈ�� ����ϴ� �ü���� JVM������ ����
	        	//...�����ϴ� �������� �� �������� �ʴ� ���������� ������.
	            URL u = new URL(str_arrProtocols[i], strHost, strFile);
	            System.out.println(strHost+"�� "+str_arrProtocols[i]+" �������ݸ� �����Ѵ�.");
	            
	         }catch(MalformedURLException e){
	            System.out.println(strHost+"�� "+str_arrProtocols[i]+" �������ݸ� �������� �ʴ´�.");
	         }
	      }
	   }
	} 