package Chap13.EX07;

//�͸� �̳�Ŭ������ ����Ͽ� �������̽� ��ü ����

class A{
	C c = new C() {		//�͸� �̳� Ŭ����
		public void bcd() {
			System.out.println("�͸� �̳� Ŭ����");
		};
	};	//CŸ��, �ν��Ͻ� ����c
	void abc() {
		c.bcd();
	}
}

interface C{				//�������̽�, �߻�޼ҵ� ���� : void bcd()
	public abstract void bcd();
}

public class AnonimousClass_2 {

	public static void main(String[] args) {
		//1. ��ü ���� �� �޼ҵ� ȣ��
		A a = new A();
//		a.bcd();
		
	}

}
