import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

public class Ch04_01_WriteCharacter 
{
	   public static void main(String args[]) throws IOException {
	      String text = "한글 문서 파일입니다.";
	      FileWriter fw = new FileWriter("example04_01.txt"); 
	       // 디폴트(유니코드) 인코딩 방식을 사용하여 저장한다.
	      fw.write(text, 0, text.length()); // 파일에 문자열을 저장한다.
	      fw.flush(); // 버퍼의 내용을 쓴다.
	      fw.close();
	   }
	}
