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

    //...�̹��� ������.
    //...1.1.Image��ü�� getSource()�޼���� ImageProducer��ü�� ����.
    myImage= getImage(getCodeBase(), "./images/ch10/slot.gif");
    ImageProducer myProducer= myImage.getSource();

    for(int i=0; i<7; i++){
      //...�����̹����� �о 7�� �������� ������ imagePiece�迭�� ������ ��
      //...���� �̹����� �� �̹��� �������� �����.
      //...CropImageFilter()�޼���� ������ �κ��� ������ ImageFilter��ü�� ������.
      //...ImageProducer��ü�� ImageFilter��ü�� �μ��� FilterImageSourceŬ������
      //...��ü�� ���� createImage()�޼����� �μ��� �ָ� ���ϴ� �̹����� ����.
      ImageFilter myFilter= new CropImageFilter(0, i*64, 64, 64);
      imagePiece[i]= createImage(new FilteredImageSource(myProducer, myFilter));
    }
  }

  public void paint(Graphics g)
  {
    g.drawString("* ���� �̹���", 10, 20);
    g.drawImage(myImage, 20, 30, this);

    for(int i=0; i<7; i++){
      g.drawString("* �̹��� ���� - "+ i, 150, 90*i+20);
      g.drawImage(imagePiece[i], 160, 90*i+30, this);
    }
  }
}