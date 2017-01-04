package ch08;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex0809_TextAreaTest extends Applet
  implements TextListener
{
  Label    myLabel;
  TextArea myTextArea;

  public void init()
  {
    setLayout(new BorderLayout());

    myTextArea= new TextArea(20,10);
    myTextArea.addTextListener(this);
    add("Center", myTextArea);

    myLabel= new Label();
    myLabel.setText("글을 입력해주세요!");
    myLabel.setAlignment(Label.CENTER);
    myLabel.setBackground(Color.yellow);
    add("South", myLabel);
  }

  public void textValueChanged(TextEvent e)
  {
    if(e.getSource()==myTextArea){
      myLabel.setText("입력: "+ myTextArea.getText());
    }
  }
}