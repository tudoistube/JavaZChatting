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
    super("메뉴 테스트");
    add("Center", myJLabel);

    // 1. 메뉴가 붙을 메뉴바 생성
    JMenuBar myJMenuBar= new JMenuBar();

    // 2. 메뉴 생성
    JMenu myJMenu= new JMenu("내 메뉴"); 

    // 3.메뉴 아이템을 만들어 메뉴에 추가
    JMenuItem myJMenuItem1= new JMenuItem("내 아이템");
    myJMenuItem1.addActionListener(new MyJMenuHandler());
    myJMenu.add(myJMenuItem1);

    JMenuItem myJMenuItem2= new JMenuItem("내 아이템2");
    myJMenuItem2.addActionListener(new MyJMenuHandler());
    myJMenu.add(myJMenuItem2);    
    
    // 4. 메뉴바에 메뉴 추가
    myJMenuBar.add(myJMenu);
  
    // 5. 프레임에 메뉴바를 설치
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
      myJLabel.setText("["+ e.getActionCommand() +"] 메뉴를 선택하셨습니다.");
    }
  }
}