public class Ex0504_ArrayTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 3, 5, 7, 9};
		int[] array2;
		
		array2 = new int[array1.length];
		
		for(int i = 0; i < array1.length; i++){
			
			array2[i] = array1[i];
			
		}
		
		//...printout array1.
		for(int i = 0; i < array1.length; i++){
			
			System.out.println("array1["+i+"] = "+ array1[i]);
			
		}		
		System.out.println("------");
		
		//...printout array2.
		for(int i = 0; i < array2.length; i++){
			
			System.out.println("array2["+i+"] = "+ array2[i]);
			
		}		
		System.out.println("------");
		
		System.out.println("Hi World!");
	}

}
