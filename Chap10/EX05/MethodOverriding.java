package Chap10.EX05;

class A{	
	A(){}//�⺻ ������ : Ŭ���� ���� �ٸ� �����ڰ� �������� ������� ���� ����
	
	//�ν��Ͻ� �޼ҵ� : ��Ӱ��迡�� �޼ҵ� �������̵��� �ν��Ͻ� �޼ҵ常 �������̵��ȴ�.
		//��Ӱ��迡�� �ν��Ͻ� �ʵ�, stack�ʵ�, static�޼ҵ�� �������̵� ���� �ʴ´�.
		//�������̵��Ҷ��� �ñ״��İ� ���ƾ��Ѵ�. ����Ÿ��, �޼ҵ��, �Ű�����Ÿ��, �Ű����� ����
	void print() {
		System.out.println("Class A���");
	}
}

class B extends A{
	
	@Override
	void print() {
		System.out.println("Class B���");
	}
	
}

class C extends A{
	@Override
	void print() {
		System.out.println("Class C���");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		//1. AŸ��, A ������
		A a = new A();
		a.print();
		
		//2. BŸ��, B������
		B b = new B();
		b.print();
		//3. CŸ��, C������
		C c = new C();
		c.print();
		
		System.out.println("==========================");
		//4. AŸ��, B������( �������̵� �Ǿ� A�� print() ȣ���, B�� print() ��µ�.
		A ab = new B();
		ab.print();		//A�� print() �޼ҵ� ȣ��	==> B�� print()�� ��µ�
		
		A ac = new C();
		ac.print();		//A�� print() ȣ��	==> B�� print�� ��µ�
		
		A[] arr = {ab,ac};	//	�迭�� AŸ���� ��ü�� ����
		System.out.println("=========================");
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
		}
		System.out.println("========================");
		for(A k : arr) {
			k.print();
		}
	}

}
