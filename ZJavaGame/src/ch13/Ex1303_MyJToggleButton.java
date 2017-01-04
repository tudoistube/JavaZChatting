package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1303_MyJToggleButton extends JApplet
  implements ActionListener
{
  JLabel myJLabel;
  JToggleButton myJToggleButton1, myJToggleButton2, myJToggleButton3;

  public void init()
  {
	Container c= this.getContentPane();
	c.setLayout(new FlowLayout());

    myJToggleButton1= new JToggleButton();
    myJToggleButton1.setText("����");
    myJToggleButton1.addActionListener(this);
    c.add(myJToggleButton1);

    myJToggleButton2= new JToggleButton("����");
    myJToggleButton2.addActionListener(this);
    c.add(myJToggleButton2);

    myJToggleButton3= new JToggleButton("���");
    myJToggleButton3.addActionListener(this);
    c.add(myJToggleButton3);

    myJLabel= new JLabel();
    myJLabel.setText("��ư�� �����ּ���!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add(myJLabel);
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==myJToggleButton1){ // ��� ��ư�� �������� getSource() �޼ҵ�� ����
      myJLabel.setText("���� �����߽��ϴ�.");
    }else if(e.getSource()==myJToggleButton2){
      myJLabel.setText("���츦 �����߽��ϴ�.");
    }else if(e.getSource()==myJToggleButton3){
      myJLabel.setText("��� �����߽��ϴ�.");
    }
  }
}