package ch09;
public class Ex0913_ThreadTest
{
  public static void main(String[] args)
  {
	  Ex0913_MyThread mythread1, mythread2;

    mythread1= new Ex0913_MyThread("Thread-1");
    mythread1.start();

    mythread2= new Ex0913_MyThread("Thread-2");
    mythread2.start();
  }
}