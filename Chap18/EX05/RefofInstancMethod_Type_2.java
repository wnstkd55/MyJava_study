package Chap18.EX05;

//2. 메소드 참조(정적 메소드 표현)
	//메소드 참조 : 내가 구현하지 않고, 구현되어있는 메소드를 참조해서 사용

interface A{
	void abc();
}
class B{
	static void bcd() {					// <<==static : 클래스 이름으로 호출이 가능하다.
		System.out.println("메서드");
	}
}

public class RefofInstancMethod_Type_2 {

	public static void main(String[] args) {
		//1. 정적 메소드 참조 : 이너클래스로 처리
		A a1 = new A() {
			@Override
			public void abc() {
				B.bcd(); 			//static이 적용된 정적 메소드 호출, 객체 생성 없이 클래스 명으로 호출
				
			}
		};
		
		//2. 람다식 표현
		A a2 = () -> {B.bcd(); }; 		//람다식 표현
		
		//3. 정적 메소드 참조
		
		A a3 = B::bcd;		
		
		a1.abc();
		a2.abc();
		a3.abc();
		
		
		
		
		
		
		

	}

}
