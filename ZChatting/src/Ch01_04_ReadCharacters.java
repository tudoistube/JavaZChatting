/**
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch01_04_ReadCharacters
JoyWins
JoyWins
 * @author Administrator
 *
 */
public class Ch01_04_ReadCharacters {

	public static void main(String[] args)  throws java.io.IOException {
		
	      int data;
	      
	    // Ű����κ��� �ѹ��ھ� �д´�.
	    //...����Ű���� �Է��� ���ڵ��� �ϳ��� ������ Ctrl-Z�� -1�� ��ȯ��.  
	      while((data = System.in.read()) >= 0) 
	         System.out.write(data);
	   }

}
