package Chap10.EX06;

//this()와 super()의 혼용.	<== 생성자 호출, 생성자 내부, 첫라인
	//this() : 자신 객체의 생성자 호출
	//super() : 부모 객체의 생성자 호출

class AAAA{
	AAAA(){
		this(3);
		System.out.println("AAAA생성자 1");
	}
	AAAA(int a){
		System.out.println("AAAA생성자 2");
	}
}

class BBBB extends AAAA{
	BBBB(){
		this(3);
		System.out.println("BBBB생성자 1");
	}
	BBBB(int a){
		System.out.println("BBBB생성자 2");
	}
}
public class SuperMethod_2 {

	public static void main(String[] args) {
		//1. 객체 생성
		AAAA aaaa1 = new AAAA();
		System.out.println("====================");
		
		AAAA aaaa2 = new AAAA(3);
		System.out.println("====================");
		
		//2. 자식의 객체 생성
		BBBB bbbb1 = new BBBB();
		System.out.println("=====================");
		
		BBBB bbbb2 = new BBBB(5);
		
		
	}

}
