package Chap10.EX05;

class AAA{		//Static�ʵ�� �������̵������ʴ´�.
	static int m=3;
	
}
class BBB extends AAA{
	static int m=4;
}

public class OverlapStaticField {

	public static void main(String[] args) {
		//1. ��ü ���� ���� ȣ��(Ŭ���� ������ ȣ��)	<==�������
		System.out.println(AAA.m);	//3
		System.out.println(BBB.m);	//4
		
		//2. ��ü ���� �� ȣ��
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		AAA abb = new AAA();
		
		System.out.println(aaa.m);	//3
		System.out.println(bbb.m);	//4
		System.out.println(abb.m);	//3		//static �ʵ� : �������̵� ���� �ʴ´�.
		
		
	}

}
