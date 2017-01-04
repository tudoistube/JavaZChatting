import java.io.IOException;


public class Ex0704_HangMan2Main {

	public static void main(String[] args) throws IOException {
		
		Ex0704_HangMan2 hangman = new Ex0704_HangMan2();
		int result = hangman.playGame(); //...게임을 실행.
		
		System.out.println("Hi World!");
		
		if(result <= 8)
		{
			System.out.println("Well Done!");
		}else if(result <= 9)
		{
			System.out.println("Good!");
		}else if(result <= 10)
		{
			System.out.println("Not Bad!");
		}else
		{
			System.out.println("Cheer up!");
		}

	}

}
