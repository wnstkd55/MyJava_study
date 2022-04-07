package Chap11.EX05;

//�߻� Ŭ������ ����ؼ� ��� �����ϴ� ���

abstract class Animal{
	abstract void cry();		//�߻� �޼ҵ� : ���� �Ǿ��ְ� �����ΰ� ���� �޼ҵ�
}
class Cat extends Animal{
	
	@Override
	void cry() {
		System.out.println("�߿�");
		
	}
}

class Dog extends Animal{

	@Override
	void cry() {
		System.out.println("�۸�");
		
	}
	
}

public class AbstractModifier_3 {

	public static void main(String[] args) {
		
		Animal a1 = new Cat();		//�߻� Ŭ������ Ÿ�����δ� ������ �� ����.
		Animal a2 = new Dog();
		
		a1.cry();
		a2.cry();
		
		//�߻� Ŭ������ ��üȭ �� �� ����.
//		Animal a3 = new Animal();	//�߻�Ŭ������ ��üȭ �� �� ����.
		
	}

}
