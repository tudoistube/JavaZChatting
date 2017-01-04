package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1317_BorderLayoutTest extends JFrame
{
  String[] area= {"East","West","South","North","Center"}; // ���� ���̾ƿ��� ����

  public Ex1317_BorderLayoutTest()
  {
    setLayout(new BorderLayout(20, 50));   // ����, ���� ������ ���� 1, 2�� ���� ���� ���̾ƿ����� ����

    for(int i=0; i<5; i++){
      add(area[i], new JButton(area[i])); // 5���� ��ư�� �� ������ �߰�
    }

    setSize(640, 480);
	setLocation(100,100);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args)
  {
    new Ex1317_BorderLayoutTest();
  }
}
