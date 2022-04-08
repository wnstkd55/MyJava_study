package Chap19.EX03;

import java.nio.charset.Charset;

public class CreateChasetObject {

	public static void main(String[] args) {
		//문자 엔코딩 설정을 적용하는 방법
		//1.Charset cs1 = Charset.defaultCharset(); <== 시스템의 기본 설정을 로드(엔코딩 타입)
		
		Charset cs1 = Charset.defaultCharset(); 	//정적 메소드, 시스템의 기본 설정된 charset을 로드
		
		System.out.println(cs1);  //MS949 --> x-windows-949(MS949 확장)
		
		//2. Charset.forName("MS949") <==직접 할당해서 사용.
		Charset cs2 = Charset.forName("MS949");
		System.out.println(cs2);
	
		Charset cs3 = Charset.forName("UTF-8");
		System.out.println(cs3);
		
		Charset cs4 = Charset.forName("EUC_KR"); // <== 존재하지 않는 인코딩을 넣으면 예외가 발생
		System.out.println(cs4);
		
		System.out.println();
		
		System.out.println(Charset.isSupported("MS949"));
		System.out.println(Charset.isSupported("UTF-8"));
		System.out.println(Charset.isSupported("EUC-KR"));
		System.out.println(Charset.isSupported("UTF-16"));
		
	}

}
