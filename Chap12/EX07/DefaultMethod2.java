package Chap12.EX07;

interface A{	//�θ� �������̽�
	default void abc() {	//�������̽����� �����ΰ� �ִ� �޼ҵ带 ����: default
		System.out.println("A �������̽��� abc()");
	}
}

class B implements A{		  //extends Object�� ������.
	public void abc() {		 //�������̵�
		A.super.abc();		//super.abc�� ObjectŬ������ abc()ȣ��
		System.out.println("BŬ������ abc()");
	}
}

public class DefaultMethod2 {

	public static void main(String[] args) {
		//1. ��ü ����
		B b = new B();
		
		//2. �޼ҵ� ȣ��
		b.abc(); 	//B�� abc()�� ȣ��
		
		System.out.println("=======================");
		A a1 = new B();		// �������̽��� ��ü������ �Ұ�, Ÿ�� ������ ����
		a1.abc();
		
		
	}

}
