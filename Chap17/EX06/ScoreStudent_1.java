package Chap17.EX06;

import java.util.ArrayList;
import java.util.Scanner;
/*
 	1. 학생수 : 임의의 값을 입력했을때 ArrayList의 capacity 크기 지정
 	2. 점수 입력 : 입력받은 학생수에 따라서 점수 입력. ArrayList에 각각 객체로 저장
 	3. 점수 리스트 : ArrayList에 저장된 Student객체를 가져와서 score출력.
 	4. 분석 : 최고점수 : , 평균점수 : ,
 	5. 종료
 */


class Student{
	
	int score;
	Student(){}
	Student(int score) {
		this.score=score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}

public class ScoreStudent_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<Student>();

        boolean run = true;
        int studentNum = 0;			//while 블락 밖에서 선언, 전역변수
        
        while(run) {			//run : true
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");
            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                System.out.println("학생수를 입력하세요 : ");
                	//코드 작성 
                studentNum = scanner.nextInt();
                System.out.println("입력완료");
                
            } else if(selectNo == 2) {
            		//코드작성
            	if(studentNum == 0) {
            		System.out.println("학생수를 먼저 입력하세요.");
            	}else {
            		for (int i = 0; i < studentNum; i++) {
                		System.out.println(i + 1 + "번 학생의 점수를 입력하세요.");
                		int scoreInput = scanner.nextInt();
                		//인풋을 받아서 인풋 받은 갑을 Student객체의 score변수에 할당
                		//객체를 생성해서
                		Student student = new Student(scoreInput);	//기본 생성자를 사용해서 객체 생성, 직접score필드의 값을 할당
                		arr.add(student);	//ArrayList에 필드에 값을 할당한 객체를 ArrayList에 저장
                	}
                	System.out.println("입력완료");
            	}
            	
            	
            } else if(selectNo == 3) {
            		//코드작성, 점수리스트출력, ArrayList각 점수가 할당한 객체
            	for (int i = 0; i < arr.size(); i++) {
            		System.out.println((i + 1) + "번 학생 점수 : " + arr.get(i).score + "점");
            	}
            	
            } else if(selectNo == 4) {
            	//코드작성
            	int maxScore = 0;	//최대 점수를 받는 지역변수 선언 <초기값 할당>
            	int sum = 0;		//합계를 저장하는 지역변수	<초기값 할당>
            	//1. ArrayList의 객체를 가지고 온다. 2.Student객체의 score필드의 값을 가져와서 처리
            	for (int i = 0; i<arr.size(); i++) {
            		if (maxScore<arr.get(i).score) {
            			maxScore=arr.get(i).score;
            		}
                }
            	
            	for (int i = 0; i<arr.size(); i++) {
            		sum += arr.get(i).score;
            	}
            	//maxScore변수의 최종값을 적용후,sum = sum+student.score
              System.out.println("최고점수 : " + maxScore + "점");
              
              System.out.println("평균점수 : " + (float) sum / studentNum + "점");
         
            } else if(selectNo == 5) {
            	break;
              }
        }
        System.out.println ("프로그램 종료");
	}
}
