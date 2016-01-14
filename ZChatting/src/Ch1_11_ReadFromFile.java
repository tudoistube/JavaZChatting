import java.io.*; //...IOException, InputStream, OutputStream

public class Ch1_11_ReadFromFile {

	   public static void main(String args[]){
		      int bytesRead;
		      byte[] buffer = new byte[256];
		      FileInputStream fin = null;
		      
		      try{
		         fin = new FileInputStream("Ch1_11_ReadFromFile.txt");
		         while((bytesRead = fin.read(buffer)) >= 0){ // ���� -> �޸�
		            System.out.write(buffer, 0, bytesRead); // �޸� -> ȭ�����
		       // ������ �����͸� ���� -> �޸� ���� -> ȭ�鿡 ��� ������
		         }
		      }catch(IOException e){
		         System.err.println("��Ʈ�����κ��� �����͸� ���� �� �����ϴ�.");
		      }finally{
		         try{
		            if(fin!=null) fin.close();
		         }catch(IOException e){}
		      }
		   }

}
