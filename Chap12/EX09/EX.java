package Chap12.EX09;

public class EX {

	public static void main(String[] args) {
		//1. SamsungPhoneŸ������ ����
		SamsungPhone s1 = new SamsungPhone();
		s1.printLogo();
		s1.sendCall();
		s1.receiveCall();
		s1.flash();
		
		System.out.println("=========================");
		
		//2. Phoneinterface�� ��ĳ����
		Phoneinterface s2 = new SamsungPhone();
		
		s2.printLogo();
		s2.sendCall();
		s2.receiveCall();
		SamsungPhone ss = (SamsungPhone)s2;		//s2 : PhoneInterface ==> SamsungPhone�� Ÿ�Ժ�ȯ
		ss.flash(); 	// flash�� �ٿ�ĳ���� �� ���
	}

}

// ����� ���� 12:00 , Java Program, ������ 20���� 60�� �̻�, �Ͽ��� ���� 10��




