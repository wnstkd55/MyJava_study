package Chap15.EX14;

// Thread ����
  // 1. NEW				: ������ ��ü ���� �� .start()�޼ҵ尡ȣ��Ǳ��� ����
  // 2. RUNNABLE		: .start() �޼Ҵٰ� ȣ��Ǹ� run() �޼ҵ� ������ �ڵ尡 cpu���� ����ǰ� �ִ� ����
  // 3. TERMINATE		: run()�� ��� �ڵ尡 ����ǰ� ���� ������ �������
  // 4. TIMED WAITING	: Ư�� �ð����ȸ� ������, Thread.sleep(1000),
			// a.join(1000) <=== ���� �ڽ��� ������� 1�� �����¿� �ְ� a ��ü�� ������·� ���� ����.
			//Ư���ð��� ����Ǹ� ������·� ��. ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� ������·� ��.
  // 5. BLOCK 			: ����ȭ ó������ Lock�� �ɷ��� ������ ��� ���ܵ� ����, Ű�� �ݳ��� ��� Ű�� ȹ���ؼ� ������·� ��.
  // 6. WAITING			: ������ ������, ���� ������� �������� ���� �ִ�. �ٸ� �����尡 ������ߵȴ�.



public class NewRunnableTerminated {
	public static void main(String[] args) {
		
		//�������� ���¸� �����س��� Ŭ����. ��6���� ���¸� �����Ҽ� �ִ�.
		Thread.State state;			//state �������� 6���� ����� ���� ����
		
		//1. ��ü ����(NEW)		--> �͸� ���� Ŭ���� ����
				//NEW : ������ ��ü ������ start() ȣ�� �Ǳ� ������
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for(long i = 0; i < 100000000L ; i++) {}	//0.5�� �ð�����, cpu���� ����
				//��ü ������ �ణ�� �ð��� �ʿ�.
				//�޸��� �Ҵ�ð��� �ʿ�
			}
		};
		
		state = myThread.getState();	//�������� ���¸� ������ͼ� state������ �Ҵ�.
		System.out.println("myThread state: "+state);		//NEW
		
		//2. myThread����
		myThread.start();		//Thread ���۽� cpu���� ����
		state = myThread.getState();
		System.out.println("myThread state: "+state);		//RUNNABLE
		
		//3. myThread����
		
			//myThread.join();    �� ������{main}�� ����ϰ�, myThread�� ó���϶�.
		try {myThread.join();} catch (InterruptedException e) {}
		state = myThread.getState();
		System.out.println("myThread state: "+state);		//TERMINATED
		
		//4. 
		
	}

}
