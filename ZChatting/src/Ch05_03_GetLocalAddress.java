import java.io.*;
import java.net.*;//...��Ʈ��ũ ���α׷� �ۼ� ����.
/***
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch05_03_GetLocalAddress
MSDN-SPECIAL/192.168.0.4
 * @author Administrator
 *
 */
public class Ch05_03_GetLocalAddress 
{
	   public static void main(String args[]){
	      try{
	    	 //...��ȭ������ ������ ��Ȳ �� �� ���� ��쿡 �־ �� �ּҴ� �ܼ��� ������
	    	 //...(loopback)�ּ��� 127.0.0.1 �̴�.
	         InetAddress inetAddress = InetAddress.getLocalHost();
	         System.out.println(inetAddress);
	         
	      }catch(UnknownHostException e){
	         System.out.println("������ ���� ȣ��Ʈ�� ã�� �� �����ϴ�.");
	      }
	      
	   }
	   
	}