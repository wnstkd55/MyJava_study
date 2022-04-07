package Chap10.EX04;

class Human {		//�θ�Ŭ����
	String name;	//�ν��Ͻ� �ʵ� : ��üȭ���Ѿ� ��� ����, Heap�� ����
	int age;
	
	void eat() {	//�ν��Ͻ� �޼ҵ� : ��üȭ���Ѿ� ��밡��, Heap(pointer), Ŭ������������ �ν��Ͻ� �޼ҵ� ������
								// ���� �޼ҵ��� �ڵ尡 ����
		System.out.println("����� �Խ��ϴ�.");
	}
	
	void sleep() {
		System.out.println("����� ������ϴ�.");
	}
}

class Student extends Human{
	int studentID;
	void goToSchool() {
		System.out.println("�л��� �б��� ���ϴ�.");
	}
}

class Worker extends Human{
	int workID;
	void goToWork() {
		System.out.println("�������� ȸ�翡 ���ϴ�.");
	}
}

public class Test01 {

	public static void main(String[] args) {

		Human h = new Human();		//�θ�Ŭ����
		h.name = "ȫ�浿";
		h.age = 30;
		h.eat();
		h.sleep();
		
		Student s = new Student();	//�ڽ�Ŭ���� : �ڽ� Ŭ������ �θ�Ŭ������ �ʵ�� �޼ҵ带 ���
		s.name="�Ż��Ӵ�";		//�θ�Ŭ������ �ʵ�
		s.eat();				//�θ�Ŭ������ �޼ҵ�
		s.studentID=22131;		//�ڽ�Ŭ������ �ʵ�
		s.goToSchool(); 		//�ڽ�Ŭ������ �޼ҵ�
		
		Worker w = new Worker();
		w.name="BTS";		//�θ�Ŭ������ �ʵ�
		w.eat();			//�θ�Ŭ������ �޼ҵ�
		w.workID=2123;		//�ڽ�Ŭ������ �ʵ�
		w.goToWork();		//�ڽ�Ŭ������ �޼ҵ�
	
		Human h1 = new Student();		// ��ĳ���� : �ڽ� => �θ� Ÿ������ ����ȯ
								//h : Human, StudentŸ���� ��� ����, Human�� ���� ����
		h.name = "�̼���";
		h.eat();
		System.out.println("====================");
		
		
		//�ٿ�ĳ���� : �θ� ==> �ڽ����� Ÿ�Ժ�ȯ		, if ������ ����ؼ� instanceof�� ����ؼ� ó��
			//��Ÿ�� ����
		System.out.println(h1 instanceof Human);		//true
		System.out.println(h1 instanceof Student);		//true
		
		
		if(h1 instanceof Student) {
			Student s2 = (Student)h1;
			s2.studentID = 3324;
			s2.goToSchool();
		}
		
		if(h1 instanceof Worker) {
			Worker w4 = (Worker)h1;
		}
		
			//������ �߻����� �ʴ´�.(������ ������ �ƴϴ�.)
									//����� ����(��Ÿ�� ����)
		System.out.println(h1 instanceof Worker);	//false
		
		
		
		
		
	}

}
