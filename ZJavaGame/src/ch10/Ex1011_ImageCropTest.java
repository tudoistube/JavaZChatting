package ch10;
import java.applet.*;
import java.awt.*;
import java.awt.image.*;

public class Ex1011_ImageCropTest extends Applet
{
  Image myImage;
  Image imagePiece[];

  public void init()
  {
    imagePiece= new Image[7];

    //...이미지 나누기.
    //...1.1.Image객체의 getSource()메서드로 ImageProducer객체를 구함.
    myImage= getImage(getCodeBase(), "./images/ch10/slot.gif");
    ImageProducer myProducer= myImage.getSource();

    for(int i=0; i<7; i++){
      //...원본이미지를 읽어서 7개 조각으로 나눠서 imagePiece배열에 저장한 후
      //...원본 이미지와 각 이미지 조각들을 출력함.
      //...CropImageFilter()메서드로 오려낼 부분을 지정한 ImageFilter객체를 생성함.
      //...ImageProducer객체와 ImageFilter객체를 인수로 FilterImageSource클래스의
      //...객체를 만들어서 createImage()메서드의 인수로 주면 원하는 이미지를 얻음.
      ImageFilter myFilter= new CropImageFilter(0, i*64, 64, 64);
      imagePiece[i]= createImage(new FilteredImageSource(myProducer, myFilter));
    }
  }

  public void paint(Graphics g)
  {
    g.drawString("* 원본 이미지", 10, 20);
    g.drawImage(myImage, 20, 30, this);

    for(int i=0; i<7; i++){
      g.drawString("* 이미지 조각 - "+ i, 150, 90*i+20);
      g.drawImage(imagePiece[i], 160, 90*i+30, this);
    }
  }
}