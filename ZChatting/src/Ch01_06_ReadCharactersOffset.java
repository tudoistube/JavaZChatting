import java.io.*; //...IOException.

public class Ch01_06_ReadCharactersOffset {

	public static void main(String[] args) {
		
	      try{
	          int bufferSize = 80;
	          int size=0; // 버퍼에 저장된 데이터의 수를 저장함
	          int dataRead;
	          byte buffer[] = new byte[bufferSize];
	          
	          //...read(byte[], int, int)메서드를 사용하면 enter키로 구분된 다수의 문장을
	          //...버퍼에 저장함.
	          while((dataRead = System.in.read(buffer, size, bufferSize-size)) >= 0){
	    // buffer 배열에 enter 키까지 입력된 데이터를 차례로 저장함
	             size += dataRead;
	          }
	          System.out.write(buffer,0, size); // buffer의 내용을 출력함
	       }catch(IOException e){
	          System.err.println("스트림으로부터 데이터를 읽을 수 없습니다.");
	       }
	    }

}
