package Chap15.EX05;

//��ü �������� �͸�ü�� ����ؼ� ������ ���� 		<<==���� ���� ���

public class CreateAndStartThread_4 {

	public static void main(String[] args) {
		//�ڸ� ��ȣ ���
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] strArray = {"�ϳ�","��","��","��","�ټ�"};
				try {Thread.sleep(10);} catch(InterruptedException e1) {}	//0.01�� ������
				for(int i =0; i < strArray.length; i++) {
					System.out.println(" - �ڸ� ��ȣ "+strArray[i]);
				try {Thread.sleep(200);} catch(InterruptedException e) {}	//0.2�� ������
			}
				};
				
			}
		);
		
		
		//���� ������ ��� - ������
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				int[] intArray = {1,2,3,4,5};
				for (int i = 0; i < intArray.length; i++) {
					System.out.println(" - ���� ������" + intArray[i]);
					try {Thread.sleep(200);} catch(InterruptedException e) {}	//0.2�� ������
				}
				
			}
		});
		
		//3. ������ ����.
		thread1.start();
		thread2.start();
		
	}

}
