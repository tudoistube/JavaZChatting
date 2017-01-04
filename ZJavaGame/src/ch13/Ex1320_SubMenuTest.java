package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1320_SubMenuTest extends JFrame
{
  JLabel myJLabel= new JLabel();

  public Ex1320_SubMenuTest()
  {
    super("MyMenu");
    add("Center", myJLabel);

    // 1. �޴��� ���� �޴��� ����
    JMenuBar myJMenuBar= new JMenuBar();

    // 2. �޴� ����
    JMenu fileMenu= new JMenu("����"); // ���� �޴�
    JMenu editMenu= new JMenu("����"); // ���� �޴�

    // 3. �޴� �������� ����� �޴��� �߰�
    JMenuItem fileMenuItem1= new JMenuItem("����");
    fileMenuItem1.addActionListener(new MyJMenuHandler());
    fileMenu.add(fileMenuItem1);

    JMenuItem fileMenuItem2= new JMenuItem("�ҷ�����");
    fileMenuItem2.addActionListener(new MyJMenuHandler());
    fileMenu.add(fileMenuItem2);

    fileMenu.addSeparator();

    // ����޴�
    JMenu subMenu= new JMenu("��������");
    JMenuItem subMenuItem1= new JMenuItem("�������");
    subMenuItem1.addActionListener(new MyJMenuHandler());
    subMenu.add(subMenuItem1);
    JMenuItem subMenuItem2= new JMenuItem("�����з�");
    subMenuItem2.addActionListener(new MyJMenuHandler());
    subMenu.add(subMenuItem2);
    JMenuItem subMenuItem3= new JMenuItem("������ȣ");
    subMenuItem3.addActionListener(new MyJMenuHandler());
    subMenu.add(subMenuItem3);
    fileMenu.add(subMenu);

    fileMenu.addSeparator();

    JMenuItem fileMenuItem3= new JMenuItem("��");
    fileMenuItem3.addActionListener(new MyJMenuHandler());
    fileMenu.add(fileMenuItem3);

    JMenuItem editMenuItem1= new JMenuItem("�����α�");
    editMenuItem1.addActionListener(new MyJMenuHandler());
    editMenu.add(editMenuItem1);
    
    JMenuItem editMenuItem2= new JMenuItem("�����ϱ�");
    editMenuItem2.addActionListener(new MyJMenuHandler());
    editMenu.add(editMenuItem2);

    JMenuItem editMenuItem3= new JMenuItem("���̱�");
    editMenuItem3.addActionListener(new MyJMenuHandler());
    editMenu.add(editMenuItem3);

    editMenu.addSeparator();

    // üũ�ڽ��޴�
    JCheckBoxMenuItem checkboxMenuItem1= new JCheckBoxMenuItem("���Ǻ�ȣ");
    checkboxMenuItem1.addActionListener(new MyJCheckBoxMenuHandler());
    editMenu.add(checkboxMenuItem1);
    JCheckBoxMenuItem checkboxMenuItem2= new JCheckBoxMenuItem("���ܺ�ȣ");
    checkboxMenuItem2.addActionListener(new MyJCheckBoxMenuHandler());
    editMenu.add(checkboxMenuItem2);


    // 4. �޴��ٿ� �޴� �߰�
    myJMenuBar.add(fileMenu);
    myJMenuBar.add(editMenu);
  
    // 5. �����ӿ� �޴��ٸ� ��ġ
    setJMenuBar(myJMenuBar);

    setSize(640, 480);
	setLocation(100,100);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args)
  {
	  new Ex1320_SubMenuTest();
  }

  class MyJMenuHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      if(e.getActionCommand()=="��"){
        dispose();
      }else{
        myJLabel.setText("["+ e.getActionCommand() +"] �޴��� �����ϼ̽��ϴ�.");
      }
    }
  }

  class MyJCheckBoxMenuHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
		JCheckBoxMenuItem item = (JCheckBoxMenuItem)e.getSource();
        myJLabel.setText("üũ�ڽ� �޴��� ["+ item.getText() +"]�� �����Ͽ� ["+ item.getState() +"]�� �Ǿ����ϴ�.");
    }
  }
}