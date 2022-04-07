package Chap14.Test;

class MyAllException extends Exception{		//�Ϲݿ���(checked Exception) - ���� ����
	public MyAllException() {
		super();
	}
	public MyAllException(String message) {		//���� �޼��� ���, e.getMessage()
		super(message);
	}
}

class A{
	//private : ĸ��ȭ, ��ü������ �ٷ� ���� ���� ���ϵ��ΰ� ����
		//������, setter <== ���� �� �ʵ��� ���� �Ҵ�.
	private String season;
	private String week;
	private int scoreKor;
	private int scoreEng;
	private String userID;
	
	//�ϳ��� �޼ҵ�� ó��
	void studentInfo(String season, String week, int scoreKor, int scoreEng, String userID) throws MyAllException {
		if(season!="��" && season!="����" && season!="����" && season!="�ܿ�") {
			throw new MyAllException("���ܹ߻� : �� ���� ���� �ܿ︸ �Է��ϼ���");
		}else if(week!="��" && week!="ȭ" && week!="��" && week!="��" && week!="��" && week!="��" && week!="��") {
			throw new MyAllException("���ܹ߻� : �� ȭ �� �� �� �� �� �߿� �Է��ϼ���");
		}else if(scoreKor<0 || scoreKor>100) {
			throw new MyAllException("���ܹ߻� : 0~100������ ������ �Է��ϼ���");
		}else if(scoreEng<0 || scoreEng>100) {
			throw new MyAllException("���ܹ߻� : 0~100������ ������ �Է��ϼ���");
		}else if(userID.length()<12 || userID.length()>20) {
			throw new MyAllException("���ܹ߻� : 12~20�ڻ����� ���ڸ� ��������");
		}else {
			System.out.println("���������� ���� ��� �� �ԷµǾ����ϴ�.");
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
			a1.studentInfo("��", "��", 80, 90, "aaaaaaaaaaaaabb");
		}catch(MyAllException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
