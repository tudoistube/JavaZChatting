
public class Ex0405_ConditionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int hour, min, sec;

	    hour= 13;
	    min = 30;
	    sec = 25;

	    String ampm;
	    ampm= (hour >= 12) ? "PM" : "AM";
	    hour= (hour >= 12) ? (hour - 12) : hour;

	    System.out.print(ampm +" "+ hour +":"+min +":"+ sec);
	}

}
