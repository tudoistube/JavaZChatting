package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1318_CardLayoutTest extends JFrame
  implements ActionListener
{
  CardLayout card= new CardLayout(); // ī�� ���̾ƿ����� ����

  public Ex1318_CardLayoutTest()
  {
    setLayout(card);

    for(int i=1; i<=5; i++){
      JButton b= new JButton("��ư-"+ i);
      b.addActionListener(this);
      add("BUTTON-"+i, b); // 5���� ��ư�� �� ī�帶�� �ϳ��� �߰�
    }

    setSize(640, 480);
	setLocation(100,100);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e) // ��ư�� �������� ����
  {
    card.next(this.getContentPane()); // ���� ī�带 ���
  }

  public static void main(String[] args)
  {
    new Ex1318_CardLayoutTest();
  }
}
