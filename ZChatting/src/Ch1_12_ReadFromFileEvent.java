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
	      lfile = new Label("�����̸��� �Է��ϼ���");
	      add(lfile);
	      
	      tfile = new TextField(20);
	      tfile.addActionListener(this);
	      add(tfile);
	      
	      tadata = new TextArea(3, 35); // ���� ������ ������
	      add(tadata);
	      
	      addWindowListener(new WinListener());
	   }
	   
	   public static void main(String args[]){
		   Ch1_12_ReadFromFileEvent text = new Ch1_12_ReadFromFileEvent("�����б�");
	      text.setSize(270, 160);
	      text.show();
	   }
	   
	   public void actionPerformed(ActionEvent ae){
	      byte buffer[] = new byte[100];
	      filename=tfile.getText(); // 
	      
	      try{
	         FileInputStream fin = new FileInputStream(filename);
	         fin.read(buffer); // ������ ������ �д´�.
	         String data = new String(buffer); // �迭�� ������ ���ڿ��� ��ȯ
	         tadata.setText(data+"\n"); // ���� ������ �ؽ�Ʈ ����� ����Ѵ�.
	      }catch(IOException e){
	         System.out.println(e.toString());
	      }
	   }
	   
	   //...������â�ݱ⿡ �ʿ���.
	   class WinListener extends WindowAdapter
	   {
	      public void windowClosing(WindowEvent we){
	         System.exit(0);
	      }
	   }
}
