import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

public class Ch04_01_WriteCharacter 
{
	   public static void main(String args[]) throws IOException {
	      String text = "�ѱ� ���� �����Դϴ�.";
	      FileWriter fw = new FileWriter("example04_01.txt"); 
	       // ����Ʈ(�����ڵ�) ���ڵ� ����� ����Ͽ� �����Ѵ�.
	      fw.write(text, 0, text.length()); // ���Ͽ� ���ڿ��� �����Ѵ�.
	      fw.flush(); // ������ ������ ����.
	      fw.close();
	   }
	}
