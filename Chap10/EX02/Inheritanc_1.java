package Chap10.EX02;

class Aa{
	int m;
	void abc() {
		
	}
}

class Bb extends Aa{
	int n;
	void bcd() {
		
	}
}

public class Inheritanc_1 {
	public static void main(String[] args) {
		//Ÿ��ĳ������ �������� ���
		Bb b = new Bb();		//b�� Aa, Bb���� �Ѵ�.		Aa, Bb�� �ʵ�� �޼ҵ� ��� ��밡��
		b.m = 10;	//�θ��ʵ�
		b.n = 20;	//�ڽ� �ʵ�
		b.abc();	//�θ� �޼ҵ�
		b.bcd();	//�ڽ� �޼ҵ�
		
		//��ĳ���� : �ڽ� = > �θ�		: AaŸ�԰�, Bb�� Ÿ�� ��� ���������� Aa
		Aa a = new Bb();
		a.m = 100;
		//a.n = 200;
		
		Bb bb6 = (Bb) a;	//Aa[a] --> Bb[bb6] Ÿ������ �ٿ�ĳ����
		bb6.m =100;
		bb6.n =200;
		
	}

}
