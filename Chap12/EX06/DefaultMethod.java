package Chap12.EX06;

// Interface�� default �޼ҵ� : �������̽� ������ �����ΰ� �ִ� �޼ҵ�
	//������ �����Ǿ��ִ� �������̽����� ���ο� ����� �߰��� �� ���� Ŭ�������� ������ �ʿ���� ���ο� ����� �߰��Ҷ� ���.


	//public default void bcd(){}	
		//java 1.8�̻󿡼� ���Ӱ� �߰��� ���...

	//default Ű�� �־�� �Ѵ�. default�� ���� �����ڰ� �ƴϴ�.

interface A{
	void abc();		//2020�� ���� �޼ҵ�,	public abstract�� ������. �����ΰ� ���� �߻� �޼ҵ�
	default void bcd() {	//2030 ���� �޼ҵ�
		System.out.println("A�������̽���bcd()");
	}
	// void ttt();	// ���� Ŭ�������� ���ο� �߻� �޼ҵ� ��ӵ� ��� ���� Ŭ������ �����߻�
}

class B implements A {		//2005�� ������ Ŭ����
	public void abc() {
		System.out.println("BŬ������ abc()");
	}
}

class C implements A{
	public void abc() {
		System.out.println("CŬ������ abc()");
	}
	public void bcd() {			//default�޼ҵ嵵 �������̵��Ҽ��ִ�.
		System.out.println("CŬ������ bcd()");
	}
}

public class DefaultMethod {
	public static void main(String[] args) {
		//1. ��ü ����
		A a1 = new B();
		A a2 = new C();
		
		//2. �޼��� ȣ��
		a1.abc();		//
		a1.bcd();
		
		a2.abc();
		a2.bcd();
	}
}
