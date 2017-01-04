import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Ex0704_HangMan2 extends Ex0605_HangMan {

	String[] words = { "influenza", "fever", "cancer", "poison", "victim",
			"physician", "clinic", "symptom", "medicine", "drug", "hygiene" };

	String[] meaning = { "����", "��", "��", "��", "ȯ��", "�����ǻ�", "�����", "¡��", "����",
			"��", "������" };

	public Ex0704_HangMan2() {
		Random r = new Random();
		int randomNum = Math.abs(r.nextInt() % words.length);

		this.hiddenString = words[randomNum];

		System.out.println("\n�ǹ� : " + meaning[randomNum]);
	}

	public char readChar() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String user;

		do {
			System.out
					.println("Input 1 character(Input ? if you want any hint) :");
			user = in.readLine();

			if (user.charAt(0) == '?') {
				boolean givehint = false;
				int i = 0;
				while (!givehint) {
					if (outputString.charAt(i) == '-') {
						System.out.println();
						System.out.println("��Ʈ: " + hiddenString.charAt(i));
						System.out.println();
						failed++;
						givehint = true;
					}
					i++;
				}
			}

		} while (user.charAt(0) == '?');
		
		return user.charAt(0);

	}

}
