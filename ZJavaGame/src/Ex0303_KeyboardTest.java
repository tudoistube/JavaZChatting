

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
		//...InputStream��ü�� Reader�� ������.
	    InputStreamReader isr= new InputStreamReader(System.in);
	    //...Reader�� Buffer�� ������.
	    BufferedReader in= new BufferedReader(isr);

	    String str;
	    System.out.println("�۾��� �Է��ϸ� �����մϴ�.");
	    str= in.readLine();
	    System.out.println(str);
	}

}
