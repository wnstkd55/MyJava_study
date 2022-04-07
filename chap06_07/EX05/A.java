package chap06_07.EX05;

		//접근 제어자 : public, protected, default, private
			//클래스 이름, 필드명, 메소드명, 생성자명 <<==접근 제어자가 반드시 할당이 되어있습니다.
			//클래스 이름 : public, default
		
public class A {

	int m = 3;		//필드의 기본 접근제어자는 default : 생략됨, 같은 패키지 내에서만 접근
	int n = 4;				// default : 같은 패키지 내에 다른 클래스에서 접근 가능 
											//다른 패키지의 클래스에서는 접근이 불가.
	public int k;
	
						// private : 외부 클래스에서 접근을 불가
	
	void print() {		//default : 같은 패키지내의 클래스에서만 사용 가능
		System.out.println("임포트 성공 " + m + " , " + n);
	}
	public void print2() {
		System.out.println("외부 패키지의 다른 클래스에서 접근 가능");
		
	}
	public static void main(String[] args) {
		
	}

}
