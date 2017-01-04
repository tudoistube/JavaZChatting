
public class Ex0603_StaticTest {

	public static void main(String[] args) {
		
		myClass[]	mc = new myClass[10];
		
		for(int i = 0; i < 10; i++){
			
			mc[i] = new myClass();
			System.out.println("mc[" + i + "] : " + mc[i].getObjectNum() + " °³");
			
		}
		
		System.out.println("Hi World!");

	}

}

class myClass
{
	static int object_num = 0;

	public myClass()
	{
		object_num++;
	}

	public static int getObjectNum()
	{
		return object_num;
	}
}