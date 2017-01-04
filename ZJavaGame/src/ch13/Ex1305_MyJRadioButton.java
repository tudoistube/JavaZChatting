package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1305_MyJRadioButton extends JApplet
  implements ItemListener
{
  JLabel myJLabel;
  JRadioButton myJRadioButton1, myJRadioButton2, myJRadioButton3;
  ButtonGroup group; // �Բ� ���۵� ������ư���� �׷�

  public void init()
  {
	Container c= this.getContentPane();
	c.setLayout(new FlowLayout());

    myJRadioButton1= new JRadioButton("����", false); 
    myJRadioButton1.addItemListener(this);
    c.add(myJRadioButton1);

    myJRadioButton2= new JRadioButton("����", false); // 
    myJRadioButton2.addItemListener(this);
    c.add(myJRadioButton2);

    myJRadioButton3= new JRadioButton("���", true);
    myJRadioButton3.addItemListener(this);
    c.add(myJRadioButton3);

    group= new ButtonGroup();
    group.add(myJRadioButton1);
    group.add(myJRadioButton2);
    group.add(myJRadioButton3);

	myJLabel= new JLabel();
    myJLabel.setText("üũ�ڽ��� �������ּ���!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add(myJLabel);
  }

  public void itemStateChanged(ItemEvent e)
  {
    if(e.getSource()==myJRadioButton1){
      myJLabel.setText("���� �����߽��ϴ�.");
      System.out.println(myJLabel.getText());
    }else if(e.getSource()==myJRadioButton2){
      myJLabel.setText("���츦 �����߽��ϴ�.");
    }else if(e.getSource()==myJRadioButton3){
      myJLabel.setText("��� �����߽��ϴ�.");
    }
  }
}