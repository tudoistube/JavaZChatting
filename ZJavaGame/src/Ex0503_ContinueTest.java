public class Ex0503_ContinueTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		while(i < 10){
			
			i++;
			
			if(i % 2 == 0) continue;			
			
			System.out.println(i);			
		}
		
	
		System.out.println("Hi World!");
	}

}
