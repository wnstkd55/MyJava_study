package Chap13.EX09;

//�Ű������� �޾Ƽ� ó�� : �������̽��� ������ Ŭ����(x),

interface A{
	void abc();		//public abstract
}

class C{
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_4 {

	public static void main(String[] args) {
		C c = new C();
		//3. �������̽��� ������ Ŭ����(X) + �������� ����(O)
		A a = new A() {		//�������̽��� ������ �ڽ� �͸�ü���� �� Ÿ���� A�� ������ �������� ����
			public void abc() {
				System.out.println("Ŭ����(X) + �������� ����(O)");
			}
		};
		c.cde(a); 		//���������� �Ű������� ����
		//4. �������̽��� ������ Ŭ����(X) + �������� ����(X)		<<====���� ���� ���(�ӽ÷� �ѹ��� ����Ҷ�)
					//�̺�Ʈ ó�� ���.
		
//		c.cde(new A() {
//			public void abc() {System.out.println("Ŭ����(X) + �������� ����(X)");
//		});
//	}
//
	}
}
