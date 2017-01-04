package ch08;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex0808_TextFieldTest extends Applet
  implements ActionListener, TextListener
{
  Label     myLabel;
  TextField myTextField;

  public void init()
  {
    myTextField= new TextField(20);
    myTextField.addActionListener(this);
    myTextField.addTextListener(this);
    add(myTextField);

    myLabel= new Label();
    myLabel.setText("���� �Է����ּ���!");
    myLabel.setAlignment(Label.CENTER);
    myLabel.setBackground(Color.yellow);
    add(myLabel);
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==myTextField){
      myLabel.setText("�Է� �Ϸ�!");
    }
  }

  public void textValueChanged(TextEvent e)
  {
    if(e.getSource()==myTextField){
      myLabel.setText("�Է�: "+ myTextField.getText());
    }
  }
}