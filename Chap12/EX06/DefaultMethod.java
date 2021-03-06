package Chap12.EX06;

// Interface의 default 메소드 : 인터페이스 내에서 구현부가 있는 메소드
	//기존의 구현되어있는 인터페이스에서 새로운 기능을 추가할 때 하위 클래스에서 재정의 필요없이 새로운 기능을 추가할때 사용.


	//public default void bcd(){}	
		//java 1.8이상에서 새롭게 추가된 기능...

	//default 키를 넣어야 한다. default는 접근 지정자가 아니다.

interface A{
	void abc();		//2020년 생성 메소드,	public abstract가 생략됨. 구현부가 없는 추상 메소드
	default void bcd() {	//2030 생성 메소드
		System.out.println("A인터페이스의bcd()");
	}
	// void ttt();	// 상위 클래스에서 새로운 추상 메소드 상속된 모든 하위 클래스는 오류발생
}

class B implements A {		//2005년 생성된 클래스
	public void abc() {
		System.out.println("B클래스의 abc()");
	}
}

class C implements A{
	public void abc() {
		System.out.println("C클래스의 abc()");
	}
	public void bcd() {			//default메소드도 오버라이딩할수있다.
		System.out.println("C클래스의 bcd()");
	}
}

public class DefaultMethod {
	public static void main(String[] args) {
		//1. 객체 생성
		A a1 = new B();
		A a2 = new C();
		
		//2. 메서드 호출
		a1.abc();		//
		a1.bcd();
		
		a2.abc();
		a2.bcd();
	}
}
