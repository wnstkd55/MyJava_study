package Chap15.EX16;

//Thread.sleep(1000) ===> TimedWaiting ���·� �̵� ===> Ư�� �ð�(1��)�� ����Ǹ� Runnable���·� �̵�
											//		==> ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� Runnable
//�ν��Ͻ���(��ü��)[a].join(1000) ===> TimedWaiting ���·� �̵� ==> Ư�� �ð�(1��)�� ����Ǹ� Runnable���·� �̵�
	//a.join(1000)	: �ڽ��� ������� 1�ʸ� ��ٸ��� a��ü����  CPU�Ҵ�(Runnable), 
					// 1�� �ڿ��� �ڽ��� �����嵵 RUNNABLE
//����) �ν��Ͻ���(��ü��)[a]. join()	==> Waiting ���·� �̵�. ==> 
			//�ڽ��� ������� ��� Waiting ���·� ���� a��ü���� CPU(RUNNABLE) ����ϵ��� �Ҵ�.
			// a��ü�� ��� �Ϸ�� ��� �ڽ��� �����嵵 RUNNABLE

class MyThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(3000);		//3�ʵ��� TimedWaiting ���·� ����
		} catch (InterruptedException e) {
			System.out.println("---sleep() ������ Interrupt �߻�");
			for(long i = 0; i < 100000000L; i++) {	}//0.5�� ������ �ð�����
				
			
		}
		
	}
}

public class TimedWaiting_Sleep {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();	//RUNNABLE
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}		//������ ���� �غ� �ð�
		System.out.println("MyThread state: " + myThread.getState());	//TIMED_WAITING
		
		//3�� ������ ���ͷ�Ʈ ���� �߻�.
		myThread.interrupt();  //TIMED_WAITING����
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread state2: "+myThread.getState()); 	//runnable����
	}

}
