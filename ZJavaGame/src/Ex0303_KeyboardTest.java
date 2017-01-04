

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex0303_KeyboardTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//...InputStream객체에 Reader를 연결함.
	    InputStreamReader isr= new InputStreamReader(System.in);
	    //...Reader에 Buffer를 연결함.
	    BufferedReader in= new BufferedReader(isr);

	    String str;
	    System.out.println("글씨를 입력하면 따라합니다.");
	    str= in.readLine();
	    System.out.println(str);
	}

}
