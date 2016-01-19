import java.io.*; //...IOException, InputStream, OutputStream

public class Ch02_01_WriteNumberData {

	   static FileOutputStream fos;;
	   static DataOutputStream dos;
	   
	   public static void main(String args[]){
	      try{
		         fos = new FileOutputStream("example02_01.txt");	         
		         dos = new DataOutputStream(fos); // 파일과 연결된 필터 스트림 생성
		         
		         //...writeXxx() 메서드로 지정된 내용은 readXxx() 메서드로 읽어야 함.
		         //...에디터로 그냥 열면 UTF로 지정되지 않아서 내용을 볼 수 없음.
		         dos.writeBoolean(true); // 1값을 파일에 저장한다.
		         dos.writeDouble(989.27); // 실수를 파일에 저장된다.
		         
		         for(int i=1; i<=500; i++){
		            dos.writeInt(i); // 1 부터 500까지의 정수를 파일에 저장한다.
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
