package Ex;

class Student{
	//자바는 다중 상속이 불가, 자바의 모든 클래스는 Object클래스의 자식클래스이다.
		//Object클래스에서 정의한 필드나 메소드를 재사용할 수 있다.
	String name;		//학생이름
	int StudentID;		//학번
	int kor;			//국어점수
	int eng;			//영어점수
	int math;			//수학점수
	int sum;			//점수 합
	double avg;			//점수 평균
	
	void hobby() {
		System.out.println("각 학생의 취미는 입니다.");
	}

	@Override
	public String toString() {	//Object클래스의 메소드, 객체 자체를 출력할때, [패키지명.클래스명@해쉬코드]
		return "이름: "+name+", 학번: "+StudentID+", 국어: "+kor+", 영어: "+eng+", 수학: "
					+math+", 합계: "+sum+", 평균: "+avg;
		
	}
	
	

}

class S_철수 extends Student{
	
	S_철수(String n, int i, int k, int e, int m){			//생성자 : 1. 클래스명과 동일 2. return타입이 없어야된다. 
		super.name=n;		//super 부모클래스, this 자신의 객체
		super.StudentID=i;
		super.kor=k;
		super.eng=e;
		super.math=m;
		super.sum = k+e+m;
		super.avg = (double)sum/3;			//평균을 계산할때는 (double)로 캐스팅
				
	}
	
	@Override
	void hobby() {
		System.out.println("철수의 취미는 낚시입니다.");
	}
	
}

class S_영희 extends Student{

	S_영희(String n, int i, int k, int e, int m){
		super.name=n;
		super.StudentID=i;
		super.kor=k;
		super.eng=e;
		super.math=m;
		super.sum=0;
		
		sum = k+e+m;
		avg = (double)sum/3;
		
				
	}
	
	@Override
	void hobby() {
		System.out.println("영희의 취미는 쇼핑입니다.");
	}
	
}

class S_영식 extends Student{

	S_영식(String n, int i, int k, int e, int m){
		super.name=n;
		super.StudentID=i;
		super.kor=k;
		super.eng=e;
		super.math=m;
		sum = k+e+m;
		avg = sum/3.0;
				
	}
	
	@Override
	void hobby() {
		System.out.println("영식의 취미는 축구입니다.");
	}
	
}
public class Quiz03 {

	public static void main(String[] args) {
		
		Student s1 = new S_철수("철수",2232,80,85,95);
		Student s2 = new S_영희("영희",1100,80,80,75);
		Student s3 = new S_영식("영식",9235,95,90,80);
		
		Student[] arr = {s1,s2,s3};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].hobby();
			
		}
		
		System.out.println("============================================================================");
		
		for(Student k : arr) {
			System.out.println(k);
			k.hobby();
		}
		
	}

}
