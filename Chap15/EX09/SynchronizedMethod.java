package Chap15.EX09;

//�޼ҵ� ����ȭ : �޼ҵ� ��ü�� ����ȭ �ϴ°�
	//key ���� this�Ҵ��.



class MyData{	//�����尡 �����ϴ� ��ü �ʵ� ����
	
	int data = 3;	//������ ��������	
	public synchronized void plusData() {		//�޼ҵ� ����ȭ : �޼ҵ��� ��ü�� ����ȭ
			//����ȭ ó�� �޼ҵ� : �ϳ��� �����尡 �۾��� �Ϸ�Ǹ� ���� �����尡 �۾��� �� �ִ�.
		int mydata = data;
		try {Thread.sleep(2000);} catch(InterruptedException e){}	
		data = mydata+1;
	}
}

class PlusThread extends Thread{		//1�� �����ϴ� �ΰ��� ������
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData=myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "���� ���: "+myData.data);
	}
}

public class SynchronizedMethod {

	public static void main(String[] args) {
		// ���� ��ü ����
				MyData myData = new MyData();
				
				//1. PlusThread 1
				Thread plusThread1 = new PlusThread(myData);
				plusThread1.setName("plusThread1");
				plusThread1.start();
				
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
				
				//1. PlusThread2
				Thread plusThread2 = new PlusThread(myData);
				plusThread2.setName("plusThread2");
				plusThread2.start();

	}

}
