package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1321_JPopupMenuTest extends JFrame
{
  JLabel myJLabel= new JLabel("���콺 ������ ��ư�� ������ �˾��޴��� ��Ÿ���ϴ�.");
  JPopupMenu myJPopupMenu;

  public Ex1321_JPopupMenuTest()
  {
	setLayout(null);
	myJLabel.setBounds(150, 20, 400, 20);
    add("Center", myJLabel);


    // �˾� �޴� ����
    myJPopupMenu= new JPopupMenu(); 

    // �޴� �������� ����� �޴��� �߰�
    JMenuItem myJMenuItem1= new JMenuItem("����");
    myJMenuItem1.addActionListener(new MyJMenuHandler());
    myJPopupMenu.add(myJMenuItem1);

    JMenuItem myJMenuItem2= new JMenuItem("�Ķ�");
    myJMenuItem2.addActionListener(new MyJMenuHandler());
    myJPopupMenu.add(myJMenuItem2);

    JMenuItem myJMenuItem3= new JMenuItem("�ʷ�");
    myJMenuItem3.addActionListener(new MyJMenuHandler());
    myJPopupMenu.add(myJMenuItem3);

    JMenuItem myJMenuItem4= new JMenuItem("���");
    myJMenuItem4.addActionListener(new MyJMenuHandler());
    myJPopupMenu.add(myJMenuItem4);

    //...�˾��޴��� �޴��ٿ� ���� �ʿ���� �ٷ� �����ӿ� ����.
    // �����ӿ� �˾��޴��� ��ġ
    add(myJPopupMenu);  
    
    addMouseListener(new MyMouseHandler()); // ���콺 ����� ����

    setSize(640, 480);
	setLocation(100,100);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args)
  {
	  new Ex1321_JPopupMenuTest();
  }

  class MyMouseHandler extends MouseAdapter
  {
    public void mouseClicked(MouseEvent e)
    {
      // ���콺 ������ ��ư�� ������ �˾��޴��� ����
      if((e.getModifiers() & InputEvent.BUTTON3_MASK)!=0){
        myJPopupMenu.show(e.getComponent(), e.getX(), e.getY());
      }
    }
  }

  class MyJMenuHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      myJLabel.setText("["+ e.getActionCommand() +"] �޴��� �����ϼ̽��ϴ�.");
    }
  }
}