package Chap10.EX04;

class Human {		//부모클래스
	String name;	//인스턴스 필드 : 객체화시켜야 사용 가능, Heap에 저장
	int age;
	
	void eat() {	//인스턴스 메소드 : 객체화시켜야 사용가능, Heap(pointer), 클래스영역내의 인스턴스 메소드 영역에
								// 실제 메소드의 코드가 저장
		System.out.println("사람이 먹습니다.");
	}
	
	void sleep() {
		System.out.println("사람이 잠을잡니다.");
	}
}

class Student extends Human{
	int studentID;
	void goToSchool() {
		System.out.println("학생은 학교에 갑니다.");
	}
}

class Worker extends Human{
	int workID;
	void goToWork() {
		System.out.println("직장인은 회사에 갑니다.");
	}
}

public class Test01 {

	public static void main(String[] args) {

		Human h = new Human();		//부모클래스
		h.name = "홍길동";
		h.age = 30;
		h.eat();
		h.sleep();
		
		Student s = new Student();	//자식클래스 : 자식 클래스는 부모클래스의 필드와 메소드를 상속
		s.name="신사임당";		//부모클래스의 필드
		s.eat();				//부모클래스의 메소드
		s.studentID=22131;		//자식클래스의 필드
		s.goToSchool(); 		//자식클래스의 메소드
		
		Worker w = new Worker();
		w.name="BTS";		//부모클래스의 필드
		w.eat();			//부모클래스의 메소드
		w.workID=2123;		//자식클래스의 필드
		w.goToWork();		//자식클래스의 메소드
	
		Human h1 = new Student();		// 업캐스팅 : 자식 => 부모 타입으로 형변환
								//h : Human, Student타입이 모두 저장, Human만 접근 가능
		h.name = "이순신";
		h.eat();
		System.out.println("====================");
		
		
		//다운캐스팅 : 부모 ==> 자식으로 타입변환		, if 조건을 사용해서 instanceof를 사용해서 처리
			//런타임 오류
		System.out.println(h1 instanceof Human);		//true
		System.out.println(h1 instanceof Student);		//true
		
		
		if(h1 instanceof Student) {
			Student s2 = (Student)h1;
			s2.studentID = 3324;
			s2.goToSchool();
		}
		
		if(h1 instanceof Worker) {
			Worker w4 = (Worker)h1;
		}
		
			//오류가 발생하지 않는다.(컴파일 오류는 아니다.)
									//실행시 오류(런타임 오류)
		System.out.println(h1 instanceof Worker);	//false
		
		
		
		
		
	}

}
