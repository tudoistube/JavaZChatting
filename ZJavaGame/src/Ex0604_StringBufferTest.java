
public class Ex0604_StringBufferTest {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		
		sb.append('R');
		sb.append("eality ");
		sb.append(2007);
		sb.append(' ');
		sb.append(7.5);

		System.out.println(sb);

		sb.insert(6, ", B");
		sb.insert(9, 'C');

		System.out.println(sb);
		
		System.out.println("Hi World!");

	}

}
