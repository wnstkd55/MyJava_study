package Chap14.Test;

class MyAllException extends Exception{		//일반예외(checked Exception) - 구문 오류
	public MyAllException() {
		super();
	}
	public MyAllException(String message) {		//예외 메세지 출력, e.getMessage()
		super(message);
	}
}

class A{
	//private : 캡슐화, 객체생성후 바로 접근 하지 못하도로고 설정
		//생성자, setter <== 제어 후 필드의 값을 할당.
	private String season;
	private String week;
	private int scoreKor;
	private int scoreEng;
	private String userID;
	
	//하나의 메소드로 처리
	void studentInfo(String season, String week, int scoreKor, int scoreEng, String userID) throws MyAllException {
		if(season!="봄" && season!="여름" && season!="가을" && season!="겨울") {
			throw new MyAllException("예외발생 : 봄 여름 가을 겨울만 입력하세요");
		}else if(week!="월" && week!="화" && week!="수" && week!="목" && week!="금" && week!="토" && week!="일") {
			throw new MyAllException("예외발생 : 월 화 수 목 금 토 일 중에 입력하세요");
		}else if(scoreKor<0 || scoreKor>100) {
			throw new MyAllException("예외발생 : 0~100까지의 정수만 입력하세요");
		}else if(scoreEng<0 || scoreEng>100) {
			throw new MyAllException("예외발생 : 0~100까지의 정수만 입력하세요");
		}else if(userID.length()<12 || userID.length()>20) {
			throw new MyAllException("예외발생 : 12~20자사이의 문자만 넣으세요");
		}else {
			System.out.println("정상적으로 값이 모두 잘 입력되었습니다.");
			this.season = season;
			this.week = week;
			this.scoreKor=scoreKor;
			this.scoreEng=scoreEng;
			this.userID=userID;
		}
		System.out.printf(season + "," +week+","+scoreKor+","+scoreEng+","+userID);
	}
	
}

public class EX1 {

	public static void main(String[] args) {
		A a1 = new A();
		
		try {
			a1.studentInfo("봄", "월", 80, 90, "aaaaaaaaaaaaabb");
		}catch(MyAllException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
