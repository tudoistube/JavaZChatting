package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1314_NullLayoutTest extends JFrame
{
  JLabel     myJLabel;
  JButton    myJButton1, myJButton2;
  JTextField myJTextField;
  JCheckBox  myJCheckBox;

  public Ex1314_NullLayoutTest()
  {
    setLayout(null);

    myJLabel= new JLabel("���̺�", JLabel.CENTER);
    myJLabel.setBounds(150, 20, 100, 20); // ���̺��� (150, 20) ��ġ�� ���� 100, ���� 20 ũ��� ����
    add(myJLabel);

    myJButton1= new JButton("��ư1"); 
    myJButton1.setBounds(150, 50, 100, 20); // ��ư�� (150, 50) ��ġ�� ���� 100, ���� 20 ũ��� ����
    add(myJButton1);

    myJButton2= new JButton("��ư2"); 
    myJButton2.setBounds(150, 80, 100, 20); // ��ư�� (150, 80) ��ġ�� ���� 100, ���� 20 ũ��� ����
    add(myJButton2);

    myJCheckBox= new JCheckBox("üũ�ڽ�", true);
    myJCheckBox.setBounds(150, 110, 100, 20); // üũ�ڽ��� (150, 110) ��ġ�� ���� 100, ���� 20 ũ��� ����
    add(myJCheckBox);

    myJTextField= new JTextField("�ؽ�Ʈ�ʵ�");
    myJTextField.setBounds(150, 140, 100, 20); // �ؽ�Ʈ�ʵ带 (150, 140) ��ġ�� ���� 100, ���� 20 ũ��� ����
    add(myJTextField);

    setSize(640, 480);
	setLocation(500,100);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args)
  {
    new Ex1314_NullLayoutTest();
  }
}
