import java.io.*;
import java.net.*;//...��Ʈ��ũ ���α׷� �ۼ� ����.
/***
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch05_04_GetNameAddress
ȣ��Ʈ �̸� �Ǵ� IP �ּҸ� �Է��ϼ���.                                                                  
www.naver.com
ȣ��Ʈ �̸��� www.naver.com                                                                             
IP �ּҴ� 125.209.222.141                                                                               
���� ȣ��Ʈ �̸��� MSDN-SPECIAL                                                                         
���� IP �ּҴ� 192.168.0.4
 * @author Administrator
 *
 */
public class Ch05_04_GetNameAddress 
{
	   public static void main(String args[]){
	      String strHostname;
	      BufferedReader br;
	      
	      br = new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("ȣ��Ʈ �̸� �Ǵ� IP �ּҸ� �Է��ϼ���.");
	      
	      try{
	    	// Ű����κ��� �Է¿��� üũ��.
	         if((strHostname = br.readLine()) != null)
	         { 
	            InetAddress inetAddressRemote = InetAddress.getByName(strHostname);
	            System.out.println("ȣ��Ʈ �̸��� "+inetAddressRemote.getHostName());
	            System.out.println("IP �ּҴ� "+inetAddressRemote.getHostAddress());
	         }
	         
	         InetAddress inetAddressLocal = InetAddress.getLocalHost();
	         System.out.println("���� ȣ��Ʈ �̸��� "+inetAddressLocal.getHostName());
	         System.out.println("���� IP �ּҴ� "+inetAddressLocal.getHostAddress());
	         
	      }catch(UnknownHostException e){
	         System.out.println(e);
	      }catch(IOException e){
	         System.out.println(e);
	      }
	      
	   }
	   
	}