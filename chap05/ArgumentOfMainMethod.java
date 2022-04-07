package chap05;

public class ArgumentOfMainMethod {
	public static void main(String[] ar) {		//메인메소드[함수]
		//메소드의 기본구조
		/*
		 
		 	void main(String[] args){	//void : 리턴값이 없음을 뜻함.
		 		메소드를 호출시 실행할 코드;		//main : 메소드명
		 	}								// (인풋 매개변수) 
		 */
		
		String a = ar[0];	// "안녕하세요" : 문자열 전송
		String b = ar[1];	// 3 : 정수
		String c = ar[2];	// 3.8 : 실수
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println();
		
		//main 메소드에 인자값으로 정수나 실수를 넘겨줄때 String으로 변환이 됨.
		System.out.println(b + 1);		// ? 31이 나온 이유 : b에 String이라는 문자열을 할당했기때문에 +1은 문자열로 합치는걸로 됨.
		System.out.println(c + 1);		// 3.81
		System.out.println();
		
		//String을 정수나 더블형으로 변환해서 연산시켜줘야된다.
		int d = Integer.parseInt(b);	// b(String) ==> Integer타입으로 변환
		double e = Double.parseDouble(c);	//c(String) ==> Double타입으로 변환
		
		System.out.println(d+1);
		System.out.println(e+1);
		
		
	}
	
}
