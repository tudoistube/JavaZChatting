package ch13;
import java.awt.*;
import javax.swing.*;

public class Ex1301_MyJLabel extends JApplet
{
  JLabel myJLabel1, myJLabel2, myJLabel3;

  public void init()
  {
	//...JApplet�� ���� ������Ʈ �߰�.
	//...1.Container c = JApplet.getContentPane() ȣ��.
	//...2.�г��� ���̾ƿ� �Ŵ����� ����.
	//...  c.setLayout(new FlowLayout());
	//...3.����������Ʈ ����.
	//...  myJButton = new JButton();
	//...�гο� ���� ������Ʈ�� �߰�.
	//...  c.add(myJButton);
	Container c= this.getContentPane();
	c.setLayout(new FlowLayout());

    myJLabel1= new JLabel();
    myJLabel1.setText("����");
    myJLabel1.setHorizontalAlignment(JLabel.LEFT); // ���� ����
    c.add(myJLabel1);

    myJLabel2= new JLabel("����");
    myJLabel2.setHorizontalAlignment(JLabel.CENTER); // ��� ����
    c.add(myJLabel2);

    myJLabel3= new JLabel("���", JLabel.RIGHT); // ������ ����
    c.add(myJLabel3);
  }
}