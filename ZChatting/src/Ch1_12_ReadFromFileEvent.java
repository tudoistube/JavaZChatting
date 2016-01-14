import java.io.*; //...IOException, InputStream, OutputStream
import java.awt.*; //...GUI.
import java.awt.event.*; //...GUI Event.

public class Ch1_12_ReadFromFileEvent  extends Frame implements ActionListener
{
	   Label lfile;
	   TextField tfile;
	   TextArea tadata;
	   String filename;
	   
	   public Ch1_12_ReadFromFileEvent(String str){
	      super(str);
	      setLayout(new FlowLayout());
	      lfile = new Label("파일이름을 입력하세요");
	      add(lfile);
	      
	      tfile = new TextField(20);
	      tfile.addActionListener(this);
	      add(tfile);
	      
	      tadata = new TextArea(3, 35); // 읽은 파일을 보여줌
	      add(tadata);
	      
	      addWindowListener(new WinListener());
	   }
	   
	   public static void main(String args[]){
		   Ch1_12_ReadFromFileEvent text = new Ch1_12_ReadFromFileEvent("파일읽기");
	      text.setSize(270, 160);
	      text.show();
	   }
	   
	   public void actionPerformed(ActionEvent ae){
	      byte buffer[] = new byte[100];
	      filename=tfile.getText(); // 
	      
	      try{
	         FileInputStream fin = new FileInputStream(filename);
	         fin.read(buffer); // 파일의 내용을 읽는다.
	         String data = new String(buffer); // 배열의 내용을 문자열로 변환
	         tadata.setText(data+"\n"); // 읽은 내용을 텍스트 에리어에 출력한다.
	      }catch(IOException e){
	         System.out.println(e.toString());
	      }
	   }
	   
	   //...윈도우창닫기에 필요함.
	   class WinListener extends WindowAdapter
	   {
	      public void windowClosing(WindowEvent we){
	         System.exit(0);
	      }
	   }
}
