package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1310_MyJTextArea extends JApplet
{
  JLabel myJLabel;
  JTextArea myJTextArea;

  public void init()
  {
    Container c= this.getContentPane();
	c.setLayout(new BorderLayout());  // ���� ���̾ƿ� ���

    myJTextArea= new JTextArea(20,10);    
    c.add("Center", myJTextArea);

    myJLabel= new JLabel();
    myJLabel.setText("���� �Է����ּ���!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add("South", myJLabel);
  }
}