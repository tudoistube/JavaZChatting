package ch08;
import java.awt.*;
import java.applet.*;

public class Ex0813_FlowLayoutTest extends Applet
{
  public void init()
  {
    setLayout(new FlowLayout());

    for(int i=1; i<10; i++){
      add(new Button("¹öÆ° #"+ i));
    }
  }
}