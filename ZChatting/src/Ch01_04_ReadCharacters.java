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
	      
	    // 키보드로부터 한문자씩 읽는다.
	    //...엔터키까지 입력한 문자들을 하나씩 읽으며 Ctrl-Z는 -1을 반환함.  
	      while((data = System.in.read()) >= 0) 
	         System.out.write(data);
	   }

}
