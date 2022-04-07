package Chap18.EX10;


interface A{
	B abc(int k);		//리턴타입이 B 객체를 리턴
}

class B{
	B(){
		System.out.println("첫번째 생성자");
	}
	B(int k){
		System.out.println("두번재 생성자");
	}
}

public class RefOfClassConstructor_2 {

	public static void main(String[] args) {
		//1. 클래스 생성자 참조.
		//익명이너클래스
		A a1 = new A() {
			@Override
			public B abc(int k) {			//abc()메소드 호출시 B객체의  호출 ==> 생성자 참조. 
				return new B(3);			//
			}
		};
		
		//2. 람다식 표현
		
		A a2 = (int k) -> {return new B(3);}; 	//전체 구문
		A a3 = k -> new B(3); 			//축약 구문 (자료형 생략 ,return , {}; 제거) 
		
		//3. 클래스 생성자 참조
		A a4 = B::new; 			//B의 두번째 생성자 호출
		
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
		a4.abc(3);
		
		
	}

}
