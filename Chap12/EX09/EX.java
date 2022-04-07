package Chap12.EX09;

public class EX {

	public static void main(String[] args) {
		//1. SamsungPhone타입으로 지정
		SamsungPhone s1 = new SamsungPhone();
		s1.printLogo();
		s1.sendCall();
		s1.receiveCall();
		s1.flash();
		
		System.out.println("=========================");
		
		//2. Phoneinterface로 업캐스팅
		Phoneinterface s2 = new SamsungPhone();
		
		s2.printLogo();
		s2.sendCall();
		s2.receiveCall();
		SamsungPhone ss = (SamsungPhone)s2;		//s2 : PhoneInterface ==> SamsungPhone로 타입변환
		ss.flash(); 	// flash는 다운캐스팅 후 출력
	}

}

// 토요일 오전 12:00 , Java Program, 객관식 20문제 60점 이상, 일요일 저녁 10시




