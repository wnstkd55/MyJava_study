package chap05;

import java.util.Arrays;

public class MethodOfString {

	public static void main(String[] args) {
		//1. 문자열 길이(length())	: int타입으로 반환
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		
			//str1 : 참조변수, 객체, 인스턴스
		
		System.out.println(str1.length());	//str1 : 11자
		System.out.println(str2.length());	//str2 : 13
			//자바에서 length는 글자수를 뜻함 (한글)
		System.out.println();
		
		//2. 문자열 검색(charAt(), indexOf(), lastIndexOf())
		System.out.println(str1.charAt(1));		//1번방의 문자를 출력
		System.out.println(str2.charAt(1));		//1번방의 문자를 출력
		System.out.println();
		
		//indexOf() : 0번째 방에서 부터 마지막 방까지 글자의 방번호(인덱스index)를 출력
		//lastIndexOf() : 마지막방부터 0번째방으로 글자의 방번호를 출력
		
		System.out.println(str1.indexOf('a'));		//앞에서부터		7
		System.out.println(str1.lastIndexOf('a'));	//뒤에서부터		9
		System.out.println(str1.indexOf('a',8));	//8번방에서부터 오른쪽으로 검색시작		9
		System.out.println(str1.lastIndexOf('a',8));	//8번방에서부터 왼쪽으로 검색시작		7
		System.out.println(str1.indexOf("Java"));		//6번방부터 Java라는 문자열이 시작
		System.out.println(str1.lastIndexOf("Java"));	//6번
		System.out.println(str2.indexOf("하세요"));
		System.out.println(str2.lastIndexOf("하세요"));
		System.out.println(str1.lastIndexOf("bye"));		// <<중요>>-1 : 값이 존재하지 않는경우)
		System.out.println();
		
		//3. 문자열 변환 및 연결(String.valueOf(),cacat())
		//String.valueOf(기본자료형) : 기본자료형 ==> String으로 변환
		String str3 = String.valueOf(2.3);	//실수 2.3을 String형으로 변환
		String str4 = String.valueOf(false); 	//불린타입 false을 String으로 변함
		
		System.out.println(str3);
		System.out.println(str4);
		//concat() : 문자열과 문자열을 연결: + 연산자와 같음
		String str5 = str3.concat(str4); 		//2.3false
		System.out.println(str5);
		System.out.println();
		
		// concat()메소드에서 String.valueOf사용 ==> +(자동으로 타입변환) 
		String str6 = "안녕"+3;	//안녕3, +: 연산자를 사용할때 자동변화
		String str7 = "안녕".concat(String.valueOf(3));	//안녕3
				//concat을 사용할때 String타입으로 변환 필요
		
		System.out.println(str6);
		System.out.println(str7);
		System.out.println();
		
		//4.문자열 ==> byte[]타입으로 변환, 입출력값을 처리할때
			//(getBytes(),
			//문자열 ===> char[]	(toCharArray())
		String str8 = "Hello Java!";
		String str9 = "안녕하세요";
		
		//getBytes(): 문자열 ==> byte[]로 변환
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		
		System.out.println(Arrays.toString(array1));	//아스키 코드가 출력 (11)
		System.out.println(Arrays.toString(array2));	//
		
		//toCharArray()		문자열=>char[]  로 변환
		char[] array3 = str8.toCharArray();
		char[] array4= str9.toCharArray();
		
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
	
	
	}

}
