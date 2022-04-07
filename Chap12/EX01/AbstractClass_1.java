package Chap12.EX01;

class AA{		//일반 클래스 : 객체생성시 필드와 메소드는 Heap메모리 영역에 저장
					//Heap : 반드시 초기화된 값을 가진다.
						//필드는 Heap에 필드명과 값
						//인스턴스 메소드는 클래스 영역의 인스턴스영역에 메소드의 구현코드까지 저장
							//인스턴스 메소드는 Heap에서 포인터정보만 가지고있다
	int a;
	double b;
	char c;
	boolean d;
	byte e;
	float f;
	String g;	//참조변수
	
	void cry() {}	//완전한 메소드
	@Override
		public String toString() {
			
			return a + ", " + b + ", " + c+", "+d+", "+e+", "+f+", "+g;
		}
	
}


//1. 추상클래스를 객체화해서 출력하는 방법
	//상속을통해서 자식클래스를 생성후, 자식클래스에서 추상 메소드를 재정의하고, 자식클래스를 객체로 생성후 출력
//2. 추상클래스를 객체화해서 출력하는 방법
	//자식 클래스 생성없이, main메소드에서 익명객체를 생성해서  출력
	//임시로 한번만 사용할때는 자식객체를 생성할 필요없이
abstract class A{	//추상클래스 : 미완성 메소드를 포함하므로 객체생성이 불가함.
	
	abstract void abc();		//추상 메소드(미완성 메소드) : 구현부가 존재하지 않는 메소드

}
class B extends A{			//추상클래스를 구현한 객체 : 빈번하게 사용할 경우

	@Override
	void abc() {
		System.out.println("방법 1: 자식 클래스 생성 및 추상클래스 구현");
		
	}		
	
	
	
}



public class AbstractClass_1 {

	public static void main(String[] args) {
		//1. AA 클래스는 객체화가 가능하다. 
		AA aa = new AA();	//필드 : 초기화, 일반 메소드 (구현부가 존재하는 메소드)
		System.out.println(aa);	//객체를 생성할려면 Heap공간에 값이 반드시 들어가야한다.
		
		//2. 추상메소드는 객체생성 불가 : 메소드가 완전한 메소드가 아니기때문(미완성메소드이기 때문)
		//A a = new A(); //객체 생성 불가, 추상메소드를 포함하고있기 때문
		
		//3. 추상 클래스가 구현된 자식클래스 생성
		A a1 = new B();		//자식 클래스를 생성, 부모타입
		A a2 = new B();
		A a3 = new B();
		
		//4. 메소드 호출
		a1.abc();	
		a2.abc();
		a3.abc();
		
	}

}
