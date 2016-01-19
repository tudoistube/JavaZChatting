import java.io.*; //...IOException, InputStream, OutputStream

public class Ch02_02_WriteCharString {

	   static DataOutputStream dos;
	   
	   public static void main(String args[]){
	      try{
	    	  
	         FileOutputStream fos = new FileOutputStream("example02_02.txt");
	         dos = new DataOutputStream(fos); // ���ϰ� ������
	         
	         dos.writeChar(65); // �빮�� 'A'�� ������
	         dos.writeUTF("�ݰ����ϴ�"); 
	         //...���ڿ��� ���̿� �Բ� �� ���ڸ� UTF-8 �������� ���ڵ��ؼ� ������.
	         // �μ��� �־��� ���ڿ��� UTF������� ���ڵ��ؼ� ���Ͽ� �����Ѵ�.
	         dos.writeUTF("�ڹ� ä�� ���α׷��� ����");
	         
	      }catch(EOFException e){
	         System.err.println(e);
	         
	      }catch(IOException e){
	         System.err.println(e);
	         
	      }finally{
	         try{
	            if(dos != null) dos.close();
	            if(dos != null) dos.close();
	         }catch(IOException e){
	            System.err.println(e);
	         }
	         
	      }
	   }

}
