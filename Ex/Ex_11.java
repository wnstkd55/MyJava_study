package Ex;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		//course배열(String 타입의 참조자료형)에 문자열값 할당(방크기 5)
		int score[] = {95, 88, 76, 62, 55};
		//score배열(int타입의 기본자료형)에 값 할당(방크기5)
		String name = null;		//String타입(참조자료형)의 name변수값 초기화를 위해 null로 초기화를했습니다.
		int i=0;				//int타입의 i변수값 초기화를 위해 0으로 초기화.
		Scanner sc = new Scanner(System.in);	//입력하기위한 스캐너 사용
		System.out.println("프로그램을 종료하려면 \"그만\"을 입력하세요. ");	// ""안에 ""따음표를 쓰기위해선 \"\"를 쓰면 된다.
		
		while(true) {			// 특정 조건을 만족 할때 까지 계속 루프 돌아감.
			System.out.println("과목 이름 >> ");
			name=sc.next();			//입력한 과목(String)값을 name변수에 넣기
			if(name.equals("그만")) {								//주의 : name은 참조변수이기때문에 ==를 사용하지않고 equals를 사용한다.
				break;			//입력값이 "그만"일경우 break로 종료
			}
			for (i = 0; i<course.length; i++) {
				if(course[i].equals(name)) {		
					System.out.println(course[i]+"의 점수는 "+score[i]);
					break;
				}
				}
			if(i==course.length) {			// course.length값이 5이기 때문에 score영역에 값이 없기때문에 검색되지 않는다.
				System.out.println("없는 과목입니다.");
			}				//i 변수가 마지막 방까지 왔을때 검색이 안된 경우
			
		}
		sc.close();
		System.out.println("프로그램을 종료합니다...");
	}
}
/*
 * 기본 자료형일때 : == (값을 비교)
 * 참조 자료형일때 : == (참조하는 주소의 번지를 비교)
 * 
 * 참조 자료형일때 값을 비교하는 것 => str1.equals(str2)		<--참조변수 str1값과 str2에 들어가 있는 값을 비교.
 * */





//String에 값을 할당하는 2가지 방법
	/*
 	String에 값을 할당 할때 생성자를 통해서 할당. ==> 별도의 메모리 공간을 가지게 된다.
 	
 	String aa = new String("안녕");
	String bb = new String("안녕");
	System.out.println(aa);		==>안녕
	System.out.println(bb);		==>안녕
	
	if(aa == bb){						//메모리의 주소 값을 비교(aa,bb는 다른 메모리 주소를 갖는다.)
		System.out.println(true);
	}else{
		System.out.println(false);
	}	//false 출력		? = 주소가 다르기 때문
	
	String에 값을 리터럴 값(변수에 들어가는 값)을 바로 할당. ==> 메모리 공간을 공유한다.
	
	String a = "안녕";
	String b = "안녕";
	
	if(a == b){						//메모리의 주소 값을 비교(a,b는 같은 메모리 주소를 갖는다.)
		System.out.println(true);
	}else{
		System.out.println(false);
	}//	true	//  ?= 주소가 같기 때문
									//참조 자료형에서 '=='는 메모리의 주소를 비교한다.
									
									 
	*/


