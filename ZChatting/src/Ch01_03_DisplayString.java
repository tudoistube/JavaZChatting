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
	         buffer = args[i].getBytes(); // ���ڿ��� ����Ʈ �����ͷ� ��ȯ�Ѵ�. 
	         System.out.write(buffer);
	         System.out.write('\n'); // ���� ���ڿ��� ���ο� �ٿ� ����Ѵ�.
	      }
	   }

}
