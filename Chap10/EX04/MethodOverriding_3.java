package Chap10.EX04;

//�޼ҵ� �������̵��� ���� �����ڿ��� ����
	//�ڽ��� Ŭ�������� �θ��� �޼ҵ带 ������ �� ��� ������������ �θ�� ���ų� �о�� �Ѵ�.

	//public > protected > default > private
class Aaa{
	protected void abc() {
	}
}

class B1 extends Aaa{
	@Override
	public void abc() {
	}
}
class B2 extends Aaa{
	@Override
	protected void abc() {
	}
}

class B3 extends Aaa{
	//@Override
	void abcd() {}	//�����߻�	: �������̵��� �޼ҵ��� ���� ������
}

class B4 extends Aaa{
	//@Override
	protected void abc() {}		//�����߻�	: �������̵��� �޼ҵ��� ���� ������
}

public class MethodOverriding_3 {

	public static void main(String[] args) {	
	}
}
