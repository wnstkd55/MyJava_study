package Chap14.EX05;
// 자동리소스(객체) 제거

import java.io.Closeable;

//필드의 값 할당. 생성자 호출시 필드의 값을 부여

class Abc implements AutoCloseable{
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg;		//평균 계산
	
	Abc(String name, int studentID, int kor, int eng, int math){
		this.name=name;
		this.studentID=studentID;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.avg = (double)(kor+eng+math)/3;
	}
	
	@Override
	public void close() throws Exception{
		//초기화 전의 메모리의 값을 출력
		if((name != null) || (studentID != 0) || (kor != 0) || (eng != 0) || (math != 0) || (avg != 0.0) ){
			this.name = null;
			this.studentID = 0;
			this.kor = 0;
			this.eng = 0;
			this.math = 0;
			this.avg = 0.0;
			
			System.out.println("이름은: "+name + " 학번은: "+ studentID+ " 국어점수: "+kor+ " 영어점수: "+eng+" 수학점수: "+math+" 평균: "+avg);
		}
	}
}

public class EX_TryWithRecourse_3 {

	public static void main(String[] args) {
		//1. 객체의 모든 필드를 초기화하고 자동 close(); 호출
		try(Abc s2 = new Abc("홍길동",2022,80,95,75);){
			
		}catch(Exception e) {
			System.out.println("오류발생");
		}
		
		System.out.println("====================================================================");
		//2. 수동close, finally 블락에서 close()호출
		Abc s3 = null;
		try {
			s3 = new Abc("김유신",0323,80,55,100);
		}catch(Exception e){
			
		}finally {
			if((s3.name != null) || (s3.studentID != 0) || (s3.kor != 0) || (s3.eng != 0) || (s3.math != 0) || (s3.avg != 0.0) ) {
				try {
					s3.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		}
	}
}

