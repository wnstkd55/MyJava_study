package Chap14.EX08;

import java.util.Scanner;

//1. Exception을 상속 받는 사용자 예외 - 일반예외
	// 1-1 점수가 음수인 경우 예외
	// 1-2 점수에 100점을 초과하는 경우 예외

class MinusException extends Exception{	//음수가 들어올 경우 강제 발생
	public MinusException() {
		super();		//부모의 생성자 호출
	}
	public MinusException(String message) {		//예외 메세지 출력, e.getMessage();
		super(message);
	}
}

class OverException extends Exception{	//100점을 초과하는 경우 예외
	public OverException() {
		super();
	}
	public OverException(String message) {		//예외 메세지 출력, e.getMessage();
		super(message);
	}
}

class AAA {
	int score;
	
	void checkScore(int score) throws MinusException, OverException {
		if(score < 0) {
			throw new MinusException("예외발생 : 음수는 넣을 수 없습니다.");
		}else if( score > 100) {
			throw new OverException("예외발생 : 100점이 넘는값은 입력할 수 없습니다.");
		}else {
			System.out.println("정상적으로 잘 입력되었습니다.");
			this.score = score;
			System.out.println("점수는 : " + this.score);
		}
	}
}

public class UserException {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요 >>>");
		int score = sc.nextInt();
		
		AAA s1 = new AAA();
		
		try {
			s1.checkScore(score);			//점수 입력
		} catch (MinusException | OverException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());	//예외발생 : 음수 또는 100을 넘을 수 없다.
		}
		
		
	}

}
