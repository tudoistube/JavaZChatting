import java.io.*; //...IOException, InputStream, OutputStream

public class Ch01_11_ReadFromFile {

	   public static void main(String args[]){
		      int bytesRead;
		      byte[] buffer = new byte[256];
		      FileInputStream fin = null;
		      
		      try{
		    	  //...D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src
		         fin = new FileInputStream("example01_11.txt");
		         while((bytesRead = fin.read(buffer)) >= 0){ // 파일 -> 메모리
			       //..파일의 데이터를 한줄씩 읽음 -> 메모리 저장 -> 화면에 출력 순서임		        	 
		            System.out.write(buffer, 0, bytesRead); // 메모리 -> 화면출력
		         }
		      }catch(IOException e){
		         System.err.println("스트림으로부터 데이터를 읽을 수 없습니다.");
		      }finally{
		         try{
		            if(fin!=null) fin.close();
		         }catch(IOException e){}
		      }
		   }

}
