package Chap14.EX07;

//Exception - Checked Exception - ������ ���� , �ݵ�� ����ó��
//			- unChecked Exception - RunTime Exception - ����ÿ� ����, 
//���� ó�� ��� - try catch	- �ڽ��� ���� ���ܸ� ó��
//			 - throws	- ����ó���� �̷�°�, �޼ҵ������� ���ܸ� �޼ҵ� ȣ��� ȣ���ϴ� �ʿ� �̷�°�
//				throw : ���ܸ� ���� �߻�.

//���� �޼��忡 ���ܸ� ó���ϴ� ���

//1. Exception�� �߻��Ǵ� �޼��� ���ο��� �ڽ��� ���� ���ܸ� ó���ϴ� ���
class A{
	void abc() {
		bcd();	//bcd(); ȣ��
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");	//�Ϲݿ��� ClassNotFoundException
			Thread.sleep(1000);		//ms : 1000,	1��		//�Ϲݿ���
		} catch (ClassNotFoundException | InterruptedException e) {
		}	
			//Class.forName : �����ε� - �����Ͻÿ� üũ���� �ʰ� �����Ҷ� ��ü�� �����ϴ��� Ȯ��
				//����� Ŭ���� �����������Ҽ��� �ְ� �������� �������� �ֱ� ������ ����ó���� �ؾ��Ѵ�.
	}
}

//2. Throws�� ����ؼ� Exception�� �̷�� ���
class B{
	void abc() {
		
		
		try {
			bcd();
		} catch (ClassNotFoundException | InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	//bcd()�޼ҵ带 ȣ���ϴ� ���� ���ܸ� �̷�ڴ�
	void bcd() throws ClassNotFoundException, InterruptedException {
		Class cls = Class.forName("java.lang.Object");	//�Ϲݿ��� ClassNotFoundException
		Thread.sleep(1000);		//ms : 1000,	1��		//�Ϲݿ���
	}
}

public class ThrowsException_3 {

	public static void main(String[] args) {
		
	}

}
