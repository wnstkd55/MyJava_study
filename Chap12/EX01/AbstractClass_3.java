package Chap12.EX01;

abstract class D {		//Ŭ���� ���ο� �߻� �޼ҵ尡 �� ��� abstract Ŭ������ �Ǿ���Ѵ�.
					//�ڽ� Ŭ�������� �ݵ�� �������� �޼ҵ带 ������ �ϴ°��� ����.
	abstract void print();		//�߻�޼ҵ� : �����ΰ� ����, ���� �� �޼ҵ�
}

class E extends D{		//�ڽ� Ŭ������ �߻�Ŭ������ �޼ҵ带 ������
	
	@Override
	void print() {
		System.out.println("E Ŭ������ print()");
		
	}
}

public class AbstractClass_3 {

	public static void main(String[] args) {
		//1. ��üȭ �ؼ� ���.(��ü 3�� ������ print() �޼��� ���
			//�Ź� ���� ����ϴ� ���
		D d1 = new E();
		D d2 = new E();
		D d3 = new E();
		// �޼ҵ� ȣ��
		d1.print();
		d2.print();
		d3.print();
		System.out.println("============================");
		
		//2. �͸� Ŭ������ �����ؼ� ��� (print() �޼��� 3�� ���)
			//��ü ���� ���� �ӽ÷� ����ϴ� ���
		
		//�߻� Ŭ������ ��üȭ �� �� ����. �͸� Ŭ������ ������ ��밡��
		D d4 = new D() {
			//D �߻�Ŭ������ �ڽ�Ŭ���� ����(
			@Override
			void print() {
				System.out.println("�͸� Ŭ����1");
				
			}
		};
		D d5 = new D() {
			@Override
			void print() {
				System.out.println("�͸� Ŭ����2");
				
			}
		};
		D d6 = new D() {
			@Override
			void print() {
				System.out.println("�͸� Ŭ����3");
				
			}
		};
		
		d4.print();
		d5.print();
		d6.print();
	}

}
