package Chap10.EX06;

//super : �θ�Ŭ���� (��Ӱ��迡�� �θ�)
//this : �ڽ��� ��ü

//���� ���̵� : �θ��� �޼ҵ尡 ������ ���������ʾҴ�.

class A{
	void abc() {
		System.out.println("AŬ������ abc()");
	}
}

class B extends A{
	void abc() {
		System.out.println("BŬ������ abc()");
	}
	void bcd() {
		abc();				//this.abc	//this�� �ڽ��� ��ü
		super.abc();		
	}
}

public class SuperKeyword_1 {

	public static void main(String[] args) {
		//1. ��ü����
		B bb = new B();
		//2. �޼ҵ� ȣ��
		bb.bcd(); 	//BŬ������ 
		
		
	}

}
