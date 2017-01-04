public class Ex0504_MyArrayTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1 = {{10, 20, 30, 40},
						  {50, 60},
						  {70, 80, 90}
						 };
		System.out.println("Array length : " + array1.length);
		
		for(int i = 0; i < array1.length; i++){
			
			System.out.println((i+1)+"행의 열수 : " + array1[i].length);
			
			for(int j = 0; j < array1[i].length; j++){
				
				System.out.println("array1["+i+"]["+j+"] = "+ array1[i][j]);
				
			}				
			
		}
		
		System.out.println("------");

		System.out.println("Hi World!");
	}

}
