package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1311_MyJScrollBar extends JApplet
  implements AdjustmentListener
{
  JLabel myJLabel;
  JScrollBar myJScrollBar;

  public void init()
  {
    Container c= this.getContentPane();
    c.setLayout(new BorderLayout()); // ���� ���̾ƿ����� ����

    //...��ũ�ѹ� ���� : ����, �ʱⰪ, ����ũ��, �ּ�, �ִ밪
    myJScrollBar= new JScrollBar(JScrollBar.HORIZONTAL, 50, 0, 1, 100);
    myJScrollBar.addAdjustmentListener(this);
    c.add("North", myJScrollBar); // ��ũ�ѹٸ� �߰�

    myJLabel= new JLabel();
    myJLabel.setText("��ũ�ѹٸ� �����ϼ���!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add("Center", myJLabel); // ���̺��� �߰�
  }

  public void adjustmentValueChanged(AdjustmentEvent e) // ������ ������ ��
  {
    if(e.getSource()==myJScrollBar){
      myJLabel.setText("��ġ: "+ myJScrollBar.getValue());
    }
  }
}