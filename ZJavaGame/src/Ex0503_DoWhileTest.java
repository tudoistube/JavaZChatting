public class Ex0503_DoWhileTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		i = 10;
		
		do
		{
			j = 0;
			
			do
			{
				System.out.print(" * ");
				j++;
				
			}while(j < i);
			
			System.out.println(" ");
			i--;
			
		}while(i > 0);
		
		System.out.println("Hi World!");
	}

}
