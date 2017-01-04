package ch08;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex0805_CheckboxGroupTest extends Applet
  implements ItemListener
{
  Label    myLabel;
  Checkbox myCheckbox1, myCheckbox2, myCheckbox3;
  CheckboxGroup group;

  public void init()
  {
    group= new CheckboxGroup();

    myCheckbox1= new Checkbox("C���", false, group);
    myCheckbox1.addItemListener(this);
    add(myCheckbox1);

    myCheckbox2= new Checkbox("C++���", group, false);
    myCheckbox2.addItemListener(this);
    add(myCheckbox2);

    myCheckbox3= new Checkbox("�ڹ�", group, true);
    myCheckbox3.addItemListener(this);
    add(myCheckbox3);

    myLabel= new Label();
    myLabel.setText("üũ�ڽ��� �������ּ���!");
    myLabel.setAlignment(Label.CENTER);
    myLabel.setBackground(Color.yellow);
    add(myLabel);
  }

  public void itemStateChanged(ItemEvent e)
  {
    if(e.getSource()==myCheckbox1){
      myLabel.setText("����: C���");
    }else if(e.getSource()==myCheckbox2){
      myLabel.setText("����: C++���");
    }else if(e.getSource()==myCheckbox3){
      myLabel.setText("����: �ڹ�");
    }
  }
}