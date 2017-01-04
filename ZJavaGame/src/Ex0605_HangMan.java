import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex0605_HangMan {

	String hiddenString;		//숨겨진 문자열(문제)
	StringBuffer outputString;	//플레이어의 입력에 따른 결과로 보여줄 문자열
	StringBuffer inputString;	//플레이어가 입력한 문자들의 모임
	int remainder;				//맞출 문자열(남은 문자의 수)
	int failed;					//실패한 횟수
	
	public Ex0605_HangMan() {
		this.hiddenString = "Question"; //...문제.
	}
	
	public int playGame() throws IOException
	{
		this.outputString = new StringBuffer();
		
		for(int i = 0; i < this.hiddenString.length(); i++)//...hiddenString 문자수만큼 '-' 출력.
		{
			this.outputString.append('-');
		}
		
		this.inputString = new StringBuffer();
		
		this.remainder = this.hiddenString.length(); //...hiddenString 문자수가 맞출 문제의 문자수.
		
		this.failed = 0;
		
		System.out.println("\n단어(" + this.hiddenString.length() + " 글자 "+ "): " + this.outputString);
		
		drawMan();
		
		do{
			checkChar(readChar());
			System.out.println("\n단어("+ hiddenString.length() +"글자" + "): "+ outputString);
			drawMan();			
		}while((this.remainder > 0)&&(this.failed < 8));
		
		return this.failed;
	}

	public void checkChar(char guess)
	{
		boolean already = false;
		
		for(int i = 0; i < this.inputString.length(); i++)
		{
			if(this.inputString.charAt(i) == guess)
			{
				System.out.println("\n It's already input Character. Input again :");
				already = true;
			}			
		}
		
		if(!already)
		{
			this.inputString.append(guess); //...입력한 문자모임에 추가.
			boolean success = false;
			for(int i = 0; i < this.hiddenString.length(); i++)
			{
				if(this.hiddenString.charAt(i) == guess) //...문제에 해당문자가 있는지 조사.
				{
					this.outputString.setCharAt(i, guess); //...문제에 문자가 있으면 -를 문자로 변경함.
					this.remainder--; //...맞출 문자수 1 감소.
					success = true; //...입력한 문자가 문제에 있었음을 표시함.
				}
				
				if(!success) this.failed++; //...입력한 문자가 문제에 없으면 실패횟수를 1 증가함.
			}
		}
	}
	
	public char readChar() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String user;
		System.out.println("Input 1 Character :");
		user = in.readLine();
		return user.charAt(0);
		
	}
	
	public void drawMan()
	{
		System.out.println("_____");
		System.out.println("|   |");

		switch(failed)
		{
			case 0:
			System.out.println("    |");
			System.out.println("    |");
			System.out.println("    |");
			System.out.println("    |");
			System.out.println("    |");
			System.out.println("    |");
			break;

			case 1:
			System.out.println("◑  |");
			System.out.println("    |");
			System.out.println("    |");
			System.out.println("    |");
			System.out.println("    |");
			System.out.println("    |");		
			break;

			case 2:
			System.out.println("◑  |");
			System.out.println("◇  |");
			System.out.println("    |");
			System.out.println("    |");
			System.out.println("    |");
			System.out.println("    |");		
			break;

			case 3:
			System.out.println("◑  |");
			System.out.println("◇  |");
			System.out.println("□  |");
			System.out.println("    |");
			System.out.println("    |");
			System.out.println("    |");		
			break;

			case 4:
			System.out.println("◑  |");
			System.out.println("◇  |");
			System.out.println("□  |");
			System.out.println("!!  |");
			System.out.println("    |");
			System.out.println("    |");		
			break;

			case 5:
			System.out.println("◑  |");
			System.out.println("◇  |");
			System.out.println("□  |");
			System.out.println("!!  |");
			System.out.println("    |");
			System.out.println("ㅠㅠ|");		
			break;

			case 6:
			System.out.println("◑  |");
			System.out.println("◇  |");
			System.out.println("□  |");
			System.out.println("!!  |");
			System.out.println("TT  |");
			System.out.println("ㅠㅠ|");				
			break;
		}

		System.out.println("Hi World!");				
	}
	

}