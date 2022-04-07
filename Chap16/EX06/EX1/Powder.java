package Chap16.EX06.EX1;

//GenericPrinter에 사용될 객체[재료]

public class Powder extends Material{	//추상 클래스를 상속
	public void doPrinting() {		//추상메소드를 구현한 메소드
		System.out.println("파우더 재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		
		return "재료는 Powder입니다.";
	}
}
