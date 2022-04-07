package Chap12.EX03;

interface A{}	
interface B{}

//1. 단일 인터페이스 상속

class C implements A{}	// C클래스는 A인터페이스를 구현(상속)

//2. 다중 인터페이스 상속
class D implements A,B{}	//interface는 다중 구현 (상속) 가능

//3. 클래스와 인터페이스를 한번에 상속	( extends 와 implements의 순서는 변경 불가)
class E extends C implements A,B{}	


public class Interface_3 {

	public static void main(String[] args) {
		
	}

}
