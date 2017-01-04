public class Ex0503_BreakTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		i = 10;
		
		OUT_WHILE : while(true){
			
			j = 0;
			
			while(true){
				
				System.out.print("*");
				j++;
				
				if(j >= i) break;
				
			}
			
			System.out.println();
			i--;
			if(i <= 0) break OUT_WHILE;
			
		}
		
	
		System.out.println("Hi World!");
	}

}
