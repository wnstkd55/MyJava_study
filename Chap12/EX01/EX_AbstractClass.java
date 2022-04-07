package Chap12.EX01;

abstract class Abc{
	abstract void cry();
	abstract void fly();
}

class Cat extends Abc{
	@Override
	void cry() {
		System.out.println("����̴� �߿�");
	}
	@Override
	void fly() {
		System.out.println("����̴� �������մϴ�.");
	}
}

class Eagle extends Abc{
	@Override
	void cry() {
		System.out.println("�������� ���");
	}
	@Override
	void fly() {
		System.out.println("�������� �� �� �ֽ��ϴ�.");
	}
}

public class EX_AbstractClass {

	public static void main(String[] args) {
		//1. �ڽİ�ü Cat,Eagle Ŭ���� ������ ���
		Abc cat1 = new Cat();
		Abc eagle1= new Eagle();
		
		cat1.cry();
		cat1.fly();
		eagle1.cry();
		eagle1.fly();
		
		System.out.println("====================");
		//2. �͸� Ŭ���� ������ ���,
		
		Abc cat2 = new Cat() {
			void cry() {
				System.out.println("����̴� �߿�");
			}
			void fly() {
				System.out.println("����̴� �������մϴ�.");
			}
		};
		Abc eagle2 = new Eagle() {
			void cry() {
				System.out.println("�������� ���");
			}
			void fly() {
				System.out.println("�������� �� �� �ֽ��ϴ�.");
			}
		};
		
		cat2.cry();
		cat2.fly();
		eagle2.cry();
		eagle2.fly();
		
		
	}

}
