package Chap13.EX04;

//지역 이너클래스:글래스의 메소드 내부에 선언된 클래스
	//메서드 내부의 필드는 final키가 생략됨. 값을 수정할 수 없다.
	//지역이너클래스에서 사용된는 지역변수는 자동으로 final로 선언된다. 생략시 컴파일러가 자동으로 할당해줌.
class A{
	int a = 3;		//필드 : Heap 반드시 초기화가 강제로 진행됨.
					//필드의 초기값을 할당후에 값을 수정할때는 객체화해서 값을 수정
					//생성자나 setter를 통해서 초기값을 할당 후에 
	A(int a){			//생성자를 통해서 a의 초기값 할당
		this.a = a;
	}
	public void setA(int a) {	//setter를 통해서 필드의 값을 초기화
		this.a = a;
	}
	
	
	void ccc() {	//지역변수 : 메서드 내부의 변수 , 메모리의 스택공간에 저장
		int a = 3;		//지역변수 초기값 3할당.
		a = 4;			//a 변수의 4로 변경
		a = 10;			//a 변수의 값을 10으로 변경
		int b;
		b=0;
	}
	void abc() {
		int b = 5;	//지역변수 : 메소드 내부에 선언된 변수(final이 컴파일러에 의해서 할당됨.)
						//지역 이너클래스에서 사용된 경우 : final
		int c = 10;			//자동으로 final키가 컴파일러에 의해서 자동으로 할당
			c = 20;
		class B{		//지역 이너 클래스
			void bcd() {
				System.out.println(a);		//필드
				System.out.println(b);		//지역변수
				a = 5;		//필드 값 수정 가능
				//b = 7;		//지역클래스 내부에 선언된 지역변수는 자동으로 final키가 컴파일러에 의해서 할당됨.
			}
		}
		B bb = new B();
		bb.bcd();
	}
}

public class InnerClass_4 {

	public static void main(String[] args) {
		A aa = new A(3);
		aa.abc();
	}

}
