package ch11;
import java.applet.*;
import java.net.*;

public class Ex1104_NewAudioClip
{
  public static void main(String[] args)
  {
    //String sound_file= "file:///d:/GameJava/sound.wav";
    String sound_file= "file:///d:/2DoIs2Be/WorkSpace/ZJava_Game/JavaGame/src/res/ch11";

    try{

      URL snd= new URL(sound_file);
      AudioClip myAudioClip= Applet.newAudioClip(snd);
      System.out.println("Main starts...");
      myAudioClip.play();

    }catch(Exception e){
      System.out.println(e.toString());
    }
  }
}