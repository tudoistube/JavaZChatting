import java.net.*;//...네트워크 프로그램 작성 관련.
/***
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch05_01_GetIPAddress joywins.kr
joywins.kr/14.63.222.217
 * @author Administrator
 *
 */

public class Ch05_01_GetIPAddress 
{
	   public static void main(String args[]){
	      if(args.length != 1){
	         System.out.println("호스트 이름을 입력하세요!");
	         return;
	      }
	      
	      try{
	    	 //...DNS서버에 접속하여 지정된 호스트에 대한 호스트 이름 및 IP주소를 반환함.
	         InetAddress inetAddress = InetAddress.getByName(args[0]);
	         System.out.println(inetAddress);
	         
	      }catch(UnknownHostException e){
	         System.out.println("지정된 호스트를 찾을 수 없습니다.");
	      }
	      
	   }
	}