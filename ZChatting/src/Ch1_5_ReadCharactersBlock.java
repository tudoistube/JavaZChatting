
public class Ch1_5_ReadCharactersBlock {

	public static void main(String[] args)  throws java.io.IOException {
		
	      byte[] buffer = new byte[80];	      
	      int numberRead; // �о �迭�� ������ ����Ʈ �����ͼ��� �����Ѵ�
	      
	      while((numberRead = System.in.read(buffer)) >= 0) 
	  // Ű���忡�� enterŰ ���� �Է��� ���ڵ��� �о buffer �迭�� �����ϰ�
	 // ���� ���� ������ ���� ��ȯ�Ͽ� numberRead ���������� �����Ѵ�.
	         System.out.write(buffer, 0, numberRead);
	 // buffer�� �ִ� �����͸� ó������ numberRead ���� ��ŭ ȭ�鿡 ����Ѵ�.
	   }

}
