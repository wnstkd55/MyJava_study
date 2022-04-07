package chap06_07.EX02;


//다양한 타입의 메소드형식(리턴타입이 있는경우 (int, double, String...),
	//리턴타입이 없느 경우는 void 사용
public class ExternalCallMethod {

	public static void main(String[] args) {
		//객체 생성
		A a = new A();		//같은 패키지 내의 클래스는 import없이 호출해서 사용이 가능하다.
		
		//메소드 호출
		a.print();
		int k = a.data();		// 3
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println(result); 	//8.2
		
		a.printMethod(5); //1~12사이의 값
		a.printMethod(25);
		
		//주의 : 
		
		System.out.println(a.data());	//출력구문에 호출가능한 메소드(리턴이 있는 메소드,)
		//System.out.println(a.print());	//오류발생
		a.print();		//return값이 없기때문에 바로 호출해야됨.
		System.out.println(a.sum(4, 10.5));
		//System.out.println(a.printMethod(3));	//오류발생
		a.printMethod(3);
		
	}

}
