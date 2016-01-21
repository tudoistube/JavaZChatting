import java.io.*;
import java.net.*;//...네트워크 프로그램 작성 관련.
/***
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch05_06_InetExample
로컬 호스트 이름 : MSDN-SPECIAL                                                                         
로컬 IP 주소 : 192.168.0.4                                                                              
로컬 호스트 class : C                                                                                   
로컬 호스트 InetAddress : MSDN-SPECIAL/192.168.0.4                                                      
호스트 이름 및 IP 주소를 입력하세요.                                                                    
joywins.kr
호스트를 찾고 있습니다. joywins.kr....                                                                  
원격 호스트 이름 : joywins.kr                                                                           
원격 호스트 IP : 14.63.222.217                                                                          
원격 호스트 class : A                                                                                   
원격 호스트 InetAddress : joywins.kr/14.63.222.217                                                      
호스트 이름 및 IP 주소를 입력하세요.                                                                    
^Z
프로그램을 종료합니다.                                                                                  

 * @author Administrator
 *
 */
public class Ch05_06_InetExample 
{
	   public static void main(String args[]){
	      String strHostname;
	      BufferedReader br;
	      
	      printLocalAddress(); // 로컬 호스트의 이름 및 IP 주소 출력
	      
	      br = new BufferedReader(new InputStreamReader(System.in));
	      
	      try{
	         do{
	            System.out.println("호스트 이름 및 IP 주소를 입력하세요.");
	            if((strHostname = br.readLine())!= null)
	               printRemoteAddress(strHostname); // 원격 호스트의 주소 출력
	         }while(strHostname != null);
	         System.out.println("프로그램을 종료합니다.");
	      }catch(IOException ex){
	         System.out.println("입력 에러!");
	      }
	   }
	   static void printLocalAddress(){
	      try{
	         InetAddress inetAddressLocal = InetAddress.getLocalHost();
	         System.out.println("로컬 호스트 이름 : "+inetAddressLocal.getHostName());
	         System.out.println("로컬 IP 주소 : "+inetAddressLocal.getHostAddress());
	         System.out.println("로컬 호스트 class : "+ipClass(inetAddressLocal.getAddress()));
	         System.out.println("로컬 호스트 InetAddress : "+inetAddressLocal.toString());
	         
	      }catch(UnknownHostException ex){
	         System.out.println(ex);
	      }
	   }
	   static void printRemoteAddress (String hostname){
	      try{
	         System.out.println("호스트를 찾고 있습니다. " + hostname +"....");
	         InetAddress inetAddressRemote = InetAddress.getByName(hostname);
	         System.out.println("원격 호스트 이름 : "+inetAddressRemote.getHostName());
	         System.out.println("원격 호스트 IP : "+inetAddressRemote.getHostAddress());
	         System.out.println("원격 호스트 class : "+ipClass(inetAddressRemote.getAddress()));
	         System.out.println("원격 호스트 InetAddress : "+inetAddressRemote.toString());
	         
	      }catch(UnknownHostException ex){
	         System.out.println(ex);
	      }
	   }
	   static char ipClass(byte[] ip){
		  /*
		   * http://www.coderanch.com/t/366925/java/java/xFFFF
		   * It's a 16-bit number with all bits set to one. The meaning will be different depending on whether it's a char or a short, because char is unsigned and short is signed. If it's a char it'll be 2^16 - 1. If it's a short it'll be negative because the MSB is 1, so take the two's complement and you get -1. (Invert all the bits and add 1.) If it's assigned to a type wider than 16 bits, it fits and the MSB is still 0, so it's positive (2^16 - 1 again). BTW, 2^16 is 65536 (all good geeks should know powers of two at least through sweet 16.)
jply
			ip바이트 배열은 4개의 IP정수 값이 저장(IP주소의 첫번째 바이트 값이 ip[0]에 저장됨)된다.
			ipClass()의 첫번째 수행문은 바이트 데이터를 4바이트 정수값으로 변환(앞의 3바이트가 모두 0이므로
			바이트 음수 값도 크기에 해당하는 양의 정수로 변환됨)하고, 다음 수행문에서 정수 값을 조사하여
			IP주소가 클래스 A, B, C, D, E인지를 반환함.
		   */
	      int highByte = 0xff & ip[0];
	      return(highByte<128) ?  'A' :  (highByte<192) ?  'B' :  (highByte<224) ?   'C' : (highByte<240) ? 'D' : 'E';
	   }
	}