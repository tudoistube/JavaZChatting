import java.io.*;
import java.net.*;//...��Ʈ��ũ ���α׷� �ۼ� ����.
/***
 * �������� �о ȭ�鿡 �����.
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch06_06_ReadSourceFile http://joywins.kr/2Be

<!DOCTYPE html>
<!--2Check::v001::index.jsp::20150124-001::is it necessary to set lang into 'en'?
<html lang="en">
 -->
<html>
<head>

 * @author Administrator
 *
 */
public class Ch06_06_ReadSourceFile 
{
	   public static void main(String args[]){
	      String line;
	      URL u;
	      
	      if(args.length>0){
	         try{

	            u = new URL(args[0]); // args[0]�� URL�̸� ��ü�� ������
	            
	            try{
		        	/*
		        	 * URL��ü�� �����͸� �ۼ����ϴ� �������� �� Ư���� ȣ��Ʈ�� ������ ����Ŵ.
		        	 * openStream() : URL�� ����Ű�� ���� ȣ��Ʈ�� �����ϰ� ����� ȣ��Ʈ�κ���
		        	 * URL�� ������ ������ ������ ���� �� �ִ� InputStream��ü�� ��ȯ�Ͽ� ����ȣ��Ʈ��
		        	 * ���� ������ ������.
		        	 * 
		        	 *  InputStream��ü�� ���� ���� �����ʹ� URL�� ����Ű�� �ִ� ������ ���ó�����.
		        	 *  ��, URL�� �ؽ�Ʈ ������ ����Ű�� ��Ʈ���� ASCII�����͸� ��ȯ�ϰ�
		        	 *  HTML�����̸� ���� HTML�� ��ȯ�ϰ�
		        	 *  �̹��������̸� 2������ �̹��� �����͸� ��ȯ��.
		        	 *  ��ȯ�ϴ� �����Ϳ��� HTML�� �����, �������ݰ� ���õ� ������ ������� ����.
		        	 *  ������ ���븸�� ������.
		        	 */	            	
	               InputStream is = u.openStream(); // �Է� ��Ʈ�� ��ü ����
	               Reader isr = new InputStreamReader(is);
	               BufferedReader br = new BufferedReader(isr);
	               
	               while((line=br.readLine()) != null){ // URL�� ������ �� �پ� �д´�.
	                  System.out.println(line);
	               }
	            }catch(Exception e){
	               System.out.println(e);
	            }
	         }catch(MalformedURLException e){
	            System.err.println(args[0]+"�� URL ������ �ƴմϴ�.");
	         }
	      }
	   }
	}