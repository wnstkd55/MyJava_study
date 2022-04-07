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
	String season;	//��, ����, ����, �ܿ� ("���ܹ߻� : ��, ����, ����, �ܿ︸  �Է��ϼ���");
	String week;		//��,ȭ,��,��,��,��,�� ("���ܹ߻� : ��,ȭ,��,��,��,��,�� �� �Է��ϼ���");
	int scoreKor;		// 0 ~ 100���� �Է� ("���� �߻� : 0 ~ 100 ���� ������ �Է��ϼ���");
	int scoreEng;		//0 ~ 100���� �Է� ("���� �߻� : 0 ~ 100 ���� ������ �Է��ϼ���");
	String userID;		//12�� �̻� 20�� ���̿� ����("���ܹ߻�: 12�� �̻� 20�� ������ ���ڸ� ��������");
	
	void checkseason(String season) throws seasonException {
		if(season.equals("��")) {
			System.out.println("�Է� ������ �����ϴ�.");
			this.season = season;
			System.out.println(" ������ "+season);
		}else if(season.equals("����")) {
			System.out.println("�Է� ������ �����ϴ�.");
			this.season = season;
			System.out.println(" ������ "+season);
		}else if(season.equals("����")) {
			System.out.println("�Է� ������ �����ϴ�.");
			this.season = season;
			System.out.println(" ������ "+season);
		}else if(season.equals("�ܿ�")) {
			System.out.println("�Է� ������ �����ϴ�.");
			this.season = season;
			System.out.println(" ������ "+season);
		}else {
			throw new seasonException("���ܹ߻� : ��, ����, ����, �ܿ︸  �Է��ϼ���");
		}
	}
	void checkweek(String week) throws weekException {
		if(week.equals("��")) {
			System.out.println("�Է� ������ �����ϴ�.");
			this.week = week;
			System.out.println(" ������ "+week);
		}else if(week.equals("ȭ")){
			System.out.println(" �Է� ������ �����ϴ�.");
			this.week = week;
			System.out.println("������ "+week);
		}else if(week.equals("��")){
			System.out.println(" �Է� ������ �����ϴ�.");
			this.week = week;
			System.out.println(" ������ "+week);
		}else if(week.equals("��")){
			System.out.println("�Է� ������ �����ϴ�.");
			this.week = week;
			System.out.println(" ������ "+week);
		}else if(week.equals("��")){
			System.out.println("�Է� ������ �����ϴ�.");
			this.week = week;
			System.out.println("������ "+week);
		}else if(week.equals("��")){
			System.out.println("�Է� ������ �����ϴ�.");
			this.week = week;
			System.out.println(" ������ "+week);
		}else if(week.equals("��")){
			System.out.println("�Է� ������ �����ϴ�.");
			this.week = week;
			System.out.println(" ������ "+week);
		}else {
			throw new weekException("���ܹ߻� : ��,ȭ,��,��,��,��,�� �� �Է��ϼ���");
		}
	}
	void ckeckscoreKor(int scoreKor) throws scoreKorException {
		if((scoreKor<0) || (scoreKor>100)) {
			throw new scoreKorException("���ܹ߻� : 0 ~ 100 ���� ������ �Է��ϼ���");
		}else {
			System.out.println("�Է� ������ �����ϴ�.");
			this.scoreKor = scoreKor;
			System.out.println(" ���������� "+scoreKor);
		}
	}
	void ckeckscoreEng(int scoreEng) throws scoreEngException{
		if((scoreEng<0) || (scoreEng>100)) {
			throw new scoreEngException("���ܹ߻� : 0 ~ 100 ���� ������ �Է��ϼ���");
		}else {
			System.out.println("�Է� ������ �����ϴ�.");
			this.scoreEng = scoreEng;
			System.out.println(" ���� ������ "+scoreEng);
		}
	}
	void checkuserID(String userID) throws userIDException {
		if((userID.length()<12) || (userID.length()>20)) {
			throw new userIDException("���ܹ߻�: 12�� �̻� 20�� ������ ���ڸ� ��������");
		}else {
			System.out.println("�Է� ������ �����ϴ�.");
			this.userID = userID;
			System.out.println(" ���̵�� "+userID);
		}
	}
}

public class UserException_EX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);					//�������� ���� �ѹ��� �ޱ����ؼ� �迭�� �������
		System.out.println("������ �����ϰ� �Է����ּ��� >>>");
		
		String s1 = sc.nextLine();			//������ �ޱ����ؼ� nextLine���� sc�Է� �ޱ�(next�� ���� ������)
		String[] arr = s1.split(" ");		//�������� ���й� �� �濡 �� �Ҵ�
		
		A a1 = new A();
		
		try {
			a1.checkseason(arr[0]);								// ������������ 5�� �̹Ƿ� ���� 0~4������
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
			a1.ckeckscoreKor(Integer.parseInt(arr[2]));				// ! - split���� ������ ���ڿ��� �Ǳ⶧���� �ñ��� ����������
																	//�ޱ����ؼ� ����ȯ�� �ʿ�(Integer.parseInt())
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
