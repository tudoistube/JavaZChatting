import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

public class Ch04_06_WriteCharacter5601 
{
	   public static void main(String args[]) throws IOException {
	      String strText = "������ ���뽺������ �ູ�� ������ ���ӿ��� ���������.";
	      
	      FileOutputStream fos = new FileOutputStream("example04_06.txt");
	      OutputStreamWriter osw = new OutputStreamWriter(fos, "KSC5601");
	      
	      osw.write(strText, 0, strText.length());
	      osw.flush(); // ������ ������ �����Ѵ�.
	      osw.close();
	   }
	}
