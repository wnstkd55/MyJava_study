package Chap14.EX08;

import java.util.Scanner;

//1. Exception�� ��� �޴� ����� ���� - �Ϲݿ���
	// 1-1 ������ ������ ��� ����
	// 1-2 ������ 100���� �ʰ��ϴ� ��� ����

class MinusException extends Exception{	//������ ���� ��� ���� �߻�
	public MinusException() {
		super();		//�θ��� ������ ȣ��
	}
	public MinusException(String message) {		//���� �޼��� ���, e.getMessage();
		super(message);
	}
}

class OverException extends Exception{	//100���� �ʰ��ϴ� ��� ����
	public OverException() {
		super();
	}
	public OverException(String message) {		//���� �޼��� ���, e.getMessage();
		super(message);
	}
}

class AAA {
	int score;
	
	void checkScore(int score) throws MinusException, OverException {
		if(score < 0) {
			throw new MinusException("���ܹ߻� : ������ ���� �� �����ϴ�.");
		}else if( score > 100) {
			throw new OverException("���ܹ߻� : 100���� �Ѵ°��� �Է��� �� �����ϴ�.");
		}else {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
			this.score = score;
			System.out.println("������ : " + this.score);
		}
	}
}

public class UserException {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� >>>");
		int score = sc.nextInt();
		
		AAA s1 = new AAA();
		
		try {
			s1.checkScore(score);			//���� �Է�
		} catch (MinusException | OverException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());	//���ܹ߻� : ���� �Ǵ� 100�� ���� �� ����.
		}
		
		
	}

}
