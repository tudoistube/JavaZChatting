import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

/***
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch04_05_ReadByLine example04_04.txt
BufferedWriter Ŭ������ �̿��ؼ� ������ �����Դϴ�.   
 * @author Administrator
 *
 */
public class Ch04_05_ReadByLine 
{
	   public static void main(String args[]){
	      String strData;
	      
	      if(args.length != 1)
	         System.err.println("�Է� ������ �����Ͻʽÿ�.");
	      
	      try{
	    	// ��ɾ� ���ο��� ����
	         FileReader fr = new FileReader(args[0]); 
	         BufferedReader br = new BufferedReader(fr);
	         
	      // �� �پ� �д´�.
	         while((strData=br.readLine()) != null){ 
	            System.out.println(strData);
	         }
	         
	      }catch(IOException e){
	         System.err.println(e);
	      }
	   }
	}