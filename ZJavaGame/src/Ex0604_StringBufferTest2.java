import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex0604_StringBufferTest2 {

	public static void main(String[] args) throws IOException {

		System.out.println("Input String to be reversed.");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String str = in.readLine();
		
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println("Now you will see the reveresed string");

		System.out.println(sb.reverse());

		System.out.println("Hi World!");

	}

}
