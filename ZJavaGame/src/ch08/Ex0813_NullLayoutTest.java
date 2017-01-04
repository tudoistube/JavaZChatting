package ch08;
import java.awt.*;
import java.applet.*;

public class Ex0813_NullLayoutTest extends Applet
{
  Label     myLabel;
  Button    myButton;
  TextField myTextField;
  Checkbox  myCheckbox;

  public void init()
  {
    setLayout(null);

    myButton= new Button("내 버튼");
    myButton.setBounds(150, 20, 100, 20);
    add(myButton);

    myLabel= new Label("내 레이블", Label.CENTER);
    myLabel.setBackground(Color.yellow);
    myLabel.setBounds(150, 50, 100, 20);
    add(myLabel);

    myTextField= new TextField("내 텍스트필드");
    myTextField.setBounds(150, 80, 100, 20);
    add(myTextField);

    myCheckbox= new Checkbox("내 체크박스", true);
    myCheckbox.setBounds(150, 110, 100, 20);
    add(myCheckbox);
  }
}