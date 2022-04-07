package Chap10.EX05;

class AAAA{					//static 메소드 : 오버라이딩 되지않는다.
	static void print() {
		System.out.println("A클래스");
	}
}

class BBBB extends AAAA{
	static void print() {
		System.out.println("B클래스");
	}
}

public class OverlapStaticMethod {

	public static void main(String[] args) {
		//1. 객체 생성없이 호출
		AAAA.print();
		BBBB.print();
		System.out.println("==============");
		
		//2. 객체 생성후 호출
		AAAA aaaa = new AAAA();		
		aaaa.print();				//A class
		BBBB bbbb = new BBBB();
		bbbb.print();				//B class
		AAAA aabb = new AAAA();
		aabb.print(); 				//A class	static 메소드는 오버라이딩 되지 않는다.
	}

}
