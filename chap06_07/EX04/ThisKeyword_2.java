package chap06_07.EX04;

// ����� this Ű���� �߰� : �ݵ�� this key�� ����ؾ� �Ǵ� ��� : 
class Aa{	// this key�� ������� �ʴ� ��� : ���������� �ν�
	int m;
	int n;
	void init(int m, int n) {
		m=m;		//thisŰ�� ������� �ʴ� ��� m <==�������� m
		n=n;		//thisŰ�� ������� �ʴ� ��� n <==�������� n
	}
}

class Bb{		//this key�� ����ϴ� ���
	int m;
	int n;
	void init(int m, int n) {
		this.m = m;		// this Ű�� ��������� �ݵ�� ����ؼ� m�� �ʵ��� m �̶�� �˷��ߵ�.
		this.n = n;		// 
	}
	
}

public class ThisKeyword_2 {
	
	public static void main(String[] args) {
		
		// 1. �ʵ��� ��� ���������� ���� ���� ���( this Ű���带 ������� �ʴ°�� : ���������� ����)
		Aa aa = new Aa();
		aa.init(2, 3); 			//
		System.out.println(aa.m);	//0
		System.out.println(aa.n);	//0
		// 2. �ʵ��� ��� ���������� ���� ���� ���(this Ű���带 ����ϴ� ��� : �ʵ庯���� ���� )
		Bb bb = new Bb();
		bb.init(2, 3);
		System.out.println(bb.m);	//2
		System.out.println(bb.n);	//3
		
		
		
		
	}

}
