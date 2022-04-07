package Chap12.EX02;

// 인터페이스(interface) : 외부와 내부를 연결시켜주는 접점...ex)콘센트같은 역할 (외부전기장치 >> 콘센트 << 전기)
						//리모컨(사람, TV) , API
	//객체 생성 불가, 타입은 설정 가능
	//모든 필드는 반드시 : public static final
	//모든 메소드는 : public abstract 생략(1.8) , (default 메소드 제외)

interface A{	//interface 정식표현
	public static final int A = 3;		//Interface 필드의 정식 표현
	public abstract void abc();			//Interface 메소드의 정식표현
}

interface B{		// 생략된 interface 구현
	int A = 3;
	void abc();		//추상 메소드
}

abstract class C{				//추상 클래스일때는 abstract는 생략될 수 없다.
	abstract void abc();		//생략시 오류 발생
}


public class Interface_1 {

	public static void main(String[] args) {
		
		//인터페이스는 객체 생성 불가. 구현되지 않는 메소드가 포함.
		//A a = new A(); 		//A가 인터페이스이므로 객체 생성 불가
		//1. interface의 static 필드의 내용 출력
		System.out.println(A.A);	//인터페이스의 필드 출력, A <== static
		System.out.println(B.A); 	//
		
		//2. final이 적용되어있기때문에 값을 수정할 수 없다.
//		A.A = 5;	//final로 설정 되어 있기 때문에 값을 수정할 수 없다.
//		B.A = 6;
		
	}

}
