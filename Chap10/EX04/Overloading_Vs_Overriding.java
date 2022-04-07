package Chap10.EX04;

//�޼ҵ� �����ε�(Method Overloading) vs �޼ҵ� �������̵�(Method Overriding)
/*
 * 1. �޼ҵ� �����ε� : ������ �޼ҵ� �̸�����(�Ű����� Ÿ��, �Ű����� ��)�� ���� �ش� �޼ҵ尡 ȣ��
 * 		--��Ӱ��� ������ ����. �����ڿ��� ���� ���....
 * 2. �޼ҵ� �������̵� : �ݵ�� ��Ӱ��迡�� ���.
 * 		�θ��� �޼ҵ带 �ڽĿ��� ���Ӱ� �����ؼ� ���
 * 			1)��Ӱ���, 2) �޼ҵ��� �ñ״��İ� ���ƾ� �Ѵ�.(�޼ҵ��, �Ű����� ����, �Ű����� Ÿ��)
 * 			3) �ڽĿ��� �θ��� ���� �����ڿ� ���ų� �� ���� ���������Ѵ�. 
 */

class Ab{
	void print1() {		//�������̵�
		System.out.println("Ab Ŭ������ print1()");
	}
	void print2() {		//���� �ε�
		System.out.println("AbŬ������ print2()");
	}
}
class Bc extends Ab{
	@Override
	void print1() {
		System.out.println("BcŬ������ print1()");
	}
	void print2(int a) {		//�����ε�
		System.out.println("BcŬ������ print2()");
	}
}


public class Overloading_Vs_Overriding {

	public static void main(String[] args) {
		
		//1. AbŸ�� ����
		Ab aa = new Ab();
		aa.print1(); 		//A Ŭ������ print1ȣ��
		aa.print2();		//A Ŭ������ print2ȣ��
		System.out.println("====================");
		//2. Bc Ÿ�� ����, ������ ȣ�� Bb
		Bc bb = new Bc();
		bb.print1();	// BcŬ������ print1�� ȣ��
		bb.print2(); 	// Ab Ŭ������ print2() ȣ�� : �θ�Ŭ������ �޼ҵ� ȣ��
		bb.print2(3);	// BcŬ������ print2(int a)ȣ�� : �ڽ�Ŭ������ �޼ҵ� ȣ��
		System.out.println("====================");
		
		//3. AbŸ������ ���� + BcŸ�� ������ ȣ��
		Ab cc = new Bc();
		cc.print1();	// �޼ҵ� �������̵��� �Ǿ������Ƿ� ���� ���ε��� ���ؼ� Bc�� print1()�� ȣ�� 
		cc.print2(); 	// AbŬ������ �޼ҵ常 ȣ���� ����
	}

}
