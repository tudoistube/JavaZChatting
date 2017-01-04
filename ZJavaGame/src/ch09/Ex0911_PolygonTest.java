package ch09;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex0911_PolygonTest extends Applet
  implements ActionListener
{
  Choice drawChoice;
  Label[] xLabel, yLabel;
  TextField[] xTextField, yTextField;
  Button drawButton;

  public void init()
  {
    drawChoice= new Choice();
    drawChoice.addItem("drawPolygon");
    drawChoice.addItem("fillPolygon");
    add(drawChoice);

    xLabel= new Label[5];
    yLabel= new Label[5];
    xTextField= new TextField[5];
    yTextField= new TextField[5];

    for(int i=0; i<5;i++){
      xLabel[i]= new Label("x"+(i+1)+":");
      add(xLabel[i]);
      xTextField[i]= new TextField("0",3);
      add(xTextField[i]);
      yLabel[i]= new Label("y"+(i+1)+":");
      add(yLabel[i]);
      yTextField[i]= new TextField("0",3);
      add(yTextField[i]);
    }

    drawButton= new Button("±×¸®±â");
    drawButton.addActionListener(this);
    add(drawButton);
  }

  public void paint(Graphics g)
  {
    int[] x= new int[5];
    int[] y= new int[5];

    for(int i=0; i<5; i++){
      x[i]= Integer.valueOf(xTextField[i].getText()).intValue();
      y[i]= Integer.valueOf(yTextField[i].getText()).intValue();
    }

    if(drawChoice.getSelectedIndex()==0){ 
      g.drawPolygon(x, y, 5);
    }else{
      g.fillPolygon(x, y, 5);
    }
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==drawButton){
      repaint();
    }
  }
}