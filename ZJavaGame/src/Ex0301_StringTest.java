

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
	    System.out.println("str1�� ũ��� "+ str1.length() +"�Դϴ�.");
	    System.out.println("str2�� �ҹ��ڷ� �ٲٸ� "+ str2.toLowerCase() +"�Դϴ�.");
	    System.out.println("str3�� l�� L�� �ٲٸ� "+ str3.replace('l', 'L') +"�Դϴ�.");
	    //...charAt()�� 0���� ������.
	    System.out.println("str2�� 3��° ���ڴ� "+ str2.charAt(2) +"�Դϴ�.");
	}

}
