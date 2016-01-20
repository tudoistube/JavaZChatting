import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

public class Ch04_04_BufferedWriteCharacter 
{
	   public static void main(String args[]) throws IOException {
	      String strText = "이 파일은 BufferedWriter 클래스를 이용해서 저장한 파일입니다.";
	      
	      FileWriter fw = new FileWriter("example04_04.txt");
	      // bw는 fw에 연결된다.
	      BufferedWriter bw = new BufferedWriter(fw);
	      
	      // 디폴트(유니코드) 인코딩 방식을 사용하여 저장한다.
	      //...디폴트로 8192개의 문자를 저정함.
	      bw.write(strText, 0, strText.length()); // 파일에 문자열을 저장한다.
	      
	       // bw.write(text); 를 이용해도 됨.
	      bw.flush(); // 버퍼의 내용을 쓴다.
	      bw.close();
	   }
	}
