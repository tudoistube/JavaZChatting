package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1314_NullLayoutTest extends JFrame
{
  JLabel     myJLabel;
  JButton    myJButton1, myJButton2;
  JTextField myJTextField;
  JCheckBox  myJCheckBox;

  public Ex1314_NullLayoutTest()
  {
    setLayout(null);

    myJLabel= new JLabel("레이블", JLabel.CENTER);
    myJLabel.setBounds(150, 20, 100, 20); // 레이블을 (150, 20) 위치에 가로 100, 세로 20 크기로 지정
    add(myJLabel);

    myJButton1= new JButton("버튼1"); 
    myJButton1.setBounds(150, 50, 100, 20); // 버튼을 (150, 50) 위치에 가로 100, 세로 20 크기로 지정
    add(myJButton1);

    myJButton2= new JButton("버튼2"); 
    myJButton2.setBounds(150, 80, 100, 20); // 버튼을 (150, 80) 위치에 가로 100, 세로 20 크기로 지정
    add(myJButton2);

    myJCheckBox= new JCheckBox("체크박스", true);
    myJCheckBox.setBounds(150, 110, 100, 20); // 체크박스를 (150, 110) 위치에 가로 100, 세로 20 크기로 지정
    add(myJCheckBox);

    myJTextField= new JTextField("텍스트필드");
    myJTextField.setBounds(150, 140, 100, 20); // 텍스트필드를 (150, 140) 위치에 가로 100, 세로 20 크기로 지정
    add(myJTextField);

    setSize(640, 480);
	setLocation(500,100);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args)
  {
    new Ex1314_NullLayoutTest();
  }
}
