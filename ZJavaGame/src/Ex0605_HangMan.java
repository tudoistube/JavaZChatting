import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex0605_HangMan {

	String hiddenString;		//������ ���ڿ�(����)
	StringBuffer outputString;	//�÷��̾��� �Է¿� ���� ����� ������ ���ڿ�
	StringBuffer inputString;	//�÷��̾ �Է��� ���ڵ��� ����
	int remainder;				//���� ���ڿ�(���� ������ ��)
	int failed;					//������ Ƚ��
	
	public Ex0605_HangMan() {
		this.hiddenString = "Question"; //...����.
	}
	
	public int playGame() throws IOException
	{
		this.outputString = new StringBuffer();
		
		for(int i = 0; i < this.hiddenString.length(); i++)//...hiddenString ���ڼ���ŭ '-' ���.
		{
			this.outputString.append('-');
		}
		
		this.inputString = new StringBuffer();
		
		this.remainder = this.hiddenString.length(); //...hiddenString ���ڼ��� ���� ������ ���ڼ�.
		
		this.failed = 0;
		
		System.out.println("\n�ܾ�(" + this.hiddenString.length() + " ���� "+ "): " + this.outputString);
		
		drawMan();
		
		do{
			checkChar(readChar());
			System.out.println("\n�ܾ�("+ hiddenString.length() +"����" + "): "+ outputString);
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
			this.inputString.append(guess); //...�Է��� ���ڸ��ӿ� �߰�.
			boolean success = false;
			for(int i = 0; i < this.hiddenString.length(); i++)
			{
				if(this.hiddenString.charAt(i) == guess) //...������ �ش繮�ڰ� �ִ��� ����.
				{
					this.outputString.setCharAt(i, guess); //...������ ���ڰ� ������ -�� ���ڷ� ������.
					this.remainder--; //...���� ���ڼ� 1 ����.
					success = true; //...�Է��� ���ڰ� ������ �־����� ǥ����.
				}
				
				if(!success) this.failed++; //...�Է��� ���ڰ� ������ ������ ����Ƚ���� 1 ������.
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
			System.out.println("��  |");
			System.out.println("    |");
			System.out.println("    |");
			System.out.println("    |");
			System.out.println("    |");
			System.out.println("    |");		
			break;

			case 2:
			System.out.println("��  |");
			System.out.println("��  |");
			System.out.println("    |");
			System.out.println("    |");
			System.out.println("    |");
			System.out.println("    |");		
			break;

			case 3:
			System.out.println("��  |");
			System.out.println("��  |");
			System.out.println("��  |");
			System.out.println("    |");
			System.out.println("    |");
			System.out.println("    |");		
			break;

			case 4:
			System.out.println("��  |");
			System.out.println("��  |");
			System.out.println("��  |");
			System.out.println("!!  |");
			System.out.println("    |");
			System.out.println("    |");		
			break;

			case 5:
			System.out.println("��  |");
			System.out.println("��  |");
			System.out.println("��  |");
			System.out.println("!!  |");
			System.out.println("    |");
			System.out.println("�Ф�|");		
			break;

			case 6:
			System.out.println("��  |");
			System.out.println("��  |");
			System.out.println("��  |");
			System.out.println("!!  |");
			System.out.println("TT  |");
			System.out.println("�Ф�|");				
			break;
		}

		System.out.println("Hi World!");				
	}
	

}