package chap06_07.EX02;

class Abc{
	int m = 3;		//�ʵ�(Heap�� ����)
	int n = 4;
	
	void work1(){		//�޼ҵ� (��ǲ���� ���� �޼ҵ�)
		int k =5;				// �������� : (Stack ������ ����), �޼ҵ尡 ����� ��������.
		System.out.println(k);
		work2(3); //�ٸ� �޼ҵ� ȣ��
	}
	void work2(int i) {
		int j =4;		//���� ����(Stack ������ ������ ���� ����)
		System.out.println(i+j);
		
		int l;		//���������̹Ƿ� �����ʱ�ȭ�� �����ʴ´�.(Stack)
		//l=0;		//���������� �ʱⰪ�� �ݵ�� �Ҵ�.
		//System.out.println(l);
	}
}

public class FieldComponent {

	public static void main(String[] args) {
		Abc abc = new Abc();
		
		System.out.println(abc.m);
		System.out.println(abc.n);
	}

}
