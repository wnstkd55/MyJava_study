package chap06_07.EX05;

public class Bb {

	private int a = 1;		// private : ���� Ŭ���� �������� ���
	int b = 2;				// default : ���� ��Ű������ �ٸ� Ŭ�������� ���� ����
	protected int c =3 ;	// protected : ������Ű�������� ���� ���� + �ٸ���Ű���� ���ٰ���(��ӵ� ��츸 ����)
	public int d = 4;		// public : �ٸ���Ű������ ������ ���� 

		//private < default < protected < public

	private void print1() {		//���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
}

	void print2() {		//���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}

	protected void print3() {		//���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}

	public void print4() {		//���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}

}

