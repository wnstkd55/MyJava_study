package Chap16.EX11;

// ���ʸ� Ŭ������ ��� : �ڽ� Ŭ������ �θ� Ŭ������ ���ʸ� ����(K,V,T,E)�� ���ų� �� ���ƾߵ�.

class Parent<T>{	//default
	T t ;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

class Child1<T> extends Parent<T>{	//���ʸ� Ŭ������ ��� �޴� �ڽ� Ŭ������ �θ��� Ÿ���� ���ڰ����� ���ų� Ŀ���Ѵ�.
	
}

class Child2<T,V> extends Parent<T>{
	
	V v;

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
	
	

}

public class InheritanceGenericClass {

	public static void main(String[] args) {
		//1. �θ� ���ʸ� Ŭ���� ����.
		
		//Parent<String> p = new Parent<String>();	//��ü �ϼ��� ����
		//Parent<String> p =new Parent();		//���� ������ ȣ���Ҷ��� ���� ����
		Parent<String> p = new Parent<>();
		
		p.setT("�θ����ʸ� Ŭ����");
		System.out.println(p.getT());
		
		Parent<Integer> i1 = new Parent();
		i1.setT(1);
		System.out.println(i1.getT());
		
		//2. �ڽ� Ŭ����1
		Child1 <String> c1 = new Child1();
		c1.setT("�ڽ�1 ���ʸ�Ŭ����");				//�θ𿡼� ��ӵ� �޼ҵ�
		System.out.println(c1.getT());			//�θ𿡼� ��ӵ� �޼ҵ�
		
		//3. �ڽ� Ŭ����2
		Child2 <String, Integer> c2 = new Child2();
		c2.setT("�ڽ�2 - ���ʸ� Ŭ����");			//�θ� Ŭ������ �޼ҵ�
		c2.setV(100);						//�ڽ� Ŭ������ �޼ҵ�
		System.out.println(c2.getT());
		System.out.println(c2.getV());
		
		
		
		
		
		
	}

}
