package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1312_MyJSlider extends JApplet
  implements ChangeListener
{
  JLabel myJLabel;
  JSlider myJSlider;

  public void init()
  {
    Container c= this.getContentPane();
    c.setLayout(new BorderLayout()); // ���� ���̾ƿ����� ����

    myJSlider= new JSlider(JSlider.HORIZONTAL, 1, 100, 50); // �����̴� ����
    myJSlider.addChangeListener(this);
    c.add("North", myJSlider); // �����̴��� �߰�

    myJLabel= new JLabel();
    myJLabel.setText("�����̴��� �����ϼ���!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add("Center", myJLabel); // ���̺��� �߰�
  }

  public void stateChanged(ChangeEvent e)
  {
    if(e.getSource()==myJSlider){
      myJLabel.setText("��ġ: "+ myJSlider.getValue());
    }
  }
}