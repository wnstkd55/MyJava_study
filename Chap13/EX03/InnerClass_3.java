package Chap13.EX03;

class A{
	int a = 3;	//인스턴스 필드  객체화해야 사용가능
	static int b = 4;	//static 필드, 객체 생성없이 접근, 객체 생성후 접근
	void method1() {	//인스턴스 메소드 : 객체 생성 후 접근
		System.out.println("인스턴스 메소드");
	}
	static void method2() {	// static 메소드, 객체를 생성하지 않고 접근, 객체 생성후 접근
		System.out.println("static 메소드");
	}
	static class B{		//static 이너클래스 : 외부 객체를 생성하지 않고 객체 생성이가능하다.
		
		void bcd() {
			//1. static 클래스에서 외부 클래스의 인스턴스 필드 접근(접근불가)
			//System.out.println(a); 		//외부 클래스의 인스턴스 필드(접근불가)
			System.out.println(b); 		//static 이너클래스에서 외부 클래스의 static필드나 메소드 접근 가능
			//2. 메소드 호출
			//method1();		//인스턴스 메소드는 호출 불가
			method2();		//static 메소드는 호출 가능
		}
		
	}
}

public class InnerClass_3 {

	public static void main(String[] args) {
		
		
		
	}

}
