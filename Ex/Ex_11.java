package Ex;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		//course�迭(String Ÿ���� �����ڷ���)�� ���ڿ��� �Ҵ�(��ũ�� 5)
		int score[] = {95, 88, 76, 62, 55};
		//score�迭(intŸ���� �⺻�ڷ���)�� �� �Ҵ�(��ũ��5)
		String name = null;		//StringŸ��(�����ڷ���)�� name������ �ʱ�ȭ�� ���� null�� �ʱ�ȭ���߽��ϴ�.
		int i=0;				//intŸ���� i������ �ʱ�ȭ�� ���� 0���� �ʱ�ȭ.
		Scanner sc = new Scanner(System.in);	//�Է��ϱ����� ��ĳ�� ���
		System.out.println("���α׷��� �����Ϸ��� \"�׸�\"�� �Է��ϼ���. ");	// ""�ȿ� ""����ǥ�� �������ؼ� \"\"�� ���� �ȴ�.
		
		while(true) {			// Ư�� ������ ���� �Ҷ� ���� ��� ���� ���ư�.
			System.out.println("���� �̸� >> ");
			name=sc.next();			//�Է��� ����(String)���� name������ �ֱ�
			if(name.equals("�׸�")) {								//���� : name�� ���������̱⶧���� ==�� ��������ʰ� equals�� ����Ѵ�.
				break;			//�Է°��� "�׸�"�ϰ�� break�� ����
			}
			for (i = 0; i<course.length; i++) {
				if(course[i].equals(name)) {		
					System.out.println(course[i]+"�� ������ "+score[i]);
					break;
				}
				}
			if(i==course.length) {			// course.length���� 5�̱� ������ score������ ���� ���⶧���� �˻����� �ʴ´�.
				System.out.println("���� �����Դϴ�.");
			}				//i ������ ������ ����� ������ �˻��� �ȵ� ���
			
		}
		sc.close();
		System.out.println("���α׷��� �����մϴ�...");
	}
}
/*
 * �⺻ �ڷ����϶� : == (���� ��)
 * ���� �ڷ����϶� : == (�����ϴ� �ּ��� ������ ��)
 * 
 * ���� �ڷ����϶� ���� ���ϴ� �� => str1.equals(str2)		<--�������� str1���� str2�� �� �ִ� ���� ��.
 * */





//String�� ���� �Ҵ��ϴ� 2���� ���
	/*
 	String�� ���� �Ҵ� �Ҷ� �����ڸ� ���ؼ� �Ҵ�. ==> ������ �޸� ������ ������ �ȴ�.
 	
 	String aa = new String("�ȳ�");
	String bb = new String("�ȳ�");
	System.out.println(aa);		==>�ȳ�
	System.out.println(bb);		==>�ȳ�
	
	if(aa == bb){						//�޸��� �ּ� ���� ��(aa,bb�� �ٸ� �޸� �ּҸ� ���´�.)
		System.out.println(true);
	}else{
		System.out.println(false);
	}	//false ���		? = �ּҰ� �ٸ��� ����
	
	String�� ���� ���ͷ� ��(������ ���� ��)�� �ٷ� �Ҵ�. ==> �޸� ������ �����Ѵ�.
	
	String a = "�ȳ�";
	String b = "�ȳ�";
	
	if(a == b){						//�޸��� �ּ� ���� ��(a,b�� ���� �޸� �ּҸ� ���´�.)
		System.out.println(true);
	}else{
		System.out.println(false);
	}//	true	//  ?= �ּҰ� ���� ����
									//���� �ڷ������� '=='�� �޸��� �ּҸ� ���Ѵ�.
									
									 
	*/


