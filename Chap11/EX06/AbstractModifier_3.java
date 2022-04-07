package Chap11.EX06;

abstract class Animal{	//�߻� Ŭ���� : �߻�޼ҵ尡 �ϳ� �̻� ���ԵǾ��ִ°��
						//�߻�Ŭ������ ��ü ���� �Ұ�, Ÿ���� ��� ����
						//�ڽ�Ŭ������ �θ�Ŭ������ �޼ҵ带 ������ ������ ����
							//�߻�Ŭ������ �߻�Ŭ���� ���� �߻� �޼ҵ带 �ڽ� Ŭ�������� �ݵ�� �����ϵ��� ����޴´�.
	String name;
	int age;
	
	
	
	abstract void cry();		//�߻� �޼ҵ� : �����ΰ� ���� �޼ҵ�
		//void cry(){}		<== �Ϲ� �޼ҵ� : ����Ÿ�� �޼ҵ��̸�(�Է¸Ű�����){�����ڵ�}
	abstract void run();		
	
	@Override
		public String toString() {	//��ü��ü�� ��½� �޸��� ������ ���
			return "�̸�: " + name + "����: "+age;
		}
}

class Cat extends Animal{		//Cat�� Animal��� �Ϻθ� ����� ��� �߻�Ŭ����,
											//��� �߻�޼ҵ带 ������ ���� ��ũ��Ʈ Ŭ����
	Cat(String name, int age){
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {		//�߻�޼ҵ带 ������ �޼ҵ�
		System.out.println("����̴� �߿�");
		
	}

	@Override
	void run() {
		System.out.println("����̴� 4�߷ΰ���.");
		
	}
	
}

class Tiger extends Animal{

	Tiger(String name, int age){
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("ȣ���̴� ����");
		
	}

	@Override
	void run() {
		System.out.println("ȣ���̴� 4�߷� ����.");
		
	}
	
}

class Eagle extends Animal{
	
	Eagle(String name, int age){
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("�������� ���");
		
	}

	@Override
	void run() {
		System.out.println("�������� ������ ���ƴٴѴ�.");
		
	}
	
}

public class AbstractModifier_3 {

	public static void main(String[] args) {
		Animal a1 = new Cat("�����",10);
		Animal a2 = new Tiger("ȣ����",5);
		Animal a3 = new Eagle("������",3);
		System.out.println("======================");
		//1. Animal �迭��ü�� ������ 
		Animal[] arr = {a1,a2,a3};
		//2. for���� ����ؼ� ��ü�� ��������� �̸��� ���̸� ���, .cry(), run()���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name);
			System.out.println(arr[i].age+"��");
			arr[i].cry();		//��ü�� �������̵��� �޼ҵ� ���
			arr[i].run();		//Animal�� cry(), run() =======>�������̵�(�ڽ���cry(), run())
			System.out.println("========================");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("============================");
		//3. enhanced for���� ����ؼ� �̸��� ���̸� ���, .cry(), run()���
		for(Animal a : arr) {
			System.out.print(a.name);
			System.out.println(a.age+"��");
			a.cry();
			a.run();
			System.out.println("========================");
		}
	}

}
