package Chap12.EX03;

interface A{}	
interface B{}

//1. ���� �������̽� ���

class C implements A{}	// CŬ������ A�������̽��� ����(���)

//2. ���� �������̽� ���
class D implements A,B{}	//interface�� ���� ���� (���) ����

//3. Ŭ������ �������̽��� �ѹ��� ���	( extends �� implements�� ������ ���� �Ұ�)
class E extends C implements A,B{}	


public class Interface_3 {

	public static void main(String[] args) {
		
	}

}
