package Chap13.EX07.EX1;

//2. �������̽��� �߻�޼ҵ带 ������ <<�͸���Ŭ����>>�� ȣ�� : �ѹ��� ����� ���
interface A{		//�������̽�, �߻�޼ҵ带 ����
	public abstract void cry();		//�߻�޼ҵ�, public abstract
	void fly();
}

class B{
	A a = new A() {		//�������̽��� ��üȭ �� �� ����. ������ �͸� ���� Ŭ������ �����ؼ� ����.
		//A �������̽��� ������ �ڽ�Ŭ���� ��� : Ŭ�����̸��� ����.(�����Ϸ��� ������ �̸����� �ڵ����� �Ҵ�.)
		public void cry() {
			System.out.println("�۸�");
		};
		public void fly() {
			System.out.println("���� ���� ���մϴ�.");
		};
	};		 
	void abc() {
		a.cry();
		a.fly();
	}
	
}


public class AnonymousClass_2_1 {

	public static void main(String[] args) {
		B b = new B();
		b.abc();
	}

}
