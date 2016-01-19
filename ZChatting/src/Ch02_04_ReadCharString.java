import java.io.*; //...IOException, InputStream, OutputStream

public class Ch02_04_ReadCharString 
{
	   static FileInputStream fis;
	   static DataInputStream dis;
	   
	   public static void main(String args[]){
	      char ch;
	      String strData1, strData2;
	      
	      try{
	         fis = new FileInputStream("example02_02.txt");
	         dis = new DataInputStream(fis);
	         
	         ch = dis.readChar(); // writeChar()의 대응메소드
	         strData1 = dis.readUTF(); // writeUTF()의 대응메소드
	         strData2 = dis.readUTF();  
	         
	         System.out.println(ch); // 문자 'A'를 출력
	         System.out.println(strData1); // "반갑습니다"를 출력
	         System.out.println(strData2); // "자바 채팅 프로그래밍 교재"를 출력
	         
	      }catch(EOFException e){
	         System.out.println(e);
	      }catch(IOException e){ 
	         System.err.println(e);
	      }
	   }
	}
