package Chap13.EX06;

class A{
	C c = new B();		//C Ÿ��, �ν��Ͻ� ���� c
	void abc() {
		c.bcd();
	}
}

class B implements C{
	@Override
	public void bcd() {
		System.out.println("�ν��Ͻ� �̳� Ŭ����");
	}
}

interface C{				//�������̽�, �߻�޼ҵ� ���� : void bcd()
	public abstract void bcd();
}

public class AnonymousClass {

	public static void main(String[] args) {
		//1. ��ü ���� �� �޼ҵ� ȣ��
		A a = new A();
		a.abc(); 		//�ν��Ͻ� �̳� Ŭ����
		
	}

}
