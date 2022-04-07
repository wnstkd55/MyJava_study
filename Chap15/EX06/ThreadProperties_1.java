package Chap15.EX06;

public class ThreadProperties_1 {

	public static void main(String[] args) {
		//1. ��ü ��������(currentThread())	//�������(activeCount())
			//static
		Thread curThread = Thread.currentThread();	//main Thread
		//Ŭ����(Ÿ��) �������� = Ŭ������.�޼ҵ��
		System.out.println("���� �������� �̸� : "+curThread.getName());
		System.out.println("�����ϴ� �������: "+Thread.activeCount()); 	//���� �����ϴ� �������
		
		System.out.println("==============================================");
		//2. �������� �̸� ���(�ڵ����) - JVM ������ �̸��� �ڵ� �Ҵ� - Thread-0....
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName()); 		//������ �̸� ���
			thread.start();
		}
		
		System.out.println("===============================================");
		//3. ������ �̸� ���� ���� : ��ü��.setName()
		for(int i=0; i<10; i++) {
			Thread thread = new Thread();
			thread.setName(i + " : ��° ������");
			System.out.println(thread.getName());
			thread.start();
		}
		System.out.println("==============================================");
		//4.�������� �̸����(�ڵ����) - jvm������ �̸��� �ڵ����� �Ҵ�
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName()); 		//������ �̸� ���
			thread.start();
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		//5. ������ �� ����ϱ�
		System.out.println("�����ϴ� ������ ��: "+Thread.activeCount());
		
		
		
		
		
	}

}
