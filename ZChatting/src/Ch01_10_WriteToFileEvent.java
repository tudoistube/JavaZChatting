import java.io.*; //...IOException, InputStream, OutputStream
import java.awt.*; //...GUI.
import java.awt.event.*; //...GUI Event.

public class Ch01_10_WriteToFileEvent  extends Frame implements ActionListener
{
	   Label lfile, ldata;
	   TextField tfile, tdata;
	   Button save;
	   String filename, data;
	   byte buffer[] = new byte[80];

	   public Ch01_10_WriteToFileEvent(String str){
	      super(str);
	      setLayout(new FlowLayout());
	      lfile = new Label("파일이름을 입력하세요");
	      add(lfile);
	      tfile = new TextField(20); // 파일이름을 입력하는 텍스트 필드
	      add(tfile);
	      ldata = new Label("저장할 데이터를 입력하세요");
	      add(ldata);
	      tdata = new TextField(20); // 저장할 데이터를 입력하는 텍스트 필드
	      add(tdata);
	      Button save = new Button("저장하기");
	      save.addActionListener(this); // 이벤트 등록
	      add(save);
	      addWindowListener(new WinListener());
	   }
	   public static void main(String args[]){
		   Ch01_10_WriteToFileEvent text = new Ch01_10_WriteToFileEvent("파일저장");
	      text.setSize(270, 150);
	      text.show();
	   }
	   public void actionPerformed(ActionEvent ae){ // Enter 키를 입력하면 실행
	      filename=tfile.getText(); // 파일이름을 읽음
	      
	     // 저장할 데이터를 읽음
    	 //...FileOutputStream클래스는 바이트 단위로 데이터를 전송하기 때문에, tdata
    	  //...텍스트필드에 저장된 문자를 getBytes()를 사용해서 바이트 데이터로 변환시켜 전송함.	      
	      data=tdata.getText(); 
	      buffer = data.getBytes(); // 바이트 데이터를 변환함
	      try{
	         FileOutputStream fout = new FileOutputStream(filename);
	         fout.write(buffer); // 메모리의 내용을 파일에 저장 getBytes() 확인해볼것
	      }catch(IOException e){
	         System.out.println(e.toString());
	      }
	   }
	   class WinListener extends WindowAdapter
	   {
	      public void windowClosing(WindowEvent we){
	         System.exit(0);
	      }
	   }

}
