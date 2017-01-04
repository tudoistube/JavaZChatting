package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1308_MyJTextField extends JApplet
  implements ActionListener
{
  JLabel myJLabel;
  JTextField myJTextField;

  public void init()
  {
    Container c= this.getContentPane();
	c.setLayout(new FlowLayout());

    myJTextField= new JTextField(20); // �ؽ�Ʈ�ʵ� ����
    myJTextField.addActionListener(this);
    c.add(myJTextField);

    myJLabel= new JLabel();
    myJLabel.setText("�ؽ�Ʈ�ʵ忡 ���� �Է����ּ���!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add(myJLabel);
  }

  public void actionPerformed(ActionEvent e) // �ؽ�Ʈ�ʵ忡 �Է��� �Ϸ�Ǿ��� ��
  {
    if(e.getSource()==myJTextField){
      myJLabel.setText(new String(myJTextField.getText()) +"�� �ԷµǾ����ϴ�!");
    }
  }
}