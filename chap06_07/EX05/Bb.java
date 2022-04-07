package chap06_07.EX05;

public class Bb {

	private int a = 1;		// private : 같은 클래스 내에서만 사용
	int b = 2;				// default : 같은 패키지내의 다른 클래스에서 접근 가능
	protected int c =3 ;	// protected : 같은패키지내에서 접근 가능 + 다른패키지에 접근가능(상속된 경우만 가능)
	public int d = 4;		// public : 다른패키지에서 접근이 가능 

		//private < default < protected < public

	private void print1() {		//같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
}

	void print2() {		//같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}

	protected void print3() {		//같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}

	public void print4() {		//같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}

}

