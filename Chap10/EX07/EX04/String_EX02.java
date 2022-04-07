package Chap10.EX07.EX04;

class A{
	String name;
	A(String name){
		this.name = name;
	}
}

class B{
	String name;
	B(String name){
		this.name = name;
	}
	@Override
	public String toString() {		//패키지명.클래스@해쉬코드 ==>name필드의 값을 리턴
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((A)obj).name) {
			return true;
		}else {
			return false;
		}
	}
}

public class String_EX02 {

	public static void main(String[] args) {
		String s1 = new String("안녕");
		String s2 = "안녕";
		
		System.out.println(s1);	//String 클래스는 toString()재정의 되어있다.
		System.out.println(s1.equals(s2)); 		//String클래스는 equals()재정의 되어있다.
			//값을 비교하도록 재정의
		
		A a = new A("안녕");
		A a2 = new A("안녕");
		System.out.println(a.equals(a2));
		
		B b1 = new B("안녕");
		B b2 = new B("안녕");
		
		System.out.println(b1);
	}

}
