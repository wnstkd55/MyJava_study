package Chap10.EX05;

class A{	
	A(){}//기본 생성자 : 클래스 내의 다른 생성자가 존재하지 않을경우 생략 가능
	
	//인스턴스 메소드 : 상속관계에서 메소드 오버라이딩은 인스턴스 메소드만 오버라이딩된다.
		//상속관계에서 인스턴스 필드, stack필드, static메소드는 오버라이딩 되지 않는다.
		//오버라이딩할때는 시그니쳐가 같아야한다. 리턴타입, 메소드명, 매개변수타입, 매개변수 갯수
	void print() {
		System.out.println("Class A출력");
	}
}

class B extends A{
	
	@Override
	void print() {
		System.out.println("Class B출력");
	}
	
}

class C extends A{
	@Override
	void print() {
		System.out.println("Class C출력");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		//1. A타입, A 생성자
		A a = new A();
		a.print();
		
		//2. B타입, B생성자
		B b = new B();
		b.print();
		//3. C타입, C생성자
		C c = new C();
		c.print();
		
		System.out.println("==========================");
		//4. A타입, B생성자( 오버라이딩 되어 A의 print() 호출시, B의 print() 출력됨.
		A ab = new B();
		ab.print();		//A의 print() 메소드 호출	==> B의 print()가 출력됨
		
		A ac = new C();
		ac.print();		//A의 print() 호출	==> B의 print가 출력됨
		
		A[] arr = {ab,ac};	//	배열에 A타입의 객체를 저장
		System.out.println("=========================");
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
		}
		System.out.println("========================");
		for(A k : arr) {
			k.print();
		}
	}

}
