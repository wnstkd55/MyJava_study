package Chap16.EX02;
//Object�� ����ؼ� 5���� ��ü�� �����ϰ� ����غ��� 
//���ʸ��� ����ؼ� 4���� ��ü�� �����ϰ� ����غ��� : 
class Student{
	String name;
	String ID;
	int passWd;
	
	Student(String name, String ID, int passWd){
		this.name=name;
		this.ID=ID;
		this.passWd=passWd;
	}
	
	@Override
	public String toString() {
		return "�̸�: "+name+ " ID: "+ID+" �н�����: "+passWd;
	}
	
	
}

class Professor{
	String name;
	int year;
	String email;
	Professor(String name, int year, String email){
		this.name=name;
		this.year=year;
		this.email=email;
	}
	
	@Override
	public String toString() {
		return "�̸�: "+name+ " ����: "+year+" �̸���: "+email;
	}
}

class Tiger{
	String name;
	String run;
	
	Tiger(String name, String run){
		this.name=name;
		this.run=run;
	}
	@Override
	public String toString() {
		return "�̸�: "+name+" �ٸ�����: "+run;
	}
}


class Banana{
	String name;
	String color;
	int price;
	
	Banana(String name, String color, int price){
		this.name=name;
		this.color=color;
		this.price=price;
	}
	@Override
	public String toString() {
		return "�̸�: "+name+" ����: "+color+" ����: "+price;
	}
}

class Info{
	
	private Object object = new Object();
	
	public void setObject(Object object) {
		this.object = object;
	}
	public Object getObject() {
		return object;
	}
	
}

class MyClass<T>{
	private T t;
	
	public T get() {	//getter �ʵ��� ���� ��������
		return t;
	}
	public void set(T t) {	//Setter�ʵ��� ���� �Ҵ�
		this.t = t;
	}
}


public class EX_UsingObject {

	public static void main(String[] args) {
		
//		System.out.println("==========�л�===========");
//		Info info1 = new Info();
//		info1.setObject(new Student("ȫ�浿","20220329",5352));
//		System.out.println((Student)info1.getObject());
//		System.out.println("==========����===========");
//		
//		Info info2 = new Info();
//		info2.setObject(new Professor("������", 5, "aaa@aaa.com"));
//		System.out.println((Professor)info2.getObject());
//		System.out.println("==========ȣ����===========");
//		
//		Info info3 = new Info();
//		info3.setObject(new Tiger("ȣ����", "�ٸ�4��"));
//		System.out.println((Tiger)info3.getObject());
//		System.out.println("==========�ٳ���===========");
//		
//		
//		Info info4 = new Info();
//		info4.setObject(new Banana("�ٳ���", "�����", 5000));
//		System.out.println((Banana)info4.getObject());
//		
		MyClass<Student> student = new MyClass<Student>();
		student.set(new Student("ȫ�浿","2323",1532));
		System.out.println(student.get());
		
		MyClass<Professor> professor = new MyClass<Professor>();
		professor.set(new Professor("������", 5, "aaa@bbb.com"));
		System.out.println(professor.get());
		
		MyClass<Tiger> tiger = new MyClass<Tiger>();
		tiger.set(new Tiger("ȣ����", "4��"));
		System.out.println(tiger.get());
		
		MyClass<Banana> banana = new MyClass<Banana>();
		banana.set(new Banana("�ٳ���", "�����", 5000));
		System.out.println(banana.get());
		
	}

}
