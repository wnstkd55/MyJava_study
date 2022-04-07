package Chap13.EX08;

//클래스 정의 및 참조 변수를 사용/ 미사용인 경우 매개변수로 객체를 전달

interface A{
	public abstract void abc();
	
}
//1. 자식 클래스를 직접 생성
class B implements A{
	@Override
	public void abc(){
		System.out.println("매개변수 전달");
	}
}

class C{	// cde메소드에 input값으로 A타입의 객체a를 받아서
	void cde(A a) {		//cde 메소드를 호출하면서 매개변수로 A타입의 객체를 전송
		a.abc();
	}
}
public class AnonimousClass_3 {

	public static void main(String[] args) {
		//1 방법 : 클래스명 0 + 참조 변수명 0
		C c = new C();		
		A a = new B();		//클래스명(A), 참조변수생성(a)			<=========첫번째 방법
		
		c.cde(a);		//매개변수에 객체 a를 생성해서 던져줌
		
		System.out.println("============================");
		//2 방법 : 클래스명 0 + 참조변수명 X
		c.cde(new B());		//
		
		
	}

}
