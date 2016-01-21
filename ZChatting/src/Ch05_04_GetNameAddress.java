import java.io.*;
import java.net.*;//...네트워크 프로그램 작성 관련.
/***
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch05_04_GetNameAddress
호스트 이름 또는 IP 주소를 입력하세요.                                                                  
www.naver.com
호스트 이름은 www.naver.com                                                                             
IP 주소는 125.209.222.141                                                                               
로컬 호스트 이름은 MSDN-SPECIAL                                                                         
로컬 IP 주소는 192.168.0.4
 * @author Administrator
 *
 */
public class Ch05_04_GetNameAddress 
{
	   public static void main(String args[]){
	      String strHostname;
	      BufferedReader br;
	      
	      br = new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("호스트 이름 또는 IP 주소를 입력하세요.");
	      
	      try{
	    	// 키보드로부터 입력여부 체크함.
	         if((strHostname = br.readLine()) != null)
	         { 
	            InetAddress inetAddressRemote = InetAddress.getByName(strHostname);
	            System.out.println("호스트 이름은 "+inetAddressRemote.getHostName());
	            System.out.println("IP 주소는 "+inetAddressRemote.getHostAddress());
	         }
	         
	         InetAddress inetAddressLocal = InetAddress.getLocalHost();
	         System.out.println("로컬 호스트 이름은 "+inetAddressLocal.getHostName());
	         System.out.println("로컬 IP 주소는 "+inetAddressLocal.getHostAddress());
	         
	      }catch(UnknownHostException e){
	         System.out.println(e);
	      }catch(IOException e){
	         System.out.println(e);
	      }
	      
	   }
	   
	}