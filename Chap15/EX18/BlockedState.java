package Chap15.EX18;


//BLOCKED ���� : ����ȭ �޼ҵ峪 ����ȭ ������� �� �����尡 Ű�� ������ ��� ��� ������ ������

class MyBlockTest{
	//1. ���� ��ü( ����ȭ �޼ҵ�, ����ȭ ���) 
	MyClass mc = new MyClass();
	//2. ������ �������ʵ� ����
	Thread t1 = new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		};
	};
	Thread t2 = new Thread("thread2") {
		public void run() {
			mc.syncMethod();
		};
	};
	Thread t3 = new Thread("thread3") {
		public void run() {
			mc.syncMethod();
		};
	};
	void startALL() {
		t1.start();
		t2.start();
		t3.start();
	}
	
	class MyClass{		//MyBlockTest�� ���� Ŭ����
		synchronized void syncMethod() {		//����ȭ �޼ҵ� : �����尡 Ű�� ���������常 ����
			try {Thread.sleep(100);} catch (InterruptedException e) {}	//������ �غ�ð� 0.1�� ����
			System.out.println("======" + Thread.currentThread().getName()+"======");
			System.out.println("thread1 ->" + t1.getState());
			System.out.println("thread2 ->" + t2.getState());
			System.out.println("thread3 ->" + t3.getState());
		}
	}
}



public class BlockedState {

	public static void main(String[] args) {
		
		MyBlockTest mbt = new MyBlockTest();
		mbt.startALL();
	}

}
