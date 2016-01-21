import java.io.*;
import java.net.*;//...��Ʈ��ũ ���α׷� �ۼ� ����.
import java.awt.*;
import java.awt.event.*;

public class Ch06_08_ReadServerFile  extends Frame implements ActionListener
{
	   private TextField txtEnter;
	   private TextArea txtContents;
	   
	   public Ch06_08_ReadServerFile(){
	      super("ȣ��Ʈ ���� �б�");
	      setLayout( new BorderLayout() );
	      
	      txtEnter = new TextField( "URL�� �Է��ϼ���!" );
	      txtEnter.addActionListener( this );
	      add( txtEnter, BorderLayout.NORTH );
	      
	      txtContents=new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
	      add( txtContents, BorderLayout.CENTER );
	      
	      addWindowListener(new WinListener());
	      setSize(350, 150);
	      setVisible(true);
	   }
	   
	   public void actionPerformed( ActionEvent e ) {
	      URL url;
	      InputStream is;
	      BufferedReader br;
	      String strLine;
	      StringBuffer sb = new StringBuffer();	      
	      String strUrl = e.getActionCommand(); // �ؽ�Ʈ �ʵ忡 �Էµ� URL�� ����
	      
	      try {
	         url = new URL( strUrl );
	         is = url.openStream(); // location(ȣ��Ʈ)�� �����Ű�� InputStream ��ü����
	         br = new BufferedReader(new InputStreamReader(is));
	         
	         txtContents.setText( "������ �д� ���Դϴ�...." );
	         
	         while ( ( strLine = br.readLine() ) != null ) // ����(��������)�� �д´�.
	            sb.append( strLine ).append( '\n' );
	         
	         txtContents.setText( sb.toString() ); // ���� ������ �ؽ�Ʈ ����� ���
	         br.close();
	      }catch(MalformedURLException mal) {
	         txtContents.setText("URL ������ �߸��Ǿ����ϴ�.");
	      }catch ( IOException io ) {
	         txtContents.setText( io.toString() );
	      }catch ( Exception ex ) {
	         txtContents.setText( "ȣ��Ʈ ��ǻ���� ���ϸ��� �� �� �ֽ��ϴ�." );
	      }
	   }
	   public static void main(String args[]){
	      Ch06_08_ReadServerFile read = new Ch06_08_ReadServerFile();
	   }
	   class WinListener extends WindowAdapter
	   {
	      public void windowClosing(WindowEvent we){
	         System.exit(0);
	      }
	   }
	}