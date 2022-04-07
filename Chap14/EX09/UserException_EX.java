package Chap14.EX09;

import java.util.Scanner;

class seasonException extends Exception{
	public seasonException() {
		super();
	}
	public seasonException(String message) {
		super(message);
	}
}
class weekException extends Exception{
	public weekException() {
		super();
	}
	public weekException(String message) {
		super(message);
	}
}
class scoreKorException extends Exception{
	public scoreKorException() {
		super();
	}
	public scoreKorException(String message) {
		super(message);
	}
}
class scoreEngException extends Exception{
	public scoreEngException() {
		super();
	}
	public scoreEngException(String message) {
		super(message);
	}
}
class userIDException extends Exception{
	public userIDException() {
		super();
	}
	public userIDException(String message) {
		super(message);
	}
}



class A{
	String season;	//봄, 여름, 가을, 겨울 ("예외발생 : 봄, 여름, 가을, 겨울만  입력하세요");
	String week;		//월,화,수,목,금,토,일 ("예외발생 : 월,화,수,목,금,토,일 만 입력하세요");
	int scoreKor;		// 0 ~ 100값만 입력 ("예외 발생 : 0 ~ 100 까지 정수만 입력하세요");
	int scoreEng;		//0 ~ 100값만 입력 ("예외 발생 : 0 ~ 100 까지 정수만 입력하세요");
	String userID;		//12자 이상 20자 사이에 문자("예외발생: 12자 이상 20자 사이의 문자만 넣으세요");
	
	void checkseason(String season) throws seasonException {
		if(season.equals("봄")) {
			System.out.println("입력 오류가 없습니다.");
			this.season = season;
			System.out.println(" 계절은 "+season);
		}else if(season.equals("여름")) {
			System.out.println("입력 오류가 없습니다.");
			this.season = season;
			System.out.println(" 계절은 "+season);
		}else if(season.equals("가을")) {
			System.out.println("입력 오류가 없습니다.");
			this.season = season;
			System.out.println(" 계절은 "+season);
		}else if(season.equals("겨울")) {
			System.out.println("입력 오류가 없습니다.");
			this.season = season;
			System.out.println(" 계절은 "+season);
		}else {
			throw new seasonException("예외발생 : 봄, 여름, 가을, 겨울만  입력하세요");
		}
	}
	void checkweek(String week) throws weekException {
		if(week.equals("월")) {
			System.out.println("입력 오류가 없습니다.");
			this.week = week;
			System.out.println(" 요일은 "+week);
		}else if(week.equals("화")){
			System.out.println(" 입력 오류가 없습니다.");
			this.week = week;
			System.out.println("요일은 "+week);
		}else if(week.equals("수")){
			System.out.println(" 입력 오류가 없습니다.");
			this.week = week;
			System.out.println(" 요일은 "+week);
		}else if(week.equals("목")){
			System.out.println("입력 오류가 없습니다.");
			this.week = week;
			System.out.println(" 요일은 "+week);
		}else if(week.equals("금")){
			System.out.println("입력 오류가 없습니다.");
			this.week = week;
			System.out.println("요일은 "+week);
		}else if(week.equals("토")){
			System.out.println("입력 오류가 없습니다.");
			this.week = week;
			System.out.println(" 요일은 "+week);
		}else if(week.equals("일")){
			System.out.println("입력 오류가 없습니다.");
			this.week = week;
			System.out.println(" 요일은 "+week);
		}else {
			throw new weekException("예외발생 : 월,화,수,목,금,토,일 만 입력하세요");
		}
	}
	void ckeckscoreKor(int scoreKor) throws scoreKorException {
		if((scoreKor<0) || (scoreKor>100)) {
			throw new scoreKorException("예외발생 : 0 ~ 100 까지 정수만 입력하세요");
		}else {
			System.out.println("입력 오류가 없습니다.");
			this.scoreKor = scoreKor;
			System.out.println(" 국어점수는 "+scoreKor);
		}
	}
	void ckeckscoreEng(int scoreEng) throws scoreEngException{
		if((scoreEng<0) || (scoreEng>100)) {
			throw new scoreEngException("예외발생 : 0 ~ 100 까지 정수만 입력하세요");
		}else {
			System.out.println("입력 오류가 없습니다.");
			this.scoreEng = scoreEng;
			System.out.println(" 영어 점수는 "+scoreEng);
		}
	}
	void checkuserID(String userID) throws userIDException {
		if((userID.length()<12) || (userID.length()>20)) {
			throw new userIDException("예외발생: 12자 이상 20자 사이의 문자만 넣으세요");
		}else {
			System.out.println("입력 오류가 없습니다.");
			this.userID = userID;
			System.out.println(" 아이디는 "+userID);
		}
	}
}

public class UserException_EX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);					//여러개의 값을 한번에 받기위해서 배열을 쓰기로함
		System.out.println("공백을 유지하고 입력해주세요 >>>");
		
		String s1 = sc.nextLine();			//공백을 받기위해서 nextLine으로 sc입력 받기(next는 공백 못받음)
		String[] arr = s1.split(" ");		//공백으로 값분배 후 방에 값 할당
		
		A a1 = new A();
		
		try {
			a1.checkseason(arr[0]);								// 오류받을것이 5개 이므로 방은 0~4번까지
		} catch (seasonException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("============================");
		try {
			a1.checkweek(arr[1]);
		} catch (weekException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("============================");
		try {
			a1.ckeckscoreKor(Integer.parseInt(arr[2]));				// ! - split으로 나누면 문자열로 되기때문에 궁금한 정수형으로
																	//받기위해선 형변환이 필요(Integer.parseInt())
		} catch (scoreKorException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("============================");
		try {
			a1.ckeckscoreEng(Integer.parseInt(arr[3]));
		} catch (scoreEngException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("============================");
		try {
			a1.checkuserID(arr[4]);
		} catch (userIDException e) {
			System.out.println(e.getMessage());
		}

	}

}
