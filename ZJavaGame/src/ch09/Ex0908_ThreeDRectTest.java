package ch09;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex0908_ThreeDRectTest extends Applet
  implements ActionListener
{
  Choice drawChoice;
  Label xLabel, yLabel, widthLabel, heightLabel; 
  TextField xTextField, yTextField, 
            widthTextField, heightTextField;
  Checkbox raisedCheckbox;
  Button drawButton;

  public void init()
  {
    drawChoice= new Choice();
    drawChoice.addItem("draw3DRect");
    drawChoice.addItem("fill3DRect");
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

    raisedCheckbox= new Checkbox("raised", true);
    add(raisedCheckbox);

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
    boolean raised= raisedCheckbox.getState();

    g.setColor(Color.orange);

    if(drawChoice.getSelectedIndex()==0){ 
      g.draw3DRect(x, y, width, height, raised);
    }else{
      g.fill3DRect(x, y, width, height, raised);
    }
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==drawButton){
      repaint();
    }
  }
}