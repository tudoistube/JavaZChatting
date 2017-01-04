package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1320_SubMenuTest extends JFrame
{
  JLabel myJLabel= new JLabel();

  public Ex1320_SubMenuTest()
  {
    super("MyMenu");
    add("Center", myJLabel);

    // 1. 메뉴가 붙을 메뉴바 생성
    JMenuBar myJMenuBar= new JMenuBar();

    // 2. 메뉴 생성
    JMenu fileMenu= new JMenu("파일"); // 파일 메뉴
    JMenu editMenu= new JMenu("편집"); // 편집 메뉴

    // 3. 메뉴 아이템을 만들어 메뉴에 추가
    JMenuItem fileMenuItem1= new JMenuItem("새글");
    fileMenuItem1.addActionListener(new MyJMenuHandler());
    fileMenu.add(fileMenuItem1);

    JMenuItem fileMenuItem2= new JMenuItem("불러오기");
    fileMenuItem2.addActionListener(new MyJMenuHandler());
    fileMenu.add(fileMenuItem2);

    fileMenu.addSeparator();

    // 서브메뉴
    JMenu subMenu= new JMenu("문서정보");
    JMenuItem subMenuItem1= new JMenuItem("문서요약");
    subMenuItem1.addActionListener(new MyJMenuHandler());
    subMenu.add(subMenuItem1);
    JMenuItem subMenuItem2= new JMenuItem("문서분량");
    subMenuItem2.addActionListener(new MyJMenuHandler());
    subMenu.add(subMenuItem2);
    JMenuItem subMenuItem3= new JMenuItem("문서암호");
    subMenuItem3.addActionListener(new MyJMenuHandler());
    subMenu.add(subMenuItem3);
    fileMenu.add(subMenu);

    fileMenu.addSeparator();

    JMenuItem fileMenuItem3= new JMenuItem("끝");
    fileMenuItem3.addActionListener(new MyJMenuHandler());
    fileMenu.add(fileMenuItem3);

    JMenuItem editMenuItem1= new JMenuItem("오려두기");
    editMenuItem1.addActionListener(new MyJMenuHandler());
    editMenu.add(editMenuItem1);
    
    JMenuItem editMenuItem2= new JMenuItem("복사하기");
    editMenuItem2.addActionListener(new MyJMenuHandler());
    editMenu.add(editMenuItem2);

    JMenuItem editMenuItem3= new JMenuItem("붙이기");
    editMenuItem3.addActionListener(new MyJMenuHandler());
    editMenu.add(editMenuItem3);

    editMenu.addSeparator();

    // 체크박스메뉴
    JCheckBoxMenuItem checkboxMenuItem1= new JCheckBoxMenuItem("조판부호");
    checkboxMenuItem1.addActionListener(new MyJCheckBoxMenuHandler());
    editMenu.add(checkboxMenuItem1);
    JCheckBoxMenuItem checkboxMenuItem2= new JCheckBoxMenuItem("문단부호");
    checkboxMenuItem2.addActionListener(new MyJCheckBoxMenuHandler());
    editMenu.add(checkboxMenuItem2);


    // 4. 메뉴바에 메뉴 추가
    myJMenuBar.add(fileMenu);
    myJMenuBar.add(editMenu);
  
    // 5. 프레임에 메뉴바를 설치
    setJMenuBar(myJMenuBar);

    setSize(640, 480);
	setLocation(100,100);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args)
  {
	  new Ex1320_SubMenuTest();
  }

  class MyJMenuHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      if(e.getActionCommand()=="끝"){
        dispose();
      }else{
        myJLabel.setText("["+ e.getActionCommand() +"] 메뉴를 선택하셨습니다.");
      }
    }
  }

  class MyJCheckBoxMenuHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
		JCheckBoxMenuItem item = (JCheckBoxMenuItem)e.getSource();
        myJLabel.setText("체크박스 메뉴인 ["+ item.getText() +"]를 선택하여 ["+ item.getState() +"]가 되었습니다.");
    }
  }
}