public class Ex0503_WhileTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		i = 10;
		
		while(i > 0)
		{
			j = 0;
			while(j < i){
				System.out.print(" * ");
				j++;
			}
			
			System.out.println(" ");
			i--;
		}
		
		System.out.println("Hi World!");
	}

}
