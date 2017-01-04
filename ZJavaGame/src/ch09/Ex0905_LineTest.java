package ch09;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex0905_LineTest extends Applet
  implements ActionListener
{
  Label x1Label, y1Label, x2Label, y2Label;
  TextField x1TextField, y1TextField, 
            x2TextField, y2TextField;
  Button drawButton;

  public void init()
  {
    x1Label= new Label("x1:");
    add(x1Label);
    x1TextField= new TextField("0", 3);
    add(x1TextField);

    y1Label= new Label("y1:");
    add(y1Label);
    y1TextField= new TextField("0", 3);
    add(y1TextField);

    x2Label= new Label("x2:");
    add(x2Label);
    x2TextField= new TextField("0", 3);
    add(x2TextField);

    y2Label= new Label("y2:");
    add(y2Label);
    y2TextField= new TextField("0", 3);
    add(y2TextField);

    drawButton= new Button("±×¸®±â");
    drawButton.addActionListener(this);
    add(drawButton);
  }

  public void paint(Graphics g)
  {
    int x1= Integer.valueOf(x1TextField.getText()).intValue();
    int y1= Integer.valueOf(y1TextField.getText()).intValue();
    int x2= Integer.valueOf(x2TextField.getText()).intValue();
    int y2= Integer.valueOf(y2TextField.getText()).intValue();

    g.drawLine(x1, y1, x2, y2);
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==drawButton){
      repaint();
    }
  }
}