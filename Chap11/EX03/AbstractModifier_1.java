package Chap11.EX03;

//abstract(추상) 메소드: 실행영역이 없는 메소드, 선언만 되어있는 메소드
	//추상클래스는 객체화 할수없다. 타입으로는 정의할 수 있다.
	//팀장 메소드를 정의해준다. : 회사의 기능 구현 메소드를 정의
		//팀원은 설계해준 추상메소드를 오버라이딩해서 구현부를 만들게됨.
		//하위 클래스에서 메소드 오버라이딩시 오류를 방지하기위해 사용....
	//자식클래스에서 재정의 해서 구현부를 생성해야한다.
//	ex)		메소드의 기본형식 : void print() {}
//			추상 메소드 : 실행영역이 없는 메소드 : abstract void print();
//			추상 클래스 : abstract class A{추상메소드를 하나 이상 포함하면}
				//자식클래스에서 메소드를 재정의해서 구현부를 생성한다.

abstract class A{	//추상클래스 : 추상메소드를 하나라도 포함하면 반드시 추상 클래스여야한다.
	abstract void print();	//추상메소드 : 실행영역이없는 메소드
	abstract void cry();
}

class B extends A{	//콘크리트 클래스 : 추상클래스에서 선언한 메소드를 모두 구현한 클래스
	
	@Override
	void print() {
		System.out.println("콘크리트 클래스 : 추상클래스에서 선언한 메소드를 모두 구현한 클래스");
		
	}
	
	@Override
	void cry() {
		System.out.println("야옹");
		
	}
	
}
abstract class C extends A{	//부모의 추상 메소드중 일부만 구현할 경우: 추상클래스
	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}
}


public class AbstractModifier_1 {

	public static void main(String[] args) {
		
	}

}
