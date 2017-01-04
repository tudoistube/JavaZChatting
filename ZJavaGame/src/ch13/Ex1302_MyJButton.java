package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1302_MyJButton extends JApplet
  implements ActionListener
{
  JLabel myJLabel;
  JButton myJButton1, myJButton2, myJButton3;

  public void init()
  {
	Container c= this.getContentPane();
	c.setLayout(new FlowLayout());

    myJButton1= new JButton();
    myJButton1.setText("����");
    myJButton1.addActionListener(this);
    c.add(myJButton1);

    myJButton2= new JButton("����");
    myJButton2.addActionListener(this);
    c.add(myJButton2);

    myJButton3= new JButton("���");
    myJButton3.addActionListener(this);
    c.add(myJButton3);

    myJLabel= new JLabel();
    myJLabel.setText("��ư�� �����ּ���!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add(myJLabel);
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==myJButton1){ // ��� ��ư�� �������� getSource() �޼ҵ�� ����
      myJLabel.setText("���� �����߽��ϴ�.");
    }else if(e.getSource()==myJButton2){
      myJLabel.setText("���츦 �����߽��ϴ�.");
    }else if(e.getSource()==myJButton3){
      myJLabel.setText("��� �����߽��ϴ�.");
    }
  }
}