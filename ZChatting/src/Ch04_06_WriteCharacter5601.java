import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

public class Ch04_06_WriteCharacter5601 
{
	   public static void main(String args[]) throws IOException {
	      String strText = "성공은 고통스럽지만 행복한 순간의 연속에서 만들어진다.";
	      
	      FileOutputStream fos = new FileOutputStream("example04_06.txt");
	      OutputStreamWriter osw = new OutputStreamWriter(fos, "KSC5601");
	      
	      osw.write(strText, 0, strText.length());
	      osw.flush(); // 버퍼의 내용을 전송한다.
	      osw.close();
	   }
	}
