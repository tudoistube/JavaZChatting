package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1304_MyJCheckBox extends JApplet
  implements ItemListener
{
  JLabel myJLabel;
  JCheckBox myJCheckBox1, myJCheckBox2, myJCheckBox3;

  public void init()
  {
	Container c= this.getContentPane();
	c.setLayout(new FlowLayout());

    myJCheckBox1= new JCheckBox();
    myJCheckBox1.setText("����");
    myJCheckBox1.addItemListener(this);
    c.add(myJCheckBox1);

    myJCheckBox2= new JCheckBox("����");
    myJCheckBox2.addItemListener(this);
    c.add(myJCheckBox2);

    myJCheckBox3= new JCheckBox("���", true);
    myJCheckBox3.addItemListener(this);
    c.add(myJCheckBox3);

    myJLabel= new JLabel();
    myJLabel.setText("üũ�ڽ��� �������ּ���!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add(myJLabel);
  }

  public void itemStateChanged(ItemEvent e)
  {
    if(e.getSource()==myJCheckBox1){ // ��� üũ�ڽ��� �����ߴ��� getSource() �޼ҵ�� ����
      myJLabel.setText("���� �����߽��ϴ�.");
      System.out.println(myJLabel.isFocusOwner());
    }else if(e.getSource()!=myJCheckBox1){ // ��� üũ�ڽ��� �����ߴ��� getSource() �޼ҵ�� ����
          myJLabel.setText("���� ������ �����߽��ϴ�.");
    }else if(e.getSource()==myJCheckBox2){
      myJLabel.setText("���츦 �����߽��ϴ�.");
    }else if(e.getSource()==myJCheckBox3){
      myJLabel.setText("��� �����߽��ϴ�.");
    }
  }
}