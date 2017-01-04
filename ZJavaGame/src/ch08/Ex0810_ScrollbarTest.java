package ch08;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex0810_ScrollbarTest extends Applet
  implements AdjustmentListener
{
  Label     myLabel;
  Scrollbar myScrollbar;

  public void init()
  {
    setLayout(new BorderLayout());

    myScrollbar= new Scrollbar(Scrollbar.HORIZONTAL, 50, 0, 1, 100);
    myScrollbar.addAdjustmentListener(this);
    add("North", myScrollbar);

    myLabel= new Label();
    myLabel.setText("스크롤바를 조정하세요!");
    myLabel.setAlignment(Label.CENTER);
    myLabel.setBackground(Color.yellow);
    add("Center", myLabel);
  }

  public void adjustmentValueChanged(AdjustmentEvent e)
  {
    if(e.getSource()==myScrollbar){
      myLabel.setText("위치: "+ myScrollbar.getValue());
    }
  }
}