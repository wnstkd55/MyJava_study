package chap06_07.EX06;

import chap06_07.EX05.A;

public class EX_A {

	public static void main(String[] args) {
		
		
		//�ٸ� ��Ű���� ��ü�� ����ϴ� ���
			//1. ��ü Ŭ���� �̸��� ���
		chap06_07.EX05.A a = new chap06_07.EX05.A();	//Ŭ������ ��ü�̸��� ��� : ��Ű����.Ŭ������
		
		//a.m = 10; // ���� �Ұ� : default �� �ٸ� ��Ű���� Ŭ���������� ������ �Ұ�.
		
		a.k = 50;	
		a.print2();
		
		//2. import�� ����ؼ� �����ϴ� ���
		
		A aa = new A();
		aa.k = 100;
		aa.print2();
		
		
		
	}

}
