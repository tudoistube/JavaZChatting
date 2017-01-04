package ch08;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Ex0813_CardLayoutTest extends Applet
  implements ActionListener
{
  CardLayout card= new CardLayout();

  public void init()
  {
    setLayout(card);

    for(int i=1; i<5; i++){
      Button b= new Button("¹öÆ° #"+ i);
      b.addActionListener(this);
      add("BUTTON-"+i, b);
    }
  }

  public void actionPerformed(ActionEvent e)
  {
    card.next(this);
  }
}