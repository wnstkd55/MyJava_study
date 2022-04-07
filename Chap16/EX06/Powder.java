package Chap16.EX06;

//GenericPrinter에 사용될 객체[재료]

public class Powder {
	public void doPrinting() {
		System.out.println("파우더 재료로 출력합니다.");
	}
	@Override
	public String toString() {
		
		return "재료는 Powder입니다.";
	}
}
