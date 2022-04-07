package Chap13.EX09.EX1;

interface A{
	void cry();
	void fly();
}

class C{
	void abc(A a) {
		a.cry();
		a.fly();
	}
}

public class AnonymousClass_4_1 {

	public static void main(String[] args) {
		//1. 클래스는 존재(X) + 참조변수 (O)
		C c = new C();
		
		A a = new A() {
			public void cry() {
				System.out.println("멍멍");
			}
			public void fly() {
				System.out.println("하늘을 못 납니다.");
			}
		};
		
		c.abc(a);
		
		System.out.println("========================");
		//2. 클래스는 존재(X) + 참조변수(O)
		c.abc(new A() {

			
			public void cry() {
				System.out.println("클래스는 존재(X) + 참조변수(X)");
				
			}

			public void fly() {
				System.out.println("클래스는 존재(X) + 참조변수(X)");
				
			}

			
		});
	}

}
