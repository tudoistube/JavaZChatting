
public class Ch1_4_ReadCharacters {

	public static void main(String[] args)  throws java.io.IOException {
		
	      int data;
	      
	      while((data = System.in.read()) >= 0) // 키보드로부터 한문자씩 읽는다. 
	         System.out.write(data);
	   }

}
