package ch08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex0803_ButtonTest extends Applet
  implements ActionListener
{
  Label  myLabel;
  Button myButton1, myButton2, myButton3;

  public void init()
  {
    myButton1= new Button();
    myButton1.setLabel("C���");
    myButton1.addActionListener(this);
    add(myButton1);

    myButton2= new Button("C++���");
    myButton2.addActionListener(this);
    add(myButton2);

    myButton3= new Button("�ڹ�");
    myButton3.addActionListener(this);
    add(myButton3);

    myLabel= new Label();
    myLabel.setText("��ư�� �����ּ���!");
    myLabel.setAlignment(Label.CENTER);
    myLabel.setBackground(Color.yellow);
    add(myLabel);
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==myButton1){
      myLabel.setText("����: C���");
    }else if(e.getSource()==myButton2){
      myLabel.setText("����: C++���");
    }else if(e.getSource()==myButton3){
      myLabel.setText("����: �ڹ�");
    }
  }
}