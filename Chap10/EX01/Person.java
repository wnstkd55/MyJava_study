package Chap10.EX01;

class Student_sub extends Student{
	//Student_sub�� Student�� ��ӹް��ִ�. Student�� �ʵ�� �޼ҵ带 ��ӹ޴´�
	//Student�� Person�� ��ӹް��ִ�. Student�� Person�� �ʵ�� �޼ҵ带 ��ӹް��ִ�.
	
	//Student_sub�� Person�� �ʵ�� �޼ҵ�� Student�� �ʵ�� �޼ҵ带 ��� ��ӹ޴´�.
	
	String sub1;
	
	void sub1() {
		System.out.println("Student_sub1Ŭ���� �Դϴ�. �θ��� �ʵ�� �޼ҵ带 ���� �޽��ϴ�.");
	}
	
	
}

class Student extends Person{	//���л� Ŭ����, Person : �θ�Ŭ����, Students�ڽ�Ŭ����			
	//�ڽ�Ŭ������ �θ�Ŭ������ �ʵ�, �޼ҵ�, �̳�Ŭ����(inner class)�� �״�� ��ӹ޴´�.

int studentID;
void goToSchool() {
System.out.println("�л�Ŭ������ Student �޼ҵ� goToSchool()ȣ�� �Դϴ�.");
}
}

class Worker extends Person{	//������ Ŭ����
	int workerID;	//���
	void goToWork() {
		System.out.println("������Ŭ������ Worker�޼ҵ� goToWork()ȣ�� �Դϴ�.");
	}
	
}

public class Person {		//��� : �θ�Ŭ������(�ʵ�, �޼ҵ�, ����Ŭ����)�� �ڽ�Ŭ�������� ���
							//����� ���� : 1. �ߺ��� �ڵ��� ����(�ڵ��� ����)
									// 2. �ڵ尡 ��������. 3. ������(�޼ҵ� �������̵�)
									// ������ : �ϳ��� �޼ҵ� �̸����� ���� �������� ���
	
	String name;
	int age;
	
	void eat() {
		System.out.println("�θ�Ŭ������ eat()�޼ҵ� �Դϴ�.");
	}
	
	void sleep() {
		System.out.println("�θ�Ŭ������ sleep()�޼ҵ� �Դϴ�.");
	}



	
	
