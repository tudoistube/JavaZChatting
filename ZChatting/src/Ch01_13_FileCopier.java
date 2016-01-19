import java.io.*; //...IOException, InputStream, OutputStream

public class Ch01_13_FileCopier {
	
	//...��Ŭ���� ������ ������Ʈ�����Ʒ� src���� ���� ������ �־�� ���డ����.
	//...�ܼ� ������ src���� �Ʒ��� ������ �־�� ���డ����.
	   public static void main(String args[]){
		   
		      int bytesRead;
		      byte[] buffer = new byte[256];
		      FileInputStream fin = null;
		      FileOutputStream fout = null;
		      
		      try{
		         fin = new FileInputStream("example01_09.txt");
		         fout = new FileOutputStream("example01_13.txt");
		         //...�ݵ�� �޸𸮸� �߰� �Ű�ü�� �̿��ؼ� ������Ѵ�.
		         while((bytesRead = fin.read(buffer)) >= 0){ // �ҽ����� -> �޸�
		            fout.write(buffer, 0, bytesRead); // �޸� -> ����������
		         }
		      }catch(IOException e){
		         System.err.println("��Ʈ�����κ��� �����͸� ���� �� �����ϴ�.");
		      }finally{
		         try{
		            if(fin != null) fin.close();
		            if(fout != null) fout.close();
		         }catch(IOException e){}
		      }
		      
		   }
	   
		}