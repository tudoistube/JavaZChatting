import java.io.*; //...IOException, InputStream, OutputStream

public class Ch02_04_ReadCharString 
{
	   static FileInputStream fis;
	   static DataInputStream dis;
	   
	   public static void main(String args[]){
	      char ch;
	      String strData1, strData2;
	      
	      try{
	         fis = new FileInputStream("example02_02.txt");
	         dis = new DataInputStream(fis);
	         
	         ch = dis.readChar(); // writeChar()�� �����޼ҵ�
	         strData1 = dis.readUTF(); // writeUTF()�� �����޼ҵ�
	         strData2 = dis.readUTF();  
	         
	         System.out.println(ch); // ���� 'A'�� ���
	         System.out.println(strData1); // "�ݰ����ϴ�"�� ���
	         System.out.println(strData2); // "�ڹ� ä�� ���α׷��� ����"�� ���
	         
	      }catch(EOFException e){
	         System.out.println(e);
	      }catch(IOException e){ 
	         System.err.println(e);
	      }
	   }
	}
