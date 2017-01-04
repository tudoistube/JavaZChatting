

public class Ex0301_StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String str1= "Hi ";
	    String str2= "World!";
	    String str3= str1 + str2;

	    System.out.println("str1: "+str1);
	    System.out.println("str2: "+str2);
	    System.out.println("str3: "+str3);
	    System.out.println("str1의 크기는 "+ str1.length() +"입니다.");
	    System.out.println("str2를 소문자로 바꾸면 "+ str2.toLowerCase() +"입니다.");
	    System.out.println("str3의 l을 L로 바꾸면 "+ str3.replace('l', 'L') +"입니다.");
	    //...charAt()은 0부터 시작함.
	    System.out.println("str2의 3번째 문자는 "+ str2.charAt(2) +"입니다.");
	}

}
