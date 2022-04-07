package Chap15.EX06;
//Thread �켱����
class MyThread extends Thread{
	@Override
	public void run() {
		for(long i =0; i<1000000000;i++) {}		//�ð� ������}
		System.out.println(getName() + "�켱����"+getPriority());
	}
}


public class ThreadProperties_2 {

	public static void main(String[] args) {
		
		//1. ���� : CPU core Ȯ���ϱ�
		System.out.println("�ھ�� : " + Runtime.getRuntime().availableProcessors());
		
		//2. �⺻(default : 5) �켱����
			//(����)0~5 (default)~10(����)
		for(int i = 0; i<3; i++) {
			Thread thread = new Thread();
			System.out.print(thread.getName()+"\t");		//������ �̸� ���
			System.out.println(thread.getPriority());		//�⺻���� 5
			thread.start();
		}
		// 1�� ����
		try {Thread.sleep(1000);} catch (InterruptedException e) {	}
		
		// 2. �켱���� ���� ����
		for(int i = 0; i<10; i++) {				//0~8 : �켱���� 5, 9 : �켱���� : 10
			Thread thread = new MyThread();
			thread.setName(i+"��° ������");
			if(i == 9) {				//������ �������� �켱������ 10���� �Ҵ�
				thread.setPriority(10);	
			}
			thread.start();
//			System.out.println(thread.getName() + "\t");
//			System.out.println(thread.getPriority());
		}
		
	}

}
