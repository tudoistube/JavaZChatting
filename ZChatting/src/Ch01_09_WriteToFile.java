import java.io.*; //...IOException, InputStream, OutputStream

public class Ch01_09_WriteToFile {

	  //...FileOutputStream�� �޸𸮿� ������ ������ �����ϴ� ��Ʈ��.
	   static FileOutputStream fout;
	   
	   public static void main(String args[]){
	      try{
	         int bytesRead;
	         byte[] buffer = new byte[256];
	         //...D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src
	         fout = new FileOutputStream("example01_09.txt");
	         
	         while((bytesRead = System.in.read(buffer)) >= 0){ 
	            fout.write(buffer, 0, bytesRead); 
	       // Ű����κ��� ������ �Է� -> �޸� ���� -> ���Ϸ� ����
	          }
	      }catch(IOException e){
	         System.err.println("��Ʈ�����κ��� �����͸� ���� �� �����ϴ�.");
	      }finally{
	         try{
	            if(fout!=null) fout.close();
	         }catch(IOException e){}
	      }
	   }

}
