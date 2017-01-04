package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1309_MyJPasswordField extends JApplet
  implements ActionListener
{
  JLabel myJLabel;
  JPasswordField myJPasswordField;

  public void init()
  {
    Container c= this.getContentPane();
	c.setLayout(new FlowLayout());

    myJPasswordField= new JPasswordField(20); // �н������ʵ� ����
	myJPasswordField.setEchoChar('*'); // �Է� ���ڰ� *�� ǥ��
    myJPasswordField.addActionListener(this);
    c.add(myJPasswordField);

    myJLabel= new JLabel();
    myJLabel.setText("�н������ʵ忡 ���� �Է����ּ���!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add(myJLabel);
  }

  public void actionPerformed(ActionEvent e) // �ؽ�Ʈ�ʵ忡 �Է��� �Ϸ�Ǿ��� ��
  {
    if(e.getSource()==myJPasswordField){
      myJLabel.setText(new String(myJPasswordField.getPassword()) +"�� �ԷµǾ����ϴ�!");
    }
  }
}