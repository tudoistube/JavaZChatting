import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

public class Ch04_04_BufferedWriteCharacter 
{
	   public static void main(String args[]) throws IOException {
	      String strText = "�� ������ BufferedWriter Ŭ������ �̿��ؼ� ������ �����Դϴ�.";
	      
	      FileWriter fw = new FileWriter("example04_04.txt");
	      // bw�� fw�� ����ȴ�.
	      BufferedWriter bw = new BufferedWriter(fw);
	      
	      // ����Ʈ(�����ڵ�) ���ڵ� ����� ����Ͽ� �����Ѵ�.
	      //...����Ʈ�� 8192���� ���ڸ� ������.
	      bw.write(strText, 0, strText.length()); // ���Ͽ� ���ڿ��� �����Ѵ�.
	      
	       // bw.write(text); �� �̿��ص� ��.
	      bw.flush(); // ������ ������ ����.
	      bw.close();
	   }
	}
