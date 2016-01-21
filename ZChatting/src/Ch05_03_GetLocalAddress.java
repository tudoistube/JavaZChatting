import java.io.*;
import java.net.*;//...네트워크 프로그램 작성 관련.
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
	    	 //...방화벽으로 가려진 상황 등 몇 가지 경우에 있어서 이 주소는 단순히 루프백
	    	 //...(loopback)주소인 127.0.0.1 이다.
	         InetAddress inetAddress = InetAddress.getLocalHost();
	         System.out.println(inetAddress);
	         
	      }catch(UnknownHostException e){
	         System.out.println("지정된 로컬 호스트를 찾을 수 없습니다.");
	      }
	      
	   }
	   
	}