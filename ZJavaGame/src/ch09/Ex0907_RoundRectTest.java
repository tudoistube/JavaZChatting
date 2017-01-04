package ch09;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex0907_RoundRectTest extends Applet
  implements ActionListener
{
  Choice drawChoice;
  Label xLabel, yLabel, widthLabel, heightLabel, 
        arcWidthLabel, arcHeightLabel;
  TextField xTextField, yTextField, 
            widthTextField, heightTextField,
            arcWidthTextField, arcHeightTextField;
  Button drawButton;

  public void init()
  {
    drawChoice= new Choice();
    drawChoice.addItem("drawRoundRect");
    drawChoice.addItem("fillRoundRect");
    add(drawChoice);

    xLabel= new Label("x:");
    add(xLabel);
    xTextField= new TextField("0", 3);
    add(xTextField);

    yLabel= new Label("y:");
    add(yLabel);
    yTextField= new TextField("0", 3);
    add(yTextField);

    widthLabel= new Label("width:");
    add(widthLabel);
    widthTextField= new TextField("0", 3);
    add(widthTextField);

    heightLabel= new Label("height:");
    add(heightLabel);
    heightTextField= new TextField("0", 3);
    add(heightTextField);

    arcWidthLabel= new Label("arcWidth:");
    add(arcWidthLabel);
    arcWidthTextField= new TextField("0", 3);
    add(arcWidthTextField);

    arcHeightLabel= new Label("arcHeight:");
    add(arcHeightLabel);
    arcHeightTextField= new TextField("0", 3);
    add(arcHeightTextField);

    drawButton= new Button("±×¸®±â");
    drawButton.addActionListener(this);
    add(drawButton);
  }

  public void paint(Graphics g)
  {
    int x= Integer.valueOf(xTextField.getText()).intValue();
    int y= Integer.valueOf(yTextField.getText()).intValue();
    int width= Integer.valueOf(widthTextField.getText()).intValue();
    int height= Integer.valueOf(heightTextField.getText()).intValue();
    int arcWidth= Integer.valueOf(arcWidthTextField.getText()).intValue();
    int arcHeight= Integer.valueOf(arcHeightTextField.getText()).intValue();

    if(drawChoice.getSelectedIndex()==0){ 
      g.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
    }else{
      g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
    }
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==drawButton){
      repaint();
    }
  }
}