package Chap18.EX01;

//1. �ڹٴ� ��ü�������α׷�(OOP) : ��� �Լ�(�޼ҵ�)�� ��ü ���ο� �����ؾ� �ȴ�. �Լ��� Ŭ����, �������̽� ����
//    ���ٽ� : �ڹٿ��� �Լ��� ���α׷����� �����ϵ��� �������ִ� �ϳ��� ���.
//		- ������ ������ �޼ҵ带 �����ϴ°��� �ƴ϶� �����ΰ� ���� �޼ҵ忡 ���ٽ����� ����� �ο��ؼ� �۵���Ű�� ����
//		- ���ٽ��� �������� ���� ������ ���. (���� ������ ���� �ִ��� �����ؼ� ǥ��) - ������ ������ �����ϴ�.
//		- ���ٽ��� �ڹٿ��� ���������� �͸� Ŭ������ ��ȯ�Ǿ� ó����.
//		- ���ٽ��� �Լ��� �������̽����� �͸�Ŭ������ ��ȯ�� ����
//		- ���ٽ��� �Լ��� �������̽��� ������ �͸�Ŭ������ ���ٽ����� ���.
//		- �Լ��� �������̽� : �������̽��� �� �Ѱ��� �߻�޼ҵ尡 ���ǵ� �������̽��� �Լ��� �������̽���� �Ѵ�.
//		- �ڹٴ� ���ο� �Լ� ������ �����Ѱ��� �ƴ϶� �̹� �����ϴ� �������̽��� ������ ���ٽ� ǥ��

@FunctionalInterface //  @ : ������̼�,		@FunctionalInterface : �Լ����������̽��� ����, (�߻�޼ҵ尡 1��)
interface A{ 		// <===�Լ��� �������̽�
	
	void abc();		//public abstract �����Ǿ� �ִ�.
	//void bcd();	//�޼ҵ� 1������ �Ѵ�.

}

//�������̽��� ���ǵ� �޼ҵ带 �����ϴ� ��� 1. : �������̽��� �޼ҵ带 �����ϴ� Ŭ������ ����.
class B1 implements A{
	@Override 		// �θ��� Ŭ������ ���� ���� �̸��� Ȯ�����ִ� Annotation
	public void abc() {
		System.out.println("�޼ҵ� ���� 1");
	}
}

public class OOP_VS_FP {

	public static void main(String[] args) {
		//�ڹٴ� ��ü���� ���α׷��̹Ƿ� ��� �Լ�(�޼ҵ�)�� Ŭ���� ���ο� �ְ� ��ü ������ ȣ��
		//1. ��ü���� ���α׷��� ����	
		//(1) class�� �����ؼ� ��� : ��� �޼ҵ�� ��ü ���ο� �����ϸ� ��ü�� ������ ȣ���� ����
		A A = new B1();
		A.abc();
		
		//(2) �͸� �̳�Ŭ������ �����ؼ� ���
		//�������̽��� �߻�޼ҵ带 ���� ������ Ŭ������ �������� �ʰ� �͸� �̳�Ŭ������ ����ؼ� �޼ҵ� ȣ��
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("�޼ҵ� ���� 2");
				
			}
		};
		a2.abc(); 	//oop�� ��ü ������ �޼ҵ� ȣ��
		
		//(3) ���ٽ�(�Լ���) ���α׷��� ����(���ٽ�)
		
		A a3 = () -> {System.out.println("�޼ҵ� ���� 3");}; 		//<== ���ٽ� ǥ�� ((public void �޼ҵ��) ����)
																// ���ٽĿ� ���Ǵ� �������̽��� �Լ��� �������̽����� �Ѵ�.
		a3.abc();
		
		
	}

}