package chap06_07.EX06;

class Cde{
	String name;		// �ʵ�(�ν��ͽ� �ʵ�) : ��üȭ �ؾ� ��� ����
	int age;
	
	static String email;	//�ʵ�(static(����)�ʵ� : ��ü �������� ��� ����(Ŭ������.�ʵ��) + ��ü ������ ���
	static int num;
}

public class Static_4 {

	public static void main(String[] args) {
		Cde cde1 = new Cde();	//��üȭ
		//�ν��Ͻ� �ʵ� : ��üȭ �ؾ����� ��� ����
		cde1.name = "ȫ�浿";
		cde1.age = 30;
		
		//static �ʵ� : ��üȭ�ؼ� ��� ����
		cde1.email = "aaa@aaa.com";
		cde1.num = 4;
		
		//��ü�������� static�ʵ� ȣ�� : Ŭ���������� ȣ���� ���� : <<�������>>
			//��� ��ü���� �����ϴ� ����
		Cde.email = "bbb@bbb.com";
		Cde.num = 5;
		
		Cde cde2 = new Cde();
		Cde cde3 = new Cde();
		Cde cde4 = new Cde();
		
		//�ν��Ͻ� �ʵ� : Heap������ ����ǰ�, �� ��ä���� �������� �ʴ� ������ ���� ������.
		
		cde2.name = "������";
		cde2.age = 50;
		
		cde3.name = "�������";
		cde3.age = 60;
		
		cde4.name = "�Ż��Ӵ�";
		cde4.age = 40;
		
		System.out.println(cde2.name + " , "+cde2.age);
		System.out.println(cde3.name + " , "+cde3.age);
		System.out.println(cde4.name + " , "+cde4.age);
		
		//Static �ʵ��� ���� �����ϸ� ��� ��ü���� ��� ����
		cde2.email = "kkk@kkk.com";
		cde2.num = 55;
		
		System.out.println(cde2.email + ", "+ cde2.num);
		System.out.println(cde3.email + ", "+ cde3.num);
		System.out.println(cde4.email + ", "+ cde4.num);
		
		
	}

}
