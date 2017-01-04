package ch08;
import java.awt.*;
import java.applet.*;

public class Ex0813_BorderLayoutTest extends Applet
{
  String[] area= {"East","West","South","North","Center"};

  public void init()
  {
    setLayout(new BorderLayout(0, 3));

    for(int i=0; i<5; i++){
      add(area[i], new Button(area[i]));
    }
  }
}