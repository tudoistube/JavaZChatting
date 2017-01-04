package ch08;
import java.awt.*;
import java.applet.*;

public class Ex0813_GridLayoutTest extends Applet
{
  public void init()
  {
    setLayout(new GridLayout(0, 3));

    for(int i=1; i<10; i++){
      add(new Button("¹öÆ° #"+ i));
    }
  }
}