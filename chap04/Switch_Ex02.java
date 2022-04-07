package chap04;

public class Switch_Ex02 {

	public static void main(String[] args) {
		
		//Switch 문에서 Break를 처리 하지 않았을때 : 해당 case로 이동한 후 하위의 case를 모두 실행한다.
		int value1 = 2;
		
		switch(value1) {
		case 1 :
			System.out.println("A");
		case 2 :
			System.out.println("B");
		case 3 :
			System.out.println("C");
		default:
			System.out.println("D");
		}
		
		System.out.println("==============");
	//2. break가 포함됨 경우
		int value2 = 3;
		
			switch(value2) {
			case 1 :
			System.out.println("A");
			break;
			case 2 :
			System.out.println("B");
			break;
			case 3 :
			System.out.println("C");
			break;
			default:
			System.out.println("D");	//스위치문의 마지막(default)는 break를 생략할 수 있다.
			}
		System.out.println("=================");
		
		value2 = 2;
		
		if(value2 == 1) {
			System.out.println("A");
		}
		else if (value2 == 2) {
			System.out.println("B");
		}
		else if (value2 == 3) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		System.out.println("==================");
		/*
		 * switch문 사용해서 점수가 7점 이상은 pass, 7점 이하는 fail을 출력(점수 : 1~10)
		 */
		
		int a = 5;
		
		switch(a) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("점수"+a+"는 pass입니다.");
			break;
		default:
			System.out.println("fail");
		}
		
	}

}
