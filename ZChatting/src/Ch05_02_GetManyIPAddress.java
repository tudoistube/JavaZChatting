import java.io.*;
import java.net.*;//...네트워크 프로그램 작성 관련.
/***
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch05_02_GetManyIPAddress www.naver.com
www.naver.com/202.179.177.22
www.naver.com/125.209.222.141
 * @author Administrator
 *
 */
public class Ch05_02_GetManyIPAddress 
{
	   public static void main(String args[]){
	      if(args.length != 1){
	         System.out.println("호스트 이름을 입력하세요!");
	         return;
	      }
	      
	      try{
	    	 //...하나의 호스트 이름에 대해 여러 개의 InetAddress 배열 객체를 반환함.
	         InetAddress[] arrInetAddress = InetAddress.getAllByName(args[0]);
	         
	         for(int i=0; i<arrInetAddress.length; i++) 
	            System.out.println(arrInetAddress[i]);
	         
	      }catch(UnknownHostException e){
	         System.out.println("지정된 호스트를 찾을 수 없습니다.");
	      }
	   }
	}