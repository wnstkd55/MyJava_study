package Chap13.EX10;
//�̳��������̽�(InnerInterface) : Ŭ���� ������ �������̽��� ����, �ܺ�Ŭ���� �����ϰ� ����� �������� Ŭ���� ���ο� ����.
	//Ŭ���� ���ο� ����.
	//static�� �ڵ����� �����Ϸ��� ���ؼ� ����.	<<=����
class A{
	interface B{	//static�� �����Ϸ��� ���ؼ� �ڵ����� �߰���
		void bcd();		//public abstract
	}
}

//�̳� �������̽��� ������ Ŭ���� C

class C implements A.B{//A.B : AŬ������ �̳��������̽�B, A,B : �������̽�,B�������̽�

	@Override
	public void bcd() {
		System.out.println("�̳��������̽��� ������ Ŭ����C");
		
	}	
	
}
public class InnerInterface_1 {

	public static void main(String[] args) {
		//1. �ڽ� ��ü�� ���� ���� �� ���(�ڽ� Ŭ������ ������ ���)
		A.B ab = new C();
		ab.bcd();
		C c = new C();
		c.bcd();
		//2. �͸� �̳� Ŭ������ ���(�ڽ� Ŭ���� ���� ���)
//		A.B b = new A.B();
	}

}
