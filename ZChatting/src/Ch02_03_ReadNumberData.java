import java.io.*; //...IOException, InputStream, OutputStream

public class Ch02_03_ReadNumberData 
{
	   static FileInputStream fis;
	   static DataInputStream dis;
	   
	   public static void main(String args[]){
	      boolean blData;
	      double dlData;
	      int number;
	      
	      try{
	         fis = new FileInputStream("example02_01.txt");
	         dis = new DataInputStream(fis);
	         
	         blData = dis.readBoolean(); // �ο� ���� �д´�.
	         System.out.println(blData);
	         
	         dlData = dis.readDouble(); // �Ǽ� ���� �д´�.
	         System.out.println(dlData);
	         
	         while(true){
	        	//...dis.readInt()�� -1�� ������ ���� ���� �д� �޼���.
	        	//...������ ���� ������ EOF(-1)�� �ƴ� EOFException ���ܸ� �߻���Ŵ.
	            number = dis.readInt();
	            System.out.print(number+" "); // �������� �а� ȭ�鿡 ����Ѵ�.
	         }
	         
	      }catch(EOFException e){
	         System.out.println("�����͸� ��� �о����ϴ�."); // ��������
	      }catch(IOException e){ // ������ ����
	         System.err.println(e);
	      }
	   }
	}
