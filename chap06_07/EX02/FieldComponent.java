package chap06_07.EX02;

class Abc{
	int m = 3;		//필드(Heap에 저장)
	int n = 4;
	
	void work1(){		//메소드 (인풋값이 없는 메소드)
		int k =5;				// 지역변수 : (Stack 영역에 저장), 메소드가 종료시 없어진다.
		System.out.println(k);
		work2(3); //다른 메소드 호출
	}
	void work2(int i) {
		int j =4;		//지역 변수(Stack 공간에 변수와 값이 저장)
		System.out.println(i+j);
		
		int l;		//지역변수이므로 강제초기화가 되지않는다.(Stack)
		//l=0;		//지역변수는 초기값을 반드시 할당.
		//System.out.println(l);
	}
}

public class FieldComponent {

	public static void main(String[] args) {
		Abc abc = new Abc();
		
		System.out.println(abc.m);
		System.out.println(abc.n);
	}

}
