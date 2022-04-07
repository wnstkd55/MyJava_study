package Chap12.EX07;

interface A{	//부모 인터페이스
	default void abc() {	//인터페이스에서 구현부가 있는 메소드를 정의: default
		System.out.println("A 인터페이스의 abc()");
	}
}

class B implements A{		  //extends Object가 생략됨.
	public void abc() {		 //오버라이딩
		A.super.abc();		//super.abc는 Object클래스의 abc()호출
		System.out.println("B클래스의 abc()");
	}
}

public class DefaultMethod2 {

	public static void main(String[] args) {
		//1. 객체 생성
		B b = new B();
		
		//2. 메소드 호출
		b.abc(); 	//B의 abc()를 호출
		
		System.out.println("=======================");
		A a1 = new B();		// 인터페이스는 객체생성은 불가, 타입 변경은 가능
		a1.abc();
		
		
	}

}
