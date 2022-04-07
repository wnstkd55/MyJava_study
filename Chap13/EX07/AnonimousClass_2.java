package Chap13.EX07;

//익명 이너클래스를 사용하여 인터페이스 객체 생성

class A{
	C c = new C() {		//익명 이너 클래스
		public void bcd() {
			System.out.println("익명 이너 클래스");
		};
	};	//C타입, 인스턴스 변수c
	void abc() {
		c.bcd();
	}
}

interface C{				//인터페이스, 추상메소드 정의 : void bcd()
	public abstract void bcd();
}

public class AnonimousClass_2 {

	public static void main(String[] args) {
		//1. 객체 생성 및 메소드 호출
		A a = new A();
//		a.bcd();
		
	}

}
