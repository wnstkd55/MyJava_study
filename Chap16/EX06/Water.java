package Chap16.EX06;

//GenericPrinter에 사용될 객체[재료]

public class Water {
	public void doPrinting() {
		System.out.println("물 재료로 출력합니다.");
	}
	@Override
	public String toString() {
		
		return "재료는 Water입니다.";
	}
}
