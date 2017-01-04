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

    //...ServerSocket, Ex1213_ChatServer 객체를 생성후, ServerSocket.accept()로 채팅클라이언트 접속을 기다림.
    Ex1213_ChatServer myServer= new Ex1213_ChatServer();

    try{
      myServerSocket= new ServerSocket(9000);
    }catch(IOException e){
      System.out.println(e.toString());
      System.exit(-1);
    }
    
    System.out.println("[서버 대기 상태] "+ myServerSocket);

    try{
      //...1명이상의 채팅클라이언트를 접속하기 위해 무한로프 처리함.
      while(true){
    	//...접속을 하면 클라이언트 소켓을 Ex1213_ChatThread 객체의 생성자 인수로 넘겨줌.
        Ex1213_ChatThread client= new Ex1213_ChatThread(myServer, myServerSocket.accept());
        client.start();
        //...전체 클라이언트에게 메시지를 방송하는 경우를 위해 생성된 Ex1213_ChatThread객체를 벡터에 저장함.
        myServer.addClient(client);

        myServer.clientNum++;
        System.out.println("[현재 접속자수] "+ myServer.clientNum +"명");
      }
    }catch(IOException e){
      System.out.println(e.toString());
    }
  }
}