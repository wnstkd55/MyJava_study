package chap06_07.EX06;

//��ü�� �ʵ忡 ���� �Ҵ��ϴ� ��� : 3����
	//1. �ʵ忡 ���� ���� �ο��ϴ� ���							<== ��ü�� ������
	//2. setter�� ���ؼ� ��ü�� �ʵ忡 ���� �ο�.(��Ʈ���� �ȴ�)		<== ��ü�� ������
	//3. �����ڸ� ���ؼ� ��ü�� �ʵ� ���� �ο�(��Ʈ�ѵȴ�.)			<==��ü�� �����Ҷ� �ʱⰪ���� �ʵ忡 ���� �Ҵ�

class Aa{		//1. ��ü ���� �� ���� �ʵ忡 �� �Ҵ�
	String name;	//�̸�
	int age;		//����
	String mail;	//���� �ּ�
	
	void print() {
		System.out.println("name: "+name+ "/ age"+age+"/ mail: "+mail);	}
}

class Bb{		//2. setter�� ���ؼ� ��ü�� �ʵ��� ���� �Ҵ�
	String name;	//�̸�
	int age;		//����
	String mail;	//���� �ּ�
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	void print() {
		System.out.println("name: "+name+ "/ age"+age+"/ mail: "+mail);	}
}

class Cc{		//3. �����ڸ� ���ؼ� ��ü�� �ʵ��� ���� �Ҵ�
	String name;	//�̸�
	int age;		//����
	String mail;	//���� �ּ�
	
	public void print() {
		name = "��븸";
		age = 58;
		mail="kim@ccc.com";
		System.out.println("name: "+name+ "/ age: "+age+"/ mail: "+mail);
	}
}

public class FieldOfValue {

	public static void main(String[] args) {
		
		//1. ��ü�� �ʵ忡 ���� ���� �Ҵ�.
		Aa aa = new Aa();		//��ü�� ������
		aa.name = "���缮";
		aa.age = 40;
		aa.mail = "yoo@aaa.com";
		aa.print();
		
		//2. ��ü�� setter�� ����ؼ� �ʵ��� ���� �ο�
		Bb bb = new Bb();		//��ü�� ������
		bb.setName("��ȣ��");
		bb.setAge(50);
		bb.setMail("gang@bbb.com");
		bb.print();
		
		
		//3. �����ڸ� ���ؼ� ��ü�� �ʵ��� ���� �Ҵ�
		Cc cc = new Cc();		//��ü�� �����Ҷ� �ʵ��� ���� �ο�
		cc.print();
		
	}

}
