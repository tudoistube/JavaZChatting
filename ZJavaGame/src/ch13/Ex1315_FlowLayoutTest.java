package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1315_FlowLayoutTest extends JFrame
{
  public Ex1315_FlowLayoutTest()
  {
    setLayout(new FlowLayout());   // �÷ο� ���̾ƿ����� ����

    for(int i=1; i<=15; i++){
      add(new JButton("��ư-"+ i)); // 10���� ��ư�� �߰�
    }

    setSize(640, 480);
	setLocation(100,100);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args)
  {
    new Ex1315_FlowLayoutTest();
  }
}
