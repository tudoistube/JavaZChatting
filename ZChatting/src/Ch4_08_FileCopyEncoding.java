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
	         System.out.println("입력인코딩 입력파일이름 출력인코딩 출력파일이름을 지정하세요!!");
	         return;
	      }
	      FileInputStream fis = new FileInputStream(args[1]);//...입력파일이름.
	      InputStreamReader isr = new InputStreamReader(fis, args[0]);//...입력인코딩.
	      
	      FileOutputStream fos = new FileOutputStream(args[3]);//...출력파일이름.
	      OutputStreamWriter osw = new OutputStreamWriter(fos, args[2]);//...출력인코딩.
	      
	      while((nRead = isr.read(ch_arrBuffer)) > -1)
	         osw.write(ch_arrBuffer, 0, nRead);
	      
	      osw.close();
	      isr.close();
	   }
	}
