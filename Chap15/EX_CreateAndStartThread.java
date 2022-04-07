package Chap15;

/*
 	������ 4�� ���� : 1 - Thread�� ��� 2 - Runnable ���� 3,4 - �͸� ����Ŭ������ �����ؼ� ����
 	�� ���� String�迭�� ������ �Ʒ��� ���� ���
 	
 	1		2		3		4
 	�̸�		ȫ�浿	�̼���	�ɻ��Ӵ�
 	����		40		50		60
 	����		100		90		80
 	����		70		60		100
 	����		50		70		80
 	
 */

class personInfo extends Thread{
	public void run() {
		String[] strArray= {"T_1","�̸�","����","����","����","����"};
		
		//��� ����
//		try {Thread.sleep(20);} catch(InterruptedException e1) {}
			for(int i=0; i<strArray.length; i++) {
				System.out.println(" "+strArray[i]+"\t");
			
		//0.2�� ������ ���.
			try {Thread.sleep(200);}catch(InterruptedException e) {}
			}	
	}
}

class hongInfo implements Runnable{
	@Override
	public void run() {
		String[] strArray= {"ȫ�浿","40","100","70","50"};
		
		//��� ����
			try {Thread.sleep(20);} catch(InterruptedException e) {}
			for(int i=0; i<strArray.length; i++) {
				System.out.println(" "+strArray[i]);
			
		//0.2�� ������ ���.
			try {Thread.sleep(500);}catch(InterruptedException e1) {}
			}	
		
	}
}

public class EX_CreateAndStartThread {

	public static void main(String[] args) {
		Thread cata = new personInfo();
		
//		System.out.println();
		
		Runnable hong = new hongInfo();
		Thread thread1 = new Thread(hong);
		
//		System.out.println();
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] strArray = {"�̼���","50","90","60","70"};
				try {Thread.sleep(20);} catch(InterruptedException e) {}	//0.01�� ������
				for(int i =0; i < strArray.length; i++) {
					System.out.print(" "+strArray[i]);
				try {Thread.sleep(500);} catch(InterruptedException e2) {}	//0.2�� ������
			}
				};
				
			}
		);
		
		System.out.println();
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] strArray = {"�ɻ��Ӵ�","60","80","100","80"};
				try {Thread.sleep(20);} catch(InterruptedException e) {}	//0.01�� ������
				for(int i =0; i < strArray.length; i++) {
					System.out.println(" "+strArray[i]);
				try {Thread.sleep(500);} catch(InterruptedException e3) {}	//0.2�� ������
			}
				};
				
			}
		);
		cata.run();
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
