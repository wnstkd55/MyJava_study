package chap06_07.EX04;

/*������ this Ű���� �ڵ� �߰�*/
// 1. Ŭ���� ���ο��� �ʵ�, �޼ҵ�տ� �ڵ����� thisŰ���尡 ����.
		// this Ű�� �ڱ��ڽ��� ��ü�� �ʵ�� ��ü�� �޼ҵ带 ��Ī, 


class A{
	int m;			// m = 2
	int n;			// n = 3
	
	//A() {}		//�⺻�����ڰ� �����Ǿ��ִ�.
	
	void init(int a, int b) {
		int c;				//a, b, c�� ��������(Stack ������ ������� ���� ������.)
		c = 3;					//init()�޼ҵ� �����ÿ� stack�����ǰ� �޼ҵ尡 ������ �Ҹ�
		this.m = a;			//this Ű�� ������, �����Ϸ��� �ڵ����� �߰�
		this.n = b;			//this Ű�� ������, �����Ϸ��� �ڵ����� �߰�
	}
	void work() {
		this.init(2, 3); 	//this Ű�� ������, �����Ϸ��� �ڵ����� �߰�
		System.out.println(this.m + " , " + this.n); 	//this���� ����, ������ �����Ϸ��� �ڵ����� �߰�
	}
}

public class ThisKeyword_1 {

	public static void main(String[] args) {
		//2. ��ü����
		A a = new A();
		
		//3. �޼��� ȣ��
		a.work();
		
		
	}

}
