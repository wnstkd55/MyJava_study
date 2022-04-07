package chap06_07.EX01;

//Ŭ����(class) : ���赵, �ؾ�� Ʋ
//��ü(object) : Ŭ������ �����ؼ� RAM(�޸�)���� �۵��Ǵ� �����ڵ�(��, �ؾ)
	//��ü = �ν��Ͻ�
	//�ν��Ͻ�ȭ (��üȭ) ��Ų��.
	//A a = new A();	<== ũ������ ��üȭ���Ѽ� �޸𸮿� �ε�


class A{		//�ܺ� Ŭ����
	int m = 3;		// m : �ʵ� (����) : Ŭ�������(��)���� ����� ������ �ʵ�� �Ѵ�.
					//�ʵ�� �ν��Ͻ�ȭ(��ü)���Ѿ� ����� �� �ִ�. (���� �޼ҵ忡�� ��ü�� �ν��Ͻ�ȭ ��������Ѵ�.)
					//�ʵ�� �޸��� Heap������ ����
	void print() {		//�޼ҵ� : ������������ �Լ�, ��ü������� �Լ��� �޼ҵ���Ѵ�.
		System.out.println("��ü ���� �� Ȱ��");
	}
}

class B{		//�ܺ� Ŭ����
	String name = "ȫ�浿";
	int age = 24;
	String phone = "010-1111-1111";
	
	void printName() {
		System.out.println(name);
	}
	void printAge() {
		System.out.println(age);
	}
	void printPhone() {
		System.out.println(phone);
	}
}

public class CreateObjectAndUsingOfMember {

	public static void main(String[] args) {
		
		
		A a = new A();		//Class A�� ��üȭ ��Ų��.(RAM(�޸�)�� �ε��Ų��.)
		System.out.println(a.m);
		a.print(); 
		
		System.out.println("================");
		
		A b = new A();		//Class A�� ��üȭ(�ν��Ͻ�ȭ)���Ѽ� �޸𸮿� �ε�
		System.out.println(b.m);
		b.print();
		
		System.out.println("================");
		
		A c = new A();
		System.out.println(c.m);
		c.print();
		System.out.println("================");
		
		B bb = new B();		//B Class�� bb��� �̸����� ��üȭ��Ų��.
		System.out.println(bb.name);
		bb.printName();
		bb.printAge();
		bb.printPhone();
		
		B cc = new B();
		cc.printName();
		cc.printAge();
		cc.printPhone();
	}

}
