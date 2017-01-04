package ch09;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex0915_EventTest extends Applet
  implements ActionListener
{
  Button myButton1, myButton2, myButton3;
  TextArea myTextArea;
  Panel buttonPanel;

  public void init()
  {
    setLayout(new BorderLayout());

    buttonPanel= new Panel();
    buttonPanel.setBackground(Color.ORANGE);

    myButton1= new Button("C���");
    myButton1.addActionListener(this);
    buttonPanel.add(myButton1);

    myButton2= new Button("C++���");
    myButton2.addActionListener(this);
    buttonPanel.add(myButton2);

    myButton3= new Button("�ڹ�");
    myButton3.addActionListener(this);
    buttonPanel.add(myButton3);

    add("North", buttonPanel);


    myTextArea= new TextArea(50,20);
    add("Center", myTextArea);
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==myButton1){
      myTextArea.append("C��� ��ư�� �����Ͽ����ϴ�.\n");
    }else if(e.getSource()==myButton2){
      myTextArea.append("C++��� ��ư�� �����Ͽ����ϴ�.\n");
    }else if(e.getSource()==myButton3){
      myTextArea.append("�ڹ� ��ư�� �����Ͽ����ϴ�.\n");
    }
  }
}