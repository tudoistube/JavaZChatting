import java.io.*; //...IOException, InputStream, OutputStream

public class Ch01_11_ReadFromFile {

	   public static void main(String args[]){
		      int bytesRead;
		      byte[] buffer = new byte[256];
		      FileInputStream fin = null;
		      
		      try{
		    	  //...D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src
		         fin = new FileInputStream("example01_11.txt");
		         while((bytesRead = fin.read(buffer)) >= 0){ // ���� -> �޸�
			       //..������ �����͸� ���پ� ���� -> �޸� ���� -> ȭ�鿡 ��� ������		        	 
		            System.out.write(buffer, 0, bytesRead); // �޸� -> ȭ�����
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
