package Chap10.EX06;

//super Ű���� : �θ�(super) Ŭ����

class AA{
	int m;
	
	void abc() {
		System.out.println("AAŬ������ abc()");
		System.out.println(m);
	}
}

class BB extends AA{
	void abc() {
		System.out.println("BBŬ������ abc()");
	}
	void bcd() {
		super.m=300;
		super.abc(); 		//�θ��� abc ȣ��
	}
}

public class SuperKeyword_2 {

	public static void main(String[] args) {
		
		BB bb = new BB();
		bb.bcd();
	}
}
