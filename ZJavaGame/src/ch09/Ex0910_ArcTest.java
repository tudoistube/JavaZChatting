package ch09;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex0910_ArcTest extends Applet
  implements ActionListener
{
  Choice drawChoice;
  Label xLabel, yLabel, widthLabel, heightLabel, 
        startAngleLabel, arcAngleLabel;
  TextField xTextField, yTextField, 
            widthTextField, heightTextField,
            startAngleTextField, arcAngleTextField;
  Button drawButton;

  public void init()
  {
    drawChoice= new Choice();
    drawChoice.addItem("drawArc");
    drawChoice.addItem("fillArc");
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

    startAngleLabel= new Label("startAngle:");
    add(startAngleLabel);
    startAngleTextField= new TextField("0", 3);
    add(startAngleTextField);

    arcAngleLabel= new Label("arcAngle:");
    add(arcAngleLabel);
    arcAngleTextField= new TextField("0", 3);
    add(arcAngleTextField);

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
    int startAngle= Integer.valueOf(startAngleTextField.getText()).intValue();
    int arcAngle= Integer.valueOf(arcAngleTextField.getText()).intValue();

    if(drawChoice.getSelectedIndex()==0){ 
      g.drawArc(x, y, width, height, startAngle, arcAngle);
    }else{
      g.fillArc(x, y, width, height, startAngle, arcAngle);
    }
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==drawButton){
      repaint();
    }
  }
}