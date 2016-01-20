import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

/***
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch04_05_ReadByLine example04_04.txt
BufferedWriter 클래스를 이용해서 저장한 파일입니다.   
 * @author Administrator
 *
 */
public class Ch04_05_ReadByLine 
{
	   public static void main(String args[]){
	      String strData;
	      
	      if(args.length != 1)
	         System.err.println("입력 파일을 지정하십시오.");
	      
	      try{
	    	// 명령어 라인에서 읽음
	         FileReader fr = new FileReader(args[0]); 
	         BufferedReader br = new BufferedReader(fr);
	         
	      // 한 줄씩 읽는다.
	         while((strData=br.readLine()) != null){ 
	            System.out.println(strData);
	         }
	         
	      }catch(IOException e){
	         System.err.println(e);
	      }
	   }
	}