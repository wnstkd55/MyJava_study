package Chap16.EX02;
//Object를 사용해서 5개의 객체를 저장하고 출력해보기 
//제너릭을 사용해서 4개의 객체를 저장하고 출력해보기 : 
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
		return "이름: "+name+ " ID: "+ID+" 패스워드: "+passWd;
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
		return "이름: "+name+ " 연차: "+year+" 이메일: "+email;
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
		return "이름: "+name+" 다리갯수: "+run;
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
		return "이름: "+name+" 색깔: "+color+" 가격: "+price;
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
	
	public T get() {	//getter 필드의 값을 가져오기
		return t;
	}
	public void set(T t) {	//Setter필드의 값을 할당
		this.t = t;
	}
}


public class EX_UsingObject {

	public static void main(String[] args) {
		
//		System.out.println("==========학생===========");
//		Info info1 = new Info();
//		info1.setObject(new Student("홍길동","20220329",5352));
//		System.out.println((Student)info1.getObject());
//		System.out.println("==========교수===========");
//		
//		Info info2 = new Info();
//		info2.setObject(new Professor("김유신", 5, "aaa@aaa.com"));
//		System.out.println((Professor)info2.getObject());
//		System.out.println("==========호랑이===========");
//		
//		Info info3 = new Info();
//		info3.setObject(new Tiger("호랑이", "다리4개"));
//		System.out.println((Tiger)info3.getObject());
//		System.out.println("==========바나나===========");
//		
//		
//		Info info4 = new Info();
//		info4.setObject(new Banana("바나나", "노랑색", 5000));
//		System.out.println((Banana)info4.getObject());
//		
		MyClass<Student> student = new MyClass<Student>();
		student.set(new Student("홍길동","2323",1532));
		System.out.println(student.get());
		
		MyClass<Professor> professor = new MyClass<Professor>();
		professor.set(new Professor("김유신", 5, "aaa@bbb.com"));
		System.out.println(professor.get());
		
		MyClass<Tiger> tiger = new MyClass<Tiger>();
		tiger.set(new Tiger("호랑이", "4발"));
		System.out.println(tiger.get());
		
		MyClass<Banana> banana = new MyClass<Banana>();
		banana.set(new Banana("바나나", "노란색", 5000));
		System.out.println(banana.get());
		
	}

}
