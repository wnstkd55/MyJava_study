package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

/*		상속을 다루는 문제, 하위의 생성자에 super() 메소드 사용
  	실행파일도 압축해서 제출, (*.java, Fruit_App.zip)
  	완료시간 11:20
  
 */
class Fruit{
	String fruitName;	//과일 이름
	String color;		//과일 새깔
	int large;			//과일 크기
	
	
	
	public String toString(){	//과일의 정보를 출력하는 메소드
		return "";
	}
}

class Apple extends Fruit{
	public Apple(String fruit,String color, int large) {
		super.fruitName=fruit;
		super.color=color;
		super.large=large;
	}
	@Override
	public String toString() {
		return "<"+this.fruitName+"> 이고, 색깔은 <"+this.color+">, 크기는 <"+this.large+"> 입니다.";
	}
}

class Orange extends Fruit{
	public Orange(String fruit,String color, int large) {
		super.fruitName=fruit;
		super.color=color;
		super.large=large;
	}
	@Override
	public String toString() {
		return "<"+this.fruitName+"> 이고, 색깔은 <"+this.color+">, 크기는 <"+this.large+"> 입니다.";
	}
}

class Banana extends Fruit{
	public Banana(String fruit,String color, int large) {
		super.fruitName=fruit;
		super.color=color;
		super.large=large;
	}
	@Override
	public String toString() {
		return "<"+this.fruitName+"> 이고, 색깔은 <"+this.color+">, 크기는 <"+this.large+"> 입니다.";
	}
}


public class Fruit_Test {

	public static void main(String[] args) {
		ArrayList<Fruit> fruitList = new ArrayList<>();
		
		/*	1. 코드 작성 : 스캐너를 인풋받는 코드작성
		 	선택 >>
		 	========================================================
		 	1. 사과	|	2. 오렌지	| 3. 바나나 | 4. 출력	| 5. 프로그램 종료
		 	========================================================
		 	
		 	선택 >>1
		 	과일명 : 
		 	색깔 : 
		 	크기 : 
		 	
		 	2. 코드 작성 : 스캐너로 인풋 받은 값으로 각각의 객체를 생성해서 ArrayList에 저장
		 	
		 	3. 선택#4 일경우 ArrayList에 있는 모든 객체를 끄집어 와서 객체를 출력할때, Enhanced For문 사용
		 		출력결과 : 
		 		//과일의 이름: <사과> 이고, 색깔은 <빨간색>, 크기는 <10> 입니다.
		 		//과일의 이름: <오렌지> 이고, 색깔은 <오렌지색>, 크기는 <20> 입니다.
		 		//과일의 이름: <바나나> 이고, 색깔은 <노란색>, 크기는 <30> 입니다.
		 */
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		while(run) {
			 System.out.println("---------------------------------------------------");
	         System.out.println("1. 사과	|2. 오렌지| 3. 바나나 | 4. 출력| 5. 프로그램 종료");
	         System.out.println("----------------------------------------------------");
	         System.out.println("선택>>");
	         int selectNO = sc.nextInt();
	         
	         	if(selectNO == 1) {
		            System.out.println("과일 이름: ");
		            String f_name = sc.next();
		            System.out.println("과일 색깔: ");
		            String f_color = sc.next();
		            System.out.println("과일 크기: ");
		            int f_size = sc.nextInt();
		            
		            Apple apple = new Apple(f_name, f_color, f_size);
		            fruitList.add(apple);
		            System.out.println(f_name+"이 입력되었습니다.");
		         }else if(selectNO == 2) {
		        	 System.out.println("과일 이름: ");
			            String f_name = sc.next();
			            System.out.println("과일 색깔: ");
			            String f_color = sc.next();
			            System.out.println("과일 크기: ");
			            int f_size = sc.nextInt();
			            
			            Orange orange = new Orange(f_name, f_color, f_size);
			            fruitList.add(orange);
			            System.out.println(f_name+"이 입력되었습니다.");
		         }else if(selectNO==3) {
		        	 System.out.println("과일 이름: ");
			            String f_name = sc.next();
			            System.out.println("과일 색깔: ");
			            String f_color = sc.next();
			            System.out.println("과일 크기: ");
			            int f_size = sc.nextInt();
			            
			            Banana banana = new Banana(f_name, f_color, f_size);
			            fruitList.add(banana);
			            System.out.println(f_name+"이 입력되었습니다.");
		         }else if(selectNO==4) {
		            for( Fruit f : fruitList) {
		            	System.out.println(f);
		            }
		         }else if(selectNO==5) {
		            break;
			            
		         }
		}
		sc.close();
	}

}
