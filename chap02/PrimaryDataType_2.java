package chap02;

public class PrimaryDataType_2 {

	public static void main(String[] args) {
		//char �ڷ����� ���� �Ҵ��ϴ� ���
		//���ڷ� �����ϴ� ���
		char value1 = 'A';		//������
		char value2 = '��';		//�ѱ�
		char value3 = '3';		//����3 (����3 => X)
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println("===================");
		
		//������ �����ϴ� ��� (�ƽ�Ű �ڵ� ������ �Ҵ�)
		char value4=65;			//���� 65�� �ƽ�Ű �ڵ�� ����A
		char value5=0xac00;		//16������ ���� �Ҵ� 0x : 16������ ���� �ְڴٰ� ���� ac00
		char value6=51;			//51 : ���� 3
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println("===================");
		
		//�����ڵ�� ���� �Է�
		char value7 = '\u0041'; //�����ڵ�� �빮��A
		char value8 = '\uac00';
		char value9 = '\u0033';
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		System.out.println("=======���� A�� �����ϴ� �پ��� ���========");
		
		char a = 'A';	//���ڷ� �Ҵ�
		char b = 65;	//10������ ���� : �ƽ�Ű �ڵ� ��.
		char c = 0b1000001;		//0b �� 2������ ����
		char d = 00101;			//00 �� 8����
		char e = 0x0041;		//0x �� 16����
		char f = '\u0041';		//�����ڵ�� �� �Ҵ�.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
				
		
		
		
	}

}
