package Chap13.EX08;

//Ŭ���� ���� �� ���� ������ ���/ �̻���� ��� �Ű������� ��ü�� ����

interface A{
	public abstract void abc();
	
}
//1. �ڽ� Ŭ������ ���� ����
class B implements A{
	@Override
	public void abc(){
		System.out.println("�Ű����� ����");
	}
}

class C{	// cde�޼ҵ忡 input������ AŸ���� ��üa�� �޾Ƽ�
	void cde(A a) {		//cde �޼ҵ带 ȣ���ϸ鼭 �Ű������� AŸ���� ��ü�� ����
		a.abc();
	}
}
public class AnonimousClass_3 {

	public static void main(String[] args) {
		//1 ��� : Ŭ������ 0 + ���� ������ 0
		C c = new C();		
		A a = new B();		//Ŭ������(A), ������������(a)			<=========ù��° ���
		
		c.cde(a);		//�Ű������� ��ü a�� �����ؼ� ������
		
		System.out.println("============================");
		//2 ��� : Ŭ������ 0 + ���������� X
		c.cde(new B());		//
		
		
	}

}
