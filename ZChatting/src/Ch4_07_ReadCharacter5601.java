import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

public class Ch4_07_ReadCharacter5601 
{
	   public static void main(String args[]) throws IOException {
	      int nBytesRead;
	      char[] ch_arrBuffer = new char[128];
	      
	      FileInputStream fis = new FileInputStream("example04_06.txt");
	      InputStreamReader isr = new InputStreamReader(fis, "KSC5601");
	      
	   // ����� ������ ���ڵ� ��İ� ��ġ�ؾ� �Ѵ�.
	      while((nBytesRead = isr.read(ch_arrBuffer, 0, ch_arrBuffer.length)) != -1)
	         System.out.println(ch_arrBuffer);
	   }
	}