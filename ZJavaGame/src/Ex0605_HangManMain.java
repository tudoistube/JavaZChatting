import java.io.IOException;


public class Ex0605_HangManMain {

	public static void main(String[] args) throws IOException {
		
		Ex0605_HangMan hangman = new Ex0605_HangMan();
		int result = hangman.playGame(); //...게임을 실행.
		
		System.out.println("Hi World!");
		
		if(result <= 4)
		{
			System.out.println("Well Done!");
		}else if(result <= 5)
		{
			System.out.println("Good!");
		}else if(result <= 6)
		{
			System.out.println("Not Bad!");
		}else
		{
			System.out.println("Cheer up!");
		}

	}

}
