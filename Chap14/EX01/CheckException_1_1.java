package Chap14.EX01;

public class CheckException_1_1 {

	public static void main(String[] args) {
		
		try {
		System.out.println(10 / 0); 	//프로그램이 비정상 종료되어버림
									//예외에 대한 처리
		} catch(ArithmeticException e) {
			//try{}에서 오류가 발생할 경우에 작동
//			e.printStackTrace();	//오류에 대한 자세한 정보를 출력
			System.out.println("0을 넣을 수 없습니다.");
			
			//catch블락의 설정을 하지 않아도 예외처리가 된것이다.
		} finally {
			// try{} 오류가 없어도 작동(O), 오류가있어도 (O)
			// try{}가 작동되면 항상 작동
			// 객체를 사용 후 객체의 메모리를 제거할때	,	ex) sc.close();
			System.out.println("finally{}은 항상 호출됩니다");
		}
		
		System.out.println("프로그램을 정상종료합니다."); 			//정상 종료
		
	}

}
