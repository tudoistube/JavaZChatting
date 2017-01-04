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
    myLabel.setText("��ũ�ѹٸ� �����ϼ���!");
    myLabel.setAlignment(Label.CENTER);
    myLabel.setBackground(Color.yellow);
    add("Center", myLabel);
  }

  public void adjustmentValueChanged(AdjustmentEvent e)
  {
    if(e.getSource()==myScrollbar){
      myLabel.setText("��ġ: "+ myScrollbar.getValue());
    }
  }
}