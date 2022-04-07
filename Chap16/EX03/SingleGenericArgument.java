package Chap16.EX03;

//Object : ��� ��ü�� ������ �� ������...�ٿ� ĳ������ �ʿ�, ĳ���ý� ���ܰ� �߻��� �� �ִ�.(���� Ÿ�� üũ)
//���ʸ� Ŭ���� : �ϳ��� Ŭ�������� �پ��� ������ Ÿ���� ó���� ���ִ�.
	//���ʸ� Ÿ�� ���� : T(Ÿ��), K(Key) V(Value), N(Number,����), E(Element)
		// -A ~ Z ���Ƿ� ���� �� �ִ�.
		//wrapper Ŭ���� : �⺻Ÿ���� ��üȭ ���ѳ��� Ŭ����
			//int(�⺻Ÿ��) ==> Integer(��ü), boolean ==>Boolean, char==>Character,
			//double ==> Double, float ==>Float
			//byte ==> Byte, short ==> Short, long ==> Long


//���ʸ� Ŭ����

class MyClass<T>{
	private T t;
	
	public T get() {	//getter �ʵ��� ���� ��������
		return t;
	}
	public void set(T t) {	//Setter�ʵ��� ���� �Ҵ�
		this.t = t;
	}
}

public class SingleGenericArgument {

	public static void main(String[] args) {
		//���ʸ� Ŭ���� ��ü ����
		
		//1. ���ʸ� Ŭ���� ��ü ����<String>�� �Է�
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("�ȳ�");
		System.out.println(mc1.get());
		
		//2. ���ʸ� Ŭ���� ��ü ����<Integer>�� �Է�
		
		MyClass<Integer>mc2 = new MyClass<Integer>();		//wrapperŬ������ �Ҵ��ؾ� �Ѵ�.
		mc2.set(100);
		System.out.println(mc2.get());
		
		//3. ���ʸ� Ŭ���� ��ü ����<Integer>�� �Է�
		MyClass<Double> mc3 = new MyClass();		//�������� �ڷ����� ���� �����ϴ�.
		mc3.set(333.33);
		System.out.println(mc3.get());
		
		//4. ���� Ÿ�� üũ(������ �ܰ迡�� ������ �������)
		MyClass <Boolean> mc4 = new MyClass<Boolean>();
		mc4.set(true);
		mc4.set(false);
	}

}
