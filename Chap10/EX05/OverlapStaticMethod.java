package Chap10.EX05;

class AAAA{					//static �޼ҵ� : �������̵� �����ʴ´�.
	static void print() {
		System.out.println("AŬ����");
	}
}

class BBBB extends AAAA{
	static void print() {
		System.out.println("BŬ����");
	}
}

public class OverlapStaticMethod {

	public static void main(String[] args) {
		//1. ��ü �������� ȣ��
		AAAA.print();
		BBBB.print();
		System.out.println("==============");
		
		//2. ��ü ������ ȣ��
		AAAA aaaa = new AAAA();		
		aaaa.print();				//A class
		BBBB bbbb = new BBBB();
		bbbb.print();				//B class
		AAAA aabb = new AAAA();
		aabb.print(); 				//A class	static �޼ҵ�� �������̵� ���� �ʴ´�.
	}

}
