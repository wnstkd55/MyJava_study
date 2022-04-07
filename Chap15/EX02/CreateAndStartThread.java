package Chap15.EX02;

//���ο� ������ ����
	//1. Thread Ŭ������ ��� run()�� �������̵��ؼ� ����
	//2. Runable �������̽��� run()�� ���� (run(); : �̿ϼ��� �޼ҵ�)

class SMIFileThread extends Thread{
	
	
	
	@Override
	public void run() {		//������ �����忡�� �۾��� ������ ����
		//2��° �����忡�� �۾��� ����.
		//�ڸ��� ����ϴ� ������
		String[] strArray= {"�ϳ�","��","��","��","�ټ�"};
		
		//�ڸ� ��� ����
		for(int i=0; i<strArray.length; i++) {
			System.out.println(" - (�ڸ� ��ȣ) "+strArray[i]);
			
			//0.2�� ������ ���.
			try {Thread.sleep(200);}catch(InterruptedException e) {}
		}
		
	}
}


public class CreateAndStartThread {

	public static void main(String[] args) {
		
		//0������ �۵�
		Thread sm = new SMIFileThread();
		sm.start();		//run(); �޼ҵ带 ����. -������ ����.
				//���� : run() ���� ȣ���ϸ� �����尡 �۵��Ǵ°��� �ƴϰ� �޼ҵ常 ���.
				//start():�����带 �۵��ϱ� ���� �޸� �Ҵ� �� run�޼ҵ带 ȣ�� : ������� �۾���.
		
		//1. ù��° ������(main Thread���� �۵�)-���� ������ ���		(1�� ������)
		int [] intArray = {1,2,3,4,5};
		//���� ������ ���
		for(int i=0; i<intArray.length; i++) {
			System.out.print("(���� ������)"+intArray[i]);
		
			try {Thread.sleep(200);}catch(InterruptedException e) {}
		}
	}

}
