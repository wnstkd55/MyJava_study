package Chap10.EX07.EX04;

public class String_Ex {

	public static void main(String[] args) {
		
		String s0=new String("안녕");
		
		String s1 = "안녕";			//String은 참조변수
		
		System.out.println(s0);		//String는 객체를 출력할때 toString()재정의 되어있다.
		System.out.println(s1);
	}

}
