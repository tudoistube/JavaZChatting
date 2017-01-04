package ch11;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1104_SoundTest extends Applet
  implements ActionListener
{
  Button playButton, loopButton, stopButton;
  AudioClip sound;

  public void init()
  {
	//...getImage() �޼��尡 �̹����� �����ؼ� �����ִ� �� ó��
	//...����� Ŭ���� �޸𸮿� �ε���.
    sound= getAudioClip(getCodeBase(), "./res/ch11/sound.wav");

    playButton= new Button("����");
    playButton.addActionListener(this);
    add(playButton);

    loopButton= new Button("�ݺ� ����");
    loopButton.addActionListener(this);
    add(loopButton);

    stopButton= new Button("����");
    stopButton.addActionListener(this);
    add(stopButton);
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==playButton){
      //...AudioClip Ŭ������ �޼���.
      sound.play();
    }else if(e.getSource()==loopButton){
      sound.loop();
    }else if(e.getSource()==stopButton){
      sound.stop();
    }
  }
}