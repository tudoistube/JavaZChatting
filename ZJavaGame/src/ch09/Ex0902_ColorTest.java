package ch09;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Ex0902_ColorTest extends Applet
  implements ItemListener
{
  Choice myChoice;

  public void init()
  {
    myChoice= new Choice();
    myChoice.addItem("������");
    myChoice.addItem("�Ķ���");
    myChoice.addItem("�ϴû�");
    myChoice.addItem("��ο� ȸ��");
    myChoice.addItem("ȸ��");
    myChoice.addItem("���");
    myChoice.addItem("���� ȸ��");
    myChoice.addItem("��ȫ��");
    myChoice.addItem("��Ȳ��");
    myChoice.addItem("��ȫ��");
    myChoice.addItem("������");
    myChoice.addItem("���");
    myChoice.addItem("�����");
    myChoice.addItemListener(this);
    add(myChoice);
  }

  public void itemStateChanged(ItemEvent e)
  {
    if(e.getSource()==myChoice){
      switch(myChoice.getSelectedIndex()){
        case  0: setBackground(Color.black);
                 break;
        case  1: setBackground(Color.blue);
                 break;
        case  2: setBackground(Color.cyan);
                 break;
        case  3: setBackground(Color.darkGray);
                 break;
        case  4: setBackground(Color.gray);
                 break;
        case  5: setBackground(Color.green);
                 break;
        case  6: setBackground(Color.lightGray);
                 break;
        case  7: setBackground(Color.magenta);
                 break;
        case  8: setBackground(Color.orange);
                 break;
        case  9: setBackground(Color.pink);
                 break;
        case 10: setBackground(Color.red);
                 break;
        case 11: setBackground(Color.white);
                 break;
        case 12: setBackground(Color.yellow);
                 break;
      }
    }
  }
}