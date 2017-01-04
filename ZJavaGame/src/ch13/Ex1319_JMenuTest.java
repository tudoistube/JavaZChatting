package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1319_JMenuTest extends JFrame
{
  JLabel myJLabel= new JLabel();

  public Ex1319_JMenuTest()
  {
    super("�޴� �׽�Ʈ");
    add("Center", myJLabel);

    // 1. �޴��� ���� �޴��� ����
    JMenuBar myJMenuBar= new JMenuBar();

    // 2. �޴� ����
    JMenu myJMenu= new JMenu("�� �޴�"); 

    // 3.�޴� �������� ����� �޴��� �߰�
    JMenuItem myJMenuItem1= new JMenuItem("�� ������");
    myJMenuItem1.addActionListener(new MyJMenuHandler());
    myJMenu.add(myJMenuItem1);

    JMenuItem myJMenuItem2= new JMenuItem("�� ������2");
    myJMenuItem2.addActionListener(new MyJMenuHandler());
    myJMenu.add(myJMenuItem2);    
    
    // 4. �޴��ٿ� �޴� �߰�
    myJMenuBar.add(myJMenu);
  
    // 5. �����ӿ� �޴��ٸ� ��ġ
    setJMenuBar(myJMenuBar);

    setSize(640, 480);
	setLocation(100,100);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args)
  {
	  new Ex1319_JMenuTest();
  }

  class MyJMenuHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      myJLabel.setText("["+ e.getActionCommand() +"] �޴��� �����ϼ̽��ϴ�.");
    }
  }
}