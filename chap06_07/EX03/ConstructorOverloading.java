package chap06_07.EX03;


// ������ �����ε� : �ϳ��� �����ڸ� ������Ÿ��, ������ ���� �ٸ� �����ڰ� ȣ��
	// ���� ) ������Ÿ�Ե� ����, ������ ���� ��� �ΰ��̻� ������ ���� �߻�
class Abc{
	int a, b, c;
	String d;
	
	Abc(){System.out.println(a+" , "+b+" , "+c);}	//�⺻������
	
	Abc(int a){		//�Ű������� 1���� ������
		this.a=a;
		System.out.println(a);
	}
	
	Abc(String d){
		this.d=d;
		System.out.println(d);
	}
	
	Abc(int a, int b){	//�Ű������� 2���� ������
		this.a=a;
		this.b=b;
		System.out.println(a+" , "+b);
	}
	
	Abc(int a, int b, int c){		//�Ű������� 3���� ������
		this.a = a; this.b = b; this.c = c;
		System.out.println(a+" , "+b+" , "+c);
	}
	
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Abc abc = new Abc();	//�⺻������ ȣ��
		Abc abc1 = new Abc(30);		//�Ű������� 1���� ������
		Abc abc2 = new Abc("�����ڵ���");	//�Ű������� ���� ������ Ÿ���� �ٸ��� �ش� �޼ҵ带 ȣ��
		Abc abc3 = new Abc(10,20);	//�Ű������� 2���� ������
		Abc abc4 = new Abc(10,20,30);	//�Ű������� 3���� ������
		
	}

}
