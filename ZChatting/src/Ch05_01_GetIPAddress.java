import java.net.*;//...��Ʈ��ũ ���α׷� �ۼ� ����.
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
	         System.out.println("ȣ��Ʈ �̸��� �Է��ϼ���!");
	         return;
	      }
	      
	      try{
	    	 //...DNS������ �����Ͽ� ������ ȣ��Ʈ�� ���� ȣ��Ʈ �̸� �� IP�ּҸ� ��ȯ��.
	         InetAddress inetAddress = InetAddress.getByName(args[0]);
	         System.out.println(inetAddress);
	         
	      }catch(UnknownHostException e){
	         System.out.println("������ ȣ��Ʈ�� ã�� �� �����ϴ�.");
	      }
	      
	   }
	}