import java.io.*;
import java.net.*;//...��Ʈ��ũ ���α׷� �ۼ� ����.
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
	         System.out.println("ȣ��Ʈ �̸��� �Է��ϼ���!");
	         return;
	      }
	      
	      try{
	    	 //...�ϳ��� ȣ��Ʈ �̸��� ���� ���� ���� InetAddress �迭 ��ü�� ��ȯ��.
	         InetAddress[] arrInetAddress = InetAddress.getAllByName(args[0]);
	         
	         for(int i=0; i<arrInetAddress.length; i++) 
	            System.out.println(arrInetAddress[i]);
	         
	      }catch(UnknownHostException e){
	         System.out.println("������ ȣ��Ʈ�� ã�� �� �����ϴ�.");
	      }
	   }
	}