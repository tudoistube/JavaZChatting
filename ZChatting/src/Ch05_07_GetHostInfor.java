import java.awt.*; //...GUI.
import java.awt.event.*; //...GUI Event.
import java.net.*;//...네트워크 프로그램 작성 관련.
import java.applet.*;

public class Ch05_07_GetHostInfor  extends Frame implements ActionListener
{
	   TextField txtHostname; // 호스트 이름을 입력받는 필드
	   Button btnGetInfo; // 입력된 호스트에 관한 IP 정보를 읽는 버튼
	   TextArea txtDisplay; // 구해진 IP에 관한 정보를 출력하는 필드
	   
	   public static void main(String args[]) {
		   Ch05_07_GetHostInfor host = new Ch05_07_GetHostInfor("InetAddress 클래스");
	      host.setVisible(true);
	   }
	   
	   public Ch05_07_GetHostInfor(String str){
	      super(str);	      
	      addWindowListener(new WinListener());
	      setLayout(new BorderLayout());
	      
	      Panel inputpanel = new Panel(); // 첫 번째 패널
	      inputpanel.setLayout(new BorderLayout());
	      inputpanel.add("North", new Label("호스트 이름:"));
	      
	      txtHostname = new TextField("", 30);
	      btnGetInfo = new Button("호스트 정보 얻기");
	      inputpanel.add("Center", txtHostname);
	      inputpanel.add("South", btnGetInfo);
	      
	      btnGetInfo.addActionListener(this); // 이벤트 등록
	      add("North", inputpanel); // 패널을 프레임에 부착
	      
	      Panel outputpanel = new Panel(); // 두 번째 패널
	      outputpanel.setLayout(new BorderLayout());
	      
	      txtDisplay = new TextArea("", 24, 40);
	      txtDisplay.setEditable(false);
	      outputpanel.add("North", new Label("인터넷 주소"));
	      outputpanel.add("Center", txtDisplay);
	      
	      add("Center", outputpanel);
	      setSize(270, 200);
	   }
	   
	   public void actionPerformed(ActionEvent e ) {
	      String name = txtHostname.getText(); // 입력된 호스트 이름을 구한다.
	      try{
	         InetAddress inetAddress = InetAddress.getByName(name); // InetAddress 객체생성
	         String strHost = inetAddress.getHostName()+"\n"; // 호스트의 이름을 구한다.
	         txtDisplay.append(strHost);
	         
	         // 호스트의 IP 주소를 구한다.
	         strHost = inetAddress.getHostAddress()+"\n"; 
	         txtDisplay.append(strHost);
	         
	      }catch(UnknownHostException ue){
	         String ip = name+": 해당 호스트가 없습니다.\n";
	         txtDisplay.append(ip);
	      }
	   }
	   class WinListener extends WindowAdapter
	   {
	      public void windowClosing(WindowEvent we){
	         System.exit(0);
	      }
	   }
	}