package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1321_JPopupMenuTest extends JFrame
{
  JLabel myJLabel= new JLabel("마우스 오른쪽 버튼을 누르면 팝업메뉴가 나타납니다.");
  JPopupMenu myJPopupMenu;

  public Ex1321_JPopupMenuTest()
  {
	setLayout(null);
	myJLabel.setBounds(150, 20, 400, 20);
    add("Center", myJLabel);


    // 팝업 메뉴 생성
    myJPopupMenu= new JPopupMenu(); 

    // 메뉴 아이템을 만들어 메뉴에 추가
    JMenuItem myJMenuItem1= new JMenuItem("빨강");
    myJMenuItem1.addActionListener(new MyJMenuHandler());
    myJPopupMenu.add(myJMenuItem1);

    JMenuItem myJMenuItem2= new JMenuItem("파랑");
    myJMenuItem2.addActionListener(new MyJMenuHandler());
    myJPopupMenu.add(myJMenuItem2);

    JMenuItem myJMenuItem3= new JMenuItem("초록");
    myJMenuItem3.addActionListener(new MyJMenuHandler());
    myJPopupMenu.add(myJMenuItem3);

    JMenuItem myJMenuItem4= new JMenuItem("노랑");
    myJMenuItem4.addActionListener(new MyJMenuHandler());
    myJPopupMenu.add(myJMenuItem4);

    //...팝업메뉴는 메뉴바에 붙일 필요없이 바로 프레임에 붙임.
    // 프레임에 팝업메뉴를 설치
    add(myJPopupMenu);  
    
    addMouseListener(new MyMouseHandler()); // 마우스 사용을 선언

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
      // 마우스 오른쪽 버튼을 누르면 팝업메뉴를 실행
      if((e.getModifiers() & InputEvent.BUTTON3_MASK)!=0){
        myJPopupMenu.show(e.getComponent(), e.getX(), e.getY());
      }
    }
  }

  class MyJMenuHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      myJLabel.setText("["+ e.getActionCommand() +"] 메뉴를 선택하셨습니다.");
    }
  }
}