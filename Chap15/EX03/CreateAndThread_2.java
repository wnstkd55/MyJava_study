package Chap15.EX03;

//2��° ������
class SMIFileThread extends Thread{		//�ڸ� ���� ó���ϴ¾�����
	@Override
	public void run() {
		//1 �ڸ� ��ȣ ���
		String[] strArray = {"�ϳ�","��","��","��","�ټ�"};
		try {Thread.sleep(10);} catch(InterruptedException e1) {}	//0.01�� ������
		for(int i =0; i < strArray.length; i++) {
			System.out.println(" - �ڸ� ��ȣ "+strArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}	//0.2�� ������
		}
	
	}
}
//3��° ������
class VideoFileThread extends Thread{		//���� �������� ó���ϴ� ������
	@Override
	public void run() {
		//2. ���� ������ ���
		int[] intArray = {1,2,3,4,5};
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(" - ���� ������" + intArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}	//0.2�� ������
		}
	}
}



public class CreateAndThread_2 {
	
//1. ���ν�����	
	
	public static void main(String[] args) {
		//SMIFileThread��ü ����
		
		//VideoFileThread��ü ����
		
	}

}
