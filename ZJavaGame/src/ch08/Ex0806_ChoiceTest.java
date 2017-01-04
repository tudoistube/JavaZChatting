package ch08;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex0806_ChoiceTest extends Applet
  implements ItemListener
{
  Label  myLabel;
  Choice myChoice;

  public void init()
  {
    myChoice= new Choice();
    myChoice.addItem("C���");
    myChoice.addItem("C++���");
    myChoice.addItem("�ڹ�");
    myChoice.addItemListener(this);
    add(myChoice);

    myLabel= new Label();
    myLabel.setText("���̽� �׸��� �������ּ���!");
    myLabel.setAlignment(Label.CENTER);
    myLabel.setBackground(Color.yellow);
    add(myLabel);
  }

  public void itemStateChanged(ItemEvent e)
  {
    if(e.getSource()==myChoice){
      myLabel.setText("����: "+ myChoice.getSelectedItem());
    }
  }
}