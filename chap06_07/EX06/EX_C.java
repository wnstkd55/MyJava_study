package chap06_07.EX06;

import chap06_07.EX05.C;
public class EX_C {

	public static void main(String[] args) {
		//다른클래스에 존재함		/public만 접근/ model, color 메모리로 접근 불가
		//model과 color는 setter
		
		C car1 = new C();	// 다른패키지 이므로 import
		
		//company, model, color는 다른 패키지에서 접근 불가, setter를 통해서 메모리 값을 할당하도록 구성
		car1.maxSpeed = 300;//다른 패키지의 클래스에서는 public, protected(상속 설정)
		car1.setColor("gold");
		car1.setModel("matiz");
		
		car1.print();
		
		
	}

}
