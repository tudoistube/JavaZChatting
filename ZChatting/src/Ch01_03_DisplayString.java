/**
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch01_03_DisplayString apple
apple
 * @author Administrator
 *
 */
public class Ch01_03_DisplayString {

	public static void main(String[] args)  throws java.io.IOException {

		byte[] buffer;
		
	      for(int i=0; i<args.length; i++){
	         buffer = args[i].getBytes(); // 문자열을 바이트 데이터로 변환한다. 
	         System.out.write(buffer);
	         System.out.write('\n'); // 다음 문자열은 새로운 줄에 출력한다.
	      }
	   }

}
