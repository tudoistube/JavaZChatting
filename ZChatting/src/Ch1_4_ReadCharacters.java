
public class Ch1_4_ReadCharacters {

	public static void main(String[] args)  throws java.io.IOException {
		
	      int data;
	      
	      while((data = System.in.read()) >= 0) // Ű����κ��� �ѹ��ھ� �д´�. 
	         System.out.write(data);
	   }

}
