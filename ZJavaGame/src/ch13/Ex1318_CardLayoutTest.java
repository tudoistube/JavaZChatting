package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1318_CardLayoutTest extends JFrame
  implements ActionListener
{
  CardLayout card= new CardLayout(); // 카드 레이아웃으로 지정

  public Ex1318_CardLayoutTest()
  {
    setLayout(card);

    for(int i=1; i<=5; i++){
      JButton b= new JButton("버튼-"+ i);
      b.addActionListener(this);
      add("BUTTON-"+i, b); // 5개의 버튼을 각 카드마다 하나씩 추가
    }

    setSize(640, 480);
	setLocation(100,100);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e) // 버튼이 눌러지면 실행
  {
    card.next(this.getContentPane()); // 다음 카드를 출력
  }

  public static void main(String[] args)
  {
    new Ex1318_CardLayoutTest();
  }
}
