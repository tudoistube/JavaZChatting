import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

public class Ch4_07_ReadCharacter5601 
{
	   public static void main(String args[]) throws IOException {
	      int nBytesRead;
	      char[] ch_arrBuffer = new char[128];
	      
	      FileInputStream fis = new FileInputStream("example04_06.txt");
	      InputStreamReader isr = new InputStreamReader(fis, "KSC5601");
	      
	   // 저장된 문자의 인코딩 방식과 일치해야 한다.
	      while((nBytesRead = isr.read(ch_arrBuffer, 0, ch_arrBuffer.length)) != -1)
	         System.out.println(ch_arrBuffer);
	   }
	}