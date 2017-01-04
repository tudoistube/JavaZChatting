
public class Ex0602_ConstructorTest {

	public static void main(String[] args) {

		Clock ck = new Clock(10, 55, 16);
		ck.printTime();
		
		System.out.println("Hi World!");

	}

}

class Clock
{
	int hour, min, sec;
	
	public Clock(int h, int m, int s)
	{
		hour = h;
		min = m;
		sec = s;
		}
		
		public void printTime()
		{
			System.out.println(hour + " : " + min + " : " + sec);			
		}
	
} 