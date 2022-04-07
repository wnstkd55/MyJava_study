package Chap13.EX09.EX1;

interface A{
	void cry();
	void fly();
}

class C{
	void abc(A a) {
		a.cry();
		a.fly();
	}
}

public class AnonymousClass_4_1 {

	public static void main(String[] args) {
		//1. Ŭ������ ����(X) + �������� (O)
		C c = new C();
		
		A a = new A() {
			public void cry() {
				System.out.println("�۸�");
			}
			public void fly() {
				System.out.println("�ϴ��� �� ���ϴ�.");
			}
		};
		
		c.abc(a);
		
		System.out.println("========================");
		//2. Ŭ������ ����(X) + ��������(O)
		c.abc(new A() {

			
			public void cry() {
				System.out.println("Ŭ������ ����(X) + ��������(X)");
				
			}

			public void fly() {
				System.out.println("Ŭ������ ����(X) + ��������(X)");
				
			}

			
		});
	}

}
