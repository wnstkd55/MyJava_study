package Chap19.EX03;

import java.io.UnsupportedEncodingException;

//EUCKR - 한국표준, 한글 표현 가능 전체중 표기 가능한것만 구성되어 있음. 약 11,000 --> 2200만 표기, 8000자는 표기 안됨.
	//영문 : 1byte
	//한글 : 2byte
//MS-949 - Microsoft사에서 개발한 한글 표기 방식. 11000모두를 표기할 수 있다.
	// 영문 : 1byte
	// 한글 : 2byte

//UTF-8: 모든서버 (Web, FTP...),git Mac <가변길이>
	//영문 : 1byte
	//한글 : 3byte
//UTF-16 : 
	//영문,한글 모두 2byte로 처리.

//문자를 해당 인코딩 타입으로 바이트 스트림으로 생성한 경우, 해당 인코딩 타입으로 조합을 해야 깨어지지 않는다.

//이클립스에서 인코딩 타입 설정3가지.
	//1.전역에서 설정
	//2. 프로젝트에서 설정 : 
	//3. 파일에서 설정
		//우선순위 파일>프로젝트>전역


public class EUCKR_VS_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException{
		
		//EUCKR vs MS949
		
		byte[]b1 = "a".getBytes("EUC-KR"); //문자를 byte로 변환
		//예외가 발생됨.(Unsupported EncodingException) <==오타가 발생할 경우 인코딩 할 수 없는 예외가 발생이됨.
		byte[]b2 = "a".getBytes("MS949");
		
		System.out.println(b1.length); //1
		System.out.println(b2.length);//1
		
		System.out.println(new String(b1,"EUC-KR"));	
		System.out.println(new String(b2,"MS949"));
		
		System.out.println();
		
		//2. 한글을 byte로 내보내고 String으로 가져오기
		
		byte[]b3 = "가".getBytes("EUC-KR"); 		//11,000wk wnd 2000만 표기
		byte[]b4 = "가".getBytes("MS949");
		
		System.out.println(b3.length); //2
		System.out.println(b4.length);//2
		
		System.out.println(new String(b3,"EUC-KR"));	
		System.out.println(new String(b4,"MS949"));
	}

}
