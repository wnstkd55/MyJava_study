package Chap16.EX09;

//���ʸ� �޼ҵ��� ���� ���� :

class A {	//�Ϲ� Ŭ�������� ���ʸ� �޼ҵ�
	
	//Number : Boolean, Character�� ������ 6���� Ÿ��(Byte, Short, Integer, Long, Float, Double)
	public <T extends Number> void method1 (T t) {
		System.out.println(t.intValue()); 	// Number Ÿ���� �޼ҵ�. t.intValue(), ������ ���
	}
}

interface MyInterface {
	void print();	//public abstract ���� (�߻�޼ҵ�)
}

class C implements MyInterface{		//�������̽��� ������ Ŭ����
	
	public void print() {
		System.out.println("�������̽��� ������ Ŭ���� - ���");
	}
}


class B{		//���ʸ� Ÿ�� ���ο��� �������̽��� �����Ҷ��� extendsŰ�� ����Ѵ�.
	public<T extends MyInterface> void method2(T t) {	//T Ÿ�Կ� �ü��ִ°��� MyInterface�� ������ Ŭ������ �ü��ִ�
		t.print();
	}
}

class D{
	public<T extends String> void abc(T t ) {
		System.out.println(t); 				//String�� toString()�� ������ �Ǿ��ִ�.
		System.out.println(t.toString());
	}
}

public class BoundedTypeOfGenericMethod {

	public static void main(String[] args) {
		A a = new A(); 		//�Ϲ� Ŭ���� ��ü ���� �� ���ʸ� �޼ҵ� ȣ��
		a.<Double>method1(5.8);
		a.method1(22.5);		//�Ű������� ������ ���� Ÿ���� �ĺ� �� �� �ִ� ��� ���� ����
		a.<Long>method1(1000000L);		//Long
		a.<Float>method1(100.1234F);	//Float
		//a.<Boolean>method1(false);		//�����߻�(Character, Boolean�� NumberŸ�Կ� ���⶧����)
		
		B b = new B();		//
		
		//Method2�� �Ű������� �ü� �ִ°��� Interface Ÿ��, �������̽��� ������ �ڽ�Ŭ����
		//�������̽��� ������ ���� �͸� Ŭ����
		b.<MyInterface>method2(new MyInterface() {

			@Override
			public void print() {System.out.println("print() �͸� Ŭ������ ���");};
			
		}
												
		);
		
		b.<MyInterface>method2(new C()); 	//�Ű������� �������̽��� ������ �ڽİ�ü�� ���� �� �ִ�.
		
		//�͸� Ŭ������ ���ʸ� �޼ҵ� ȣ�� �� �Ű������� �����ֱ�
		
		b.method2(new MyInterface() {
			
				@Override
				public void print(){
					System.out.println("�͸����� ó���� Ŭ���� ���");
					
			}
		});
		
		D d =new D();
		d.<String>abc("�ȳ�");
		d.abc("�ϼ���");
		
	}

}
