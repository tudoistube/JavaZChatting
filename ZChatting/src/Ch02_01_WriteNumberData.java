import java.io.*; //...IOException, InputStream, OutputStream

public class Ch02_01_WriteNumberData {

	   static FileOutputStream fos;;
	   static DataOutputStream dos;
	   
	   public static void main(String args[]){
	      try{
		         fos = new FileOutputStream("example02_01.txt");	         
		         dos = new DataOutputStream(fos); // ���ϰ� ����� ���� ��Ʈ�� ����
		         
		         //...writeXxx() �޼���� ������ ������ readXxx() �޼���� �о�� ��.
		         //...�����ͷ� �׳� ���� UTF�� �������� �ʾƼ� ������ �� �� ����.
		         dos.writeBoolean(true); // 1���� ���Ͽ� �����Ѵ�.
		         dos.writeDouble(989.27); // �Ǽ��� ���Ͽ� ����ȴ�.
		         
		         for(int i=1; i<=500; i++){
		            dos.writeInt(i); // 1 ���� 500������ ������ ���Ͽ� �����Ѵ�.
		         }
		         
	         }catch(IOException e){
	        	 System.err.println(e);
	         
	      }finally{
	         try{
	            if(dos != null) dos.close();
	         }catch(IOException e){}
	      }
	   }

}
