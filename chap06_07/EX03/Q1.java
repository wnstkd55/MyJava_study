package chap06_07.EX03;

class Car{
	String company;		//필드(인스턴스필드)의 company를 알려주는 this, Heap메모리에 저장
	String model;			//인스턴스 : 객체화를했을때 사용 가능한 필드.
	String color;			//[필드명 : 필드의 값]은 Heap 영역에 저장
	double maxSpeed;
	
	
	
	Car(String c, String mo, String co, double m){
		this.company = c;		//this 키는 객체의 필드의 변수를 뜻한다.
		this.model = mo;		//3개의 변수 모두가 동일할 경우 객체의 필드의 변수를 알려주는 역할
		this.color = co;
		maxSpeed = m;			//this 생략할수있다.(다르면)
	}
	
	void work() {					//메소드(인스턴스 메소드) : Heap영역의 메소드명과 포인터를 저장하고있다.
		System.out.print(company);		//메소드의 전체 구문은 class영역의 메소드 영역에 저장
		System.out.print(model);
		System.out.print(color);
		System.out.println(maxSpeed);
	}
}

public class Q1 {
	public static void main(String[] args) {
		//생성자를 통해서 기본값을 할당 후 메모리에 내용을 work() 메소드를 사용해서 출력
		
		Car car = new Car("kia ","k7 ","black ",240);
		Car car2 = new Car("bmw ","x7 ","red ",300);
		car.work();
		System.out.println("=================");
		
		car2.work();
		
	}
}