	public static void main(String[] args) {
		
		//1. person��ü ����
		Person p = new Person();
		p.name = "������";
		p.age = 40;
		p.eat();
		p.sleep();
		
		System.out.println("=================");
		//2. student��ü ����
		Student s = new Student();	//PersonŬ������ ���, PersonŬ������ �ʵ�� �޼ҵ带 ���
			//�ڽ� Ŭ������ �θ� Ŭ������ ����� �ʵ�� �޼ҵ带 ����� �� �ִ�.
			
		//Person Ŭ������ �ʵ�
		s.name = "�̼���";
		s.age = 50;
		//Student Ŭ������ �ʵ�
		s.studentID = 20200310;		//
		
		//PersonŬ������ �޼ҵ�
		s.eat();
		s.sleep();
		
		//StudentŬ������ �޼ҵ�
		s.goToSchool();
		
		System.out.println("=========================");
		
		//3. worker��ü ����
		Worker w = new Worker();	//PersonŬ������ ����Ѵ�. PersonŬ������ �ʵ�� �޼ҵ带 ���.
		
		//�θ� Ŭ������ �ʵ� : Person
		w.name="�������";
		w.age=50;
		//�ڽ� Ŭ������ �ʵ�: Worker
		w.workerID = 20220310;	//���
		
		//�θ�Ŭ���� �޼ҵ� : Person
		w.eat();
		w.sleep();
		
		//�ڽ�Ŭ���� �޼ҵ�: Worker
		w.goToWork();
		
		System.out.println("=======��ü ������ Ÿ�� ��ȯ========");
		
		Person p1 = new Person();	// Person()�� Person�̴�.(�ڽ��� �θ��)
		Person ps = new Student();	// ��ĳ����, student�� Person�̴�.
		//Student sp = new Person();	// Person�� Student�̴�. (x)
		Person pw = new Worker();	//��ĳ����, worker�� Person�̴�.
		//Worker wp = new Person();	//����, person�� �������̴�.(x)
		
		System.out.println("====Person<==Student<==Student_sub=====");
		
		Student_sub sub1 = new Student_sub();	//����
		
		//PersonŬ������ �ʵ�� �޼ҵ� ��� ����
			sub1.name = "�Ż��Ӵ�";
			sub1.age = 50;
			sub1.eat();
			sub1.sleep();
			//StudentŬ������ �ʵ�� �޼ҵ�
			sub1.studentID = 20220310;
			sub1.goToSchool();
			//Student_sub�� �ʵ�� �޼ҵ�
			sub1.sub1 = "�ڽ��� �ڽ�Ŭ����";
			sub1.sub1();
			
			Person ps1 = new Student_sub();		//��ĳ����; Student_sub��ü�� ������ �θ� ������ Ÿ������ ����ȯ
				//Student_sub�� PersonŸ������ ��ĳ����, PersonŬ������ ����� ��밡��
			//PersonŬ������ �ʵ�� �޼ҵ常 ����
			ps1.name="BTS";	
			ps1.age=30;
			ps1.eat();
			ps1.sleep();
			
			Student ss1 = new Student_sub();	//��ĳ����: student_sub�� StudentŸ������ ��ĳ����
				//person�� student�� �ʵ�� �޼ҵ带 ��밡��
				ss1.name="ses";
				ss1.age=30;
				ss1.eat();
				ss1.sleep();
				//Student�� �ʵ�� �޼ҵ�
				ss1.studentID=20220310;
				ss1.goToSchool();
				
			Student_sub ss2	= new Student_sub();	//Person, Student, Student_sub�� �ʵ�� �޼ҵ� ��� ���.
				//personŬ������ �ʵ�� �޼ҵ�
				ss2.name = "�����������ܿ�";
				ss2.age = 40;
				ss2.eat();
				ss2.sleep();
				//Student Ŭ������ �ʵ�� �޼ҵ�
				ss2.studentID = 20220310;
				ss2.goToSchool();
				//Student_sub�� �ʵ�� �޼ҵ�
				ss2.sub1="�ڽ��� �ڽ�Ŭ����";
				ss2.sub1();
				
			//��� ���迡�� ��ü ������ �θ� ������ Ÿ������ ��ĳ���� ����.
				//�θ� ������ Ÿ������ ��ĳ���� �� ��� �θ��� �ʵ�� �޼ҵ常 ��� ����
				
				//Person <== Student	<== Student_sub
				
				Person ps4 = new Student_sub();
					//Student_sub ��ü ������ PersonŸ������ ��ĳ����
					//Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ��ִ�.
					//���߿� PersonŬ������ �ʵ�� �޼ҵ常 ���� ����
				Student ss4 = new Student_sub();
					//Student_sub ��ü ������ StudentŸ������ ��ĳ����
					//Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ��ִ�.
					//���߿� Person, StudentŬ������ �ʵ�� �޼ҵ常 ���� ����
				Student_sub ss5 = new Student_sub();
					//Student_sub ��ü ������ Student_subŸ������ ����
					//Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ��ִ�.
					//���߿� Person, Student, Student_subŬ������ �ʵ�� �޼ҵ常 ���� ����
					
				//�ٿ� ĳ���� : �θ� ������ Ÿ������ ��ĳ���� �Ȱ��� �ڽ� ������ Ÿ������ ��ȯ(�������� ��ȯ)
				
				Student ps5 = (Student)ps4;		//ps4(Person, Student, Student_sub)�� ������ Ÿ���� person
					//ps5�� Person, Student�� �ʵ�� �޼ҵ� ���� ����
				ps5.name="�ٿ�ĳ����";
				ps5.age=30;
				ps5.studentID = 20220310;	//Student �ʵ�� �޼ҵ� ��� ����
				ps5.goToSchool();		//Student�� �޼ҵ� ���
				
				Student_sub ps6 = (Student_sub)ps4;	//ps4�� Person������ Ÿ�Կ��� Student_sub�� �ٿ�ĳ����
					//Student_sub�� �ٿ�ĳ���õ�(Person,Student,Student_sub)�� �ʵ�� �޼ҵ� ��� ����
				
				ps6.name = "�̿��";	//Person
				ps6.studentID = 20220310;		//Student
				ps6.sub1 = "�ڽ��� �ڽ�";	//
	}

}
