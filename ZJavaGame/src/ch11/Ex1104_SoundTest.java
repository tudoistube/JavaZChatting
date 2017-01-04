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
	//...getImage() 메서드가 이미지를 도딩해서 돌려주는 것 처럼
	//...오디오 클립을 메모리에 로딩함.
    sound= getAudioClip(getCodeBase(), "./res/ch11/sound.wav");

    playButton= new Button("연주");
    playButton.addActionListener(this);
    add(playButton);

    loopButton= new Button("반복 연주");
    loopButton.addActionListener(this);
    add(loopButton);

    stopButton= new Button("정지");
    stopButton.addActionListener(this);
    add(stopButton);
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==playButton){
      //...AudioClip 클래스의 메서드.
      sound.play();
    }else if(e.getSource()==loopButton){
      sound.loop();
    }else if(e.getSource()==stopButton){
      sound.stop();
    }
  }
}