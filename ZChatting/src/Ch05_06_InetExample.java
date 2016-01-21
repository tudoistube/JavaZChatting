import java.io.*;
import java.net.*;//...��Ʈ��ũ ���α׷� �ۼ� ����.
/***
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch05_06_InetExample
���� ȣ��Ʈ �̸� : MSDN-SPECIAL                                                                         
���� IP �ּ� : 192.168.0.4                                                                              
���� ȣ��Ʈ class : C                                                                                   
���� ȣ��Ʈ InetAddress : MSDN-SPECIAL/192.168.0.4                                                      
ȣ��Ʈ �̸� �� IP �ּҸ� �Է��ϼ���.                                                                    
joywins.kr
ȣ��Ʈ�� ã�� �ֽ��ϴ�. joywins.kr....                                                                  
���� ȣ��Ʈ �̸� : joywins.kr                                                                           
���� ȣ��Ʈ IP : 14.63.222.217                                                                          
���� ȣ��Ʈ class : A                                                                                   
���� ȣ��Ʈ InetAddress : joywins.kr/14.63.222.217                                                      
ȣ��Ʈ �̸� �� IP �ּҸ� �Է��ϼ���.                                                                    
^Z
���α׷��� �����մϴ�.                                                                                  

 * @author Administrator
 *
 */
public class Ch05_06_InetExample 
{
	   public static void main(String args[]){
	      String strHostname;
	      BufferedReader br;
	      
	      printLocalAddress(); // ���� ȣ��Ʈ�� �̸� �� IP �ּ� ���
	      
	      br = new BufferedReader(new InputStreamReader(System.in));
	      
	      try{
	         do{
	            System.out.println("ȣ��Ʈ �̸� �� IP �ּҸ� �Է��ϼ���.");
	            if((strHostname = br.readLine())!= null)
	               printRemoteAddress(strHostname); // ���� ȣ��Ʈ�� �ּ� ���
	         }while(strHostname != null);
	         System.out.println("���α׷��� �����մϴ�.");
	      }catch(IOException ex){
	         System.out.println("�Է� ����!");
	      }
	   }
	   static void printLocalAddress(){
	      try{
	         InetAddress inetAddressLocal = InetAddress.getLocalHost();
	         System.out.println("���� ȣ��Ʈ �̸� : "+inetAddressLocal.getHostName());
	         System.out.println("���� IP �ּ� : "+inetAddressLocal.getHostAddress());
	         System.out.println("���� ȣ��Ʈ class : "+ipClass(inetAddressLocal.getAddress()));
	         System.out.println("���� ȣ��Ʈ InetAddress : "+inetAddressLocal.toString());
	         
	      }catch(UnknownHostException ex){
	         System.out.println(ex);
	      }
	   }
	   static void printRemoteAddress (String hostname){
	      try{
	         System.out.println("ȣ��Ʈ�� ã�� �ֽ��ϴ�. " + hostname +"....");
	         InetAddress inetAddressRemote = InetAddress.getByName(hostname);
	         System.out.println("���� ȣ��Ʈ �̸� : "+inetAddressRemote.getHostName());
	         System.out.println("���� ȣ��Ʈ IP : "+inetAddressRemote.getHostAddress());
	         System.out.println("���� ȣ��Ʈ class : "+ipClass(inetAddressRemote.getAddress()));
	         System.out.println("���� ȣ��Ʈ InetAddress : "+inetAddressRemote.toString());
	         
	      }catch(UnknownHostException ex){
	         System.out.println(ex);
	      }
	   }
	   static char ipClass(byte[] ip){
		  /*
		   * http://www.coderanch.com/t/366925/java/java/xFFFF
		   * It's a 16-bit number with all bits set to one. The meaning will be different depending on whether it's a char or a short, because char is unsigned and short is signed. If it's a char it'll be 2^16 - 1. If it's a short it'll be negative because the MSB is 1, so take the two's complement and you get -1. (Invert all the bits and add 1.) If it's assigned to a type wider than 16 bits, it fits and the MSB is still 0, so it's positive (2^16 - 1 again). BTW, 2^16 is 65536 (all good geeks should know powers of two at least through sweet 16.)
jply
			ip����Ʈ �迭�� 4���� IP���� ���� ����(IP�ּ��� ù��° ����Ʈ ���� ip[0]�� �����)�ȴ�.
			ipClass()�� ù��° ���๮�� ����Ʈ �����͸� 4����Ʈ ���������� ��ȯ(���� 3����Ʈ�� ��� 0�̹Ƿ�
			����Ʈ ���� ���� ũ�⿡ �ش��ϴ� ���� ������ ��ȯ��)�ϰ�, ���� ���๮���� ���� ���� �����Ͽ�
			IP�ּҰ� Ŭ���� A, B, C, D, E������ ��ȯ��.
		   */
	      int highByte = 0xff & ip[0];
	      return(highByte<128) ?  'A' :  (highByte<192) ?  'B' :  (highByte<224) ?   'C' : (highByte<240) ? 'D' : 'E';
	   }
	}