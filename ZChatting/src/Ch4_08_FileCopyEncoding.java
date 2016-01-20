import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

/***
 * 
D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch4_08_FileCopyEncoding KSC5601 example04_06.txt
 KSC5601 example04_08.txt 
 * @author Administrator
 *
 */

public class Ch4_08_FileCopyEncoding 
{
	   public static void main(String args[]) throws IOException{
	      int nRead;	      
	      char[] ch_arrBuffer = new char[16];
	      
	      if(args.length != 4){
	         System.out.println("�Է����ڵ� �Է������̸� ������ڵ� ��������̸��� �����ϼ���!!");
	         return;
	      }
	      FileInputStream fis = new FileInputStream(args[1]);//...�Է������̸�.
	      InputStreamReader isr = new InputStreamReader(fis, args[0]);//...�Է����ڵ�.
	      
	      FileOutputStream fos = new FileOutputStream(args[3]);//...��������̸�.
	      OutputStreamWriter osw = new OutputStreamWriter(fos, args[2]);//...������ڵ�.
	      
	      while((nRead = isr.read(ch_arrBuffer)) > -1)
	         osw.write(ch_arrBuffer, 0, nRead);
	      
	      osw.close();
	      isr.close();
	   }
	}
