package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1306_MyJComboBox extends JApplet
  implements ItemListener
{
  JLabel myJLabel;
  JComboBox myJComboBox;

  public void init()
  {
	Container c= this.getContentPane();
	c.setLayout(new FlowLayout());

    myJComboBox= new JComboBox();      // ���̽� ����
    myJComboBox.addItem("����");    // �׸� �߰�
    myJComboBox.addItem("����");
    myJComboBox.addItem("���");
    myJComboBox.addItemListener(this);
    c.add(myJComboBox);

    myJLabel= new JLabel();
    myJLabel.setText("�׸��� �������ּ���!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add(myJLabel);
  }

  public void itemStateChanged(ItemEvent e)
  {
    if(e.getSource()==myJComboBox){
      myJLabel.setText(myJComboBox.getSelectedItem()+"�� �����߽��ϴ�.");
    }
  }
}
