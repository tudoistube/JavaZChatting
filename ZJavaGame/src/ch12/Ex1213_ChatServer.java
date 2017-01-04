package ch12;
import java.net.*;
import java.io.*;
import java.util.*;

public class Ex1213_ChatServer
{
  Vector clientVector= new Vector();
  int clientNum= 0;

  public void broadcast(String msg) throws IOException
  {
    synchronized(clientVector){
      for(int i=0; i<clientVector.size(); i++){
        Ex1213_ChatThread client= (Ex1213_ChatThread) clientVector.elementAt(i);
        synchronized(client){
          client.sendMessage(msg);
        }
      }
    }
  }

  public void removeClient(Ex1213_ChatThread client)
  {
    synchronized(clientVector){
      clientVector.removeElement(client);
      client= null;
      System.gc();
    }
  }

  public void addClient(Ex1213_ChatThread client)
  {
    synchronized(clientVector){
      clientVector.addElement(client);
    }
  }

  public static void main(String[] args)
  {
    ServerSocket myServerSocket= null;

    //...ServerSocket, Ex1213_ChatServer ��ü�� ������, ServerSocket.accept()�� ä��Ŭ���̾�Ʈ ������ ��ٸ�.
    Ex1213_ChatServer myServer= new Ex1213_ChatServer();

    try{
      myServerSocket= new ServerSocket(9000);
    }catch(IOException e){
      System.out.println(e.toString());
      System.exit(-1);
    }
    
    System.out.println("[���� ��� ����] "+ myServerSocket);

    try{
      //...1���̻��� ä��Ŭ���̾�Ʈ�� �����ϱ� ���� ���ѷ��� ó����.
      while(true){
    	//...������ �ϸ� Ŭ���̾�Ʈ ������ Ex1213_ChatThread ��ü�� ������ �μ��� �Ѱ���.
        Ex1213_ChatThread client= new Ex1213_ChatThread(myServer, myServerSocket.accept());
        client.start();
        //...��ü Ŭ���̾�Ʈ���� �޽����� ����ϴ� ��츦 ���� ������ Ex1213_ChatThread��ü�� ���Ϳ� ������.
        myServer.addClient(client);

        myServer.clientNum++;
        System.out.println("[���� �����ڼ�] "+ myServer.clientNum +"��");
      }
    }catch(IOException e){
      System.out.println(e.toString());
    }
  }
}