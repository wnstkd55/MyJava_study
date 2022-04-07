package Chap10.EX05;

class AA{	//부모 클래스
	int m = 3;		//인스턴스 필드
	void print() {
		System.out.println("AA클래스");
	}
}
class BB extends AA{	
	int m = 4;		//인스턴스 필드
	@Override
	void print() {
		System.out.println("BB클래스");
	}
	
}
class CC extends AA{
	int m = 5;
	@Override
	void print() {
		System.out.println("CC클래스");
	}
}
public class OverlapinstanceField {

	public static void main(String[] args) {
		//1. 객체생성
		AA aa = new AA();
		BB bb = new BB();
		AA ab = new BB();
		
		CC cc = new CC();
		AA ac = new AA();
		
		//2. 인스턴스 필드 출력
		System.out.println(aa.m);				//3
		System.out.println(bb.m);				//4
		System.out.println(ab.m);				//3		//인스턴스필드는 오버라이딩 되지않는다.
		System.out.println("=================");
		System.out.println(cc.m);				//5
		System.out.println(ac.m);				//3
		
	}

}
