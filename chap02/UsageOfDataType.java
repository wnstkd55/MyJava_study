package chap02;

public class UsageOfDataType {

	public static void main(String[] args) {
		//���� ����: 
			//�ڷ��� ������ ;
			//�ڷ���
		
		int a = 3;
		int b;
		b=4;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("===========================");
		
		a=10;
		b=30;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("===========================");
		
		//byte a;			//����� ������ �缱�� �� �� ����.
		//a=10.02;			//������ ����� ������ �ٸ� ������ Ÿ���� ���� ���� �� ����.
		
		char c;				//char => ���� 1��, ''�� ����ߵ�.
		c='A';
		System.out.println(c);
		
		String d;			//String => ""�� ����ߵ�.
		d="������ ����� ���� ���������ϴ�.";
		System.out.println(d);
		
		String e = "11������";	//����� ���ÿ� ���� ���� �� �ִ�.
		System.out.println(e);
		
	}

}
