import java.io.*; //...IOException, InputStream, OutputStream

public class Ch02_02_WriteCharString {

	   static DataOutputStream dos;
	   
	   public static void main(String args[]){
	      try{
	    	  
	         FileOutputStream fos = new FileOutputStream("example02_02.txt");
	         dos = new DataOutputStream(fos); // 파일과 연결함
	         
	         dos.writeChar(65); // 대문자 'A'를 전송함
	         dos.writeUTF("반갑습니다"); 
	         //...문자열의 길이와 함께 각 문자를 UTF-8 형식으로 인코딩해서 전송함.
	         // 인수로 주어진 문자열을 UTF방식으로 인코딩해서 파일에 전송한다.
	         dos.writeUTF("자바 채팅 프로그래밍 교재");
	         
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
