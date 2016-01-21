import java.io.*;
import java.net.*;//...��Ʈ��ũ ���α׷� �ۼ� ����.
/***
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch06_05_GetURLFields http://www.ssc.ac.kr:80/inde
x.html
u�� URL�� http://www.ssc.ac.kr:80/index.html                                                            
u�� ���������� http                                                                                     
u�� ȣ��Ʈ�� www.ssc.ac.kr                                                                              
u�� ��Ʈ��ȣ�� 80                                                                                       
u�� �����̸��� /index.html                                                                              
u�� ���� �� ������ġ�� null                                                                             

 * @author Administrator
 *
 */
public class Ch06_05_GetURLFields 
{
	   public static void main(String args[]){
	      for(int i=0; i<args.length; i++){
	         try{
	            URL u = new URL(args[i]);
	            System.out.println("u�� URL�� "+u);
	            System.out.println("u�� ���������� "+u.getProtocol());
	            System.out.println("u�� ȣ��Ʈ�� "+u.getHost());
	            System.out.println("u�� ��Ʈ��ȣ�� "+u.getPort());
	            //...URL�� file �ʵ尪(��� �� �����̸�)�� ���ڿ��� ��ȯ��.
	            //...ȣ��Ʈ �ּ� ������ ù��° ������(/)���� ���� �� ������ġ(����)�� ������ �˸���
	            //...����ȣ(#)������ ���ڿ��� ��ȯ��.
	            //...���� URL�� ��� �� �����̸��� �������� ������ ���ڿ�"\"�� ��ȯ��.
	            System.out.println("u�� �����̸��� "+u.getFile());
	            //...URL�� ref �ʵ��� ��(���� �� ���� ��ġ�� #������ ���ڿ�)�� ���ڿ��� ��ȯ��.
	            //...���� URL�� ���� �� ���� ��ġ �κ��� ���� ���� ������ null�� ��ȯ��.
	            System.out.println("u�� ���� �� ������ġ�� "+u.getRef());
	         }catch(MalformedURLException e){
	            System.err.println(args[i]+"�� URL ������ �ƴմϴ�.");
	         }
	      }
	   }
	}