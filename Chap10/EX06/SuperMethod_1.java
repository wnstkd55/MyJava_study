package Chap10.EX06;

//super Ű���� : �θ�Ŭ������ ��Ī, (�޼ҵ峻�ο��� ���, ������ ���ο����� ���.
//super()	:	������ ���ο����� ���. �θ�����ڸ� ȣ���Ҷ� ���
				//�ݵ�� ù���ο� ��ġ.
//this Ű���� : �ڽ��� ��ü�� ��Ī, �޼ҵ� ���ο��� ���, ������ ���ο��� ���, �ʵ��̸��տ��� ���, �޼ҵ� �̸��տ��� ���
//this()	:	������ ���ο����� ���, �ڽ��� Ŭ������ �ٸ� �����ڸ� ȣ��
				//�ݵ�� ù���ο� ��ġ,
class AAA{
	AAA(){
		System.out.println("AAA ������");
	}
}

class BBB extends AAA{
	BBB(){
		super();
		System.out.println("BBB ������");
	}
}
class CCC{
	CCC(){}
	CCC (int a){
		System.out.println("CCC������");
	}
}

class DDD extends CCC{
	DDD(){
		super();
	}
	DDD(int a){
		super(3);
		System.out.println("DDD������ ����1: "+a);
	}
}

public class SuperMethod_1 {

	public static void main(String[] args) {
		//1. ��ü����
		AAA aaa = new AAA();	//�⺻ ������ ȣ��
		System.out.println("===============================");
		
		
		
		BBB bbb = new BBB();	//�⺻������ ȣ��
		System.out.println("===============================");
		
		
		/*
		DDD ddd = new DDD();		//�⺻������ ȣ��
		System.out.println("===============================");		�������� ��� ����� �ȵȴ�.
		*/
		
		
		DDD eee = new DDD(5);
		
		
		
	}

}
