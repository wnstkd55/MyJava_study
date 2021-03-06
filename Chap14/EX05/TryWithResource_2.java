package Chap14.EX05;
//직접 생성한 객체에서 AutoCloseable를 사용해보기
	//try(객체생성구문) {} catch{} : 자동으로 close()된다 	//try (with Resource)
	//1. AutoCloseable 인터페이스의 close() 메소드를 오버라이딩 해야한다.
	
	//java.lang.Autocloseable 	: java.lang <== import문을 사용하지 않아도 된다.
	//java.lang.Object			:

	//예외를 처리하는 방법
	    //1. try catch를 사용해서 예외 처리	: 자신이 직접 예외를 처리하겠다.
		//2. throw를 통해서 예약처리			: 예외를 내가 처리하지않고 호추하는곳에서 예외를 처리하도록 미룬
			//예외 전달. 메소드에서 예외 전달

		//throw : 예외를 강제로 발생시킨다.
class A implements AutoCloseable{
	String resource;		//resource = null
	
	A(String resource){ 	//생성자의 매개변수로 String값을 받아서 메모리로 로딩
		this.resource = resource;
	}

	@Override
	public void close() throws Exception {	//close()메소드가 자동으로 호출된다.
												//throws -> 호출하는 메소드를 늦춘다.
		if(resource != null) {
			resource = null;
			System.out.println("리소스가 해제되었습니다.");
			System.out.println(resource);
		}
		
	}
}


public class TryWithResource_2 {

	public static void main(String[] args) {
		//1. 자동 리소스 해제 사용
		try(A a1 = new A("특정파일");){
		
		}catch (Exception e) {
			System.out.println("예외가 발생되었습니다.");
		}	//finally블락에 a1.close() 메소드를 자동으로 호출
		
		System.out.println("===============================");
		
		//2. 수동으로 리소스 해제
		A a2 = null;
		try {
			a2 = new A("생성자초기값할당");
		}catch(Exception e){
			
		}finally {
			if(a2.resource != null) {
				try {
					a2.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		}
		
		
		
	}

}
