package Chap12.EX01;

abstract class Abc{
	abstract void cry();
	abstract void fly();
}

class Cat extends Abc{
	@Override
	void cry() {
		System.out.println("고양이는 야옹");
	}
	@Override
	void fly() {
		System.out.println("고양이는 날지못합니다.");
	}
}

class Eagle extends Abc{
	@Override
	void cry() {
		System.out.println("독수리는 까악");
	}
	@Override
	void fly() {
		System.out.println("독수리는 날 수 있습니다.");
	}
}

public class EX_AbstractClass {

	public static void main(String[] args) {
		//1. 자식객체 Cat,Eagle 클래스 생성후 출력
		Abc cat1 = new Cat();
		Abc eagle1= new Eagle();
		
		cat1.cry();
		cat1.fly();
		eagle1.cry();
		eagle1.fly();
		
		System.out.println("====================");
		//2. 익명 클래스 생성후 출력,
		
		Abc cat2 = new Cat() {
			void cry() {
				System.out.println("고양이는 야옹");
			}
			void fly() {
				System.out.println("고양이는 날지못합니다.");
			}
		};
		Abc eagle2 = new Eagle() {
			void cry() {
				System.out.println("독수리는 까악");
			}
			void fly() {
				System.out.println("독수리는 날 수 있습니다.");
			}
		};
		
		cat2.cry();
		cat2.fly();
		eagle2.cry();
		eagle2.fly();
		
		
	}

}
