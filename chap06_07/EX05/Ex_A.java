package chap06_07.EX05;

// 같은 패키지 내에서 class A를 접근

public class Ex_A {

	public static void main(String[] args) {
		//A class는 같은 클래스 내부에 존재하므로 import
		
		A a = new A();		//import 없이 사용 : A class가 같은패키지 내에 존재
		
		a.m = 10;		//A class의 접근 제어자가, default
		a.n = 20;		//
		
		a.print();
		
		
	}

}
