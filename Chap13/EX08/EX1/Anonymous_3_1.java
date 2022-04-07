package Chap13.EX08.EX1;

//3. �޼ҵ��� �Ű������� ���� :
//	3-1 : ��ü ������ �Ű������� ���� (Ŭ������ O, + �������� O)
//	3-2 : ��ü ������ �Ű������� ���� (Ŭ������ O, + �������� X)
interface A{		//�������̽�, �߻�޼ҵ带 ����
	public abstract void cry();		//�߻�޼ҵ�, public abstract
	void fly();
}

class B implements A{	//B�� A�������̽��� ������ Ŭ����
	@Override
	public void cry() {
		System.out.println("�۸� : �Ű����� ������ ���");
	}
	@Override
	public void fly() {
		System.out.println("�������մϴ� : �Ű����� ����");
	}
}

class C{		//C ��ü�� abc�޼ҵ� ȣ��� AŸ���� �Ű������� �޴´�.
	void abc(A a) {	//���� �ڽ� Ŭ������ �Ű������� ���� ��� AŸ������ �ڵ����� ��ĳ������ �ȴ�.
		a.cry();
		a.fly();
	};
}


public class Anonymous_3_1 {

	public static void main(String[] args) {
		
		//1. Ŭ������ ���� O + �������� O  
		C c = new C();
		A a = new B();	//B�� ��üȭ �ؼ� AŸ������ ����, a : ���� ����
		
		
		c.abc(a);
		System.out.println("==========================");
		//2. Ŭ������ ���� O + �������� X
		c.abc(new B());
		
	}

}
