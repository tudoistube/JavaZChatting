import java.io.*; //...IOException.

public class Ch01_06_ReadCharactersOffset {

	public static void main(String[] args) {
		
	      try{
	          int bufferSize = 80;
	          int size=0; // ���ۿ� ����� �������� ���� ������
	          int dataRead;
	          byte buffer[] = new byte[bufferSize];
	          
	          //...read(byte[], int, int)�޼��带 ����ϸ� enterŰ�� ���е� �ټ��� ������
	          //...���ۿ� ������.
	          while((dataRead = System.in.read(buffer, size, bufferSize-size)) >= 0){
	    // buffer �迭�� enter Ű���� �Էµ� �����͸� ���ʷ� ������
	             size += dataRead;
	          }
	          System.out.write(buffer,0, size); // buffer�� ������ �����
	       }catch(IOException e){
	          System.err.println("��Ʈ�����κ��� �����͸� ���� �� �����ϴ�.");
	       }
	    }

}
