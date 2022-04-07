package Chap14.EX06;

/*
 	���� ó�� 2���� ���:
 		1. ���� ó�� : try catch
 		2. ��������(�̷��) : throws , �޼ҵ带 ȣ���ϴ� �ʿ��� ���ܸ� ó���ϵ��� ����(�̷��)
 			throw : ������ ���ܸ� �߻���Ų��.
 		
 */

class A{	//�޼ҵ� ���ο��� ����ó���� ���� ����
	void abc() {
		bcd();
	}
	void bcd() {
		
		try {
			Thread.sleep(1000); 		//�Ϲ� ���� InterruptedException
		}catch (InterruptedException e) {
			System.out.println("���ܹ߻�1");
		}
		
	}
}

class B{
	void abc() {	//bcd()�޼ҵ��� ���ܸ� ó���� �ǹ��� ������.
		try {
			bcd();
		} catch (InterruptedException e) {
			//e.printStackTrace();
			System.out.println("���ܹ߻�2");
		}	
	}
	void bcd() throws InterruptedException {	//bcd() �޼ҵ带 ȣ���ϴ� �ʿ��� ���ܸ� ó���ϵ��� �̷��.
		Thread.sleep(1000);
	}
}

public class ThrowsException {
	public static void main(String[] args) {
		A a1 = new A();
		a1.abc();
	}
}
