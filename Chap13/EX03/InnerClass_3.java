package Chap13.EX03;

class A{
	int a = 3;	//�ν��Ͻ� �ʵ�  ��üȭ�ؾ� ��밡��
	static int b = 4;	//static �ʵ�, ��ü �������� ����, ��ü ������ ����
	void method1() {	//�ν��Ͻ� �޼ҵ� : ��ü ���� �� ����
		System.out.println("�ν��Ͻ� �޼ҵ�");
	}
	static void method2() {	// static �޼ҵ�, ��ü�� �������� �ʰ� ����, ��ü ������ ����
		System.out.println("static �޼ҵ�");
	}
	static class B{		//static �̳�Ŭ���� : �ܺ� ��ü�� �������� �ʰ� ��ü �����̰����ϴ�.
		
		void bcd() {
			//1. static Ŭ�������� �ܺ� Ŭ������ �ν��Ͻ� �ʵ� ����(���ٺҰ�)
			//System.out.println(a); 		//�ܺ� Ŭ������ �ν��Ͻ� �ʵ�(���ٺҰ�)
			System.out.println(b); 		//static �̳�Ŭ�������� �ܺ� Ŭ������ static�ʵ峪 �޼ҵ� ���� ����
			//2. �޼ҵ� ȣ��
			//method1();		//�ν��Ͻ� �޼ҵ�� ȣ�� �Ұ�
			method2();		//static �޼ҵ�� ȣ�� ����
		}
		
	}
}

public class InnerClass_3 {

	public static void main(String[] args) {
		
		
		
	}

}
