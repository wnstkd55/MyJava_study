package Chap10.EX06.EX01;

//�ڽ� ��ü�� �����Ҷ� �θ�Ŭ������ �⺻�����ڸ� ���� ȣ�� : super()
//��� �ڽ� ��ü�� �����ڿ��� super() �����Ǿ��ִ�.



class A {

	A(){
		System.out.println("A class�� �⺻������");
	}
	
	A(int a){
		System.out.println("A class�� �Ű����� ���� 1 ������"+a);
	}
	A(int a, int b){
		System.out.println("A class�� �Ű����� ���� 2 ������"+a+b);
	}
}

class B extends A{
	B(){
		//super(5,3);
		System.out.println("BŬ������ �⺻ ������");
	}
	B(String a){
		super(3,5);
	}
}
class C extends B{
	C(){
		super("c���� ȣ��");
		System.out.println("CŬ������ �⺻������");
	}
}

public class SuperMethod_2 {

	public static void main(String[] args) {
		C c = new C();
		
	}

}
